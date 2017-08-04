package com.mlycan.main.controller.admin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Species;
import com.mlycan.main.service.SpeciesService;

@Controller
@RequestMapping(value = { "species"})
public class SpeciesController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage,Integer parentId) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Species> speciess = speciesService.findAll(count, curpage,parentId);
		 for(Iterator it2 = speciess.iterator();it2.hasNext();){
            Species species = (com.mlycan.main.entity.Species) it2.next();
            List<Species> childSpecies = speciesService.findAll(null, null, species.getSpeciesId());
            species.setChildren(childSpecies);
         }

		Integer  total = speciesService.findAllCount();
		
		
		model.addAttribute(Constants.BEANS, speciess);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		return "admin/species/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer speciesId) {
		
		Species species = speciesService.findSpecies(speciesId);
		
		List<Species> species1= speciesService.findSpeciesByPid(0);
		
		model.addAttribute(Constants.BEANS, species1);

		model.addAttribute(Constants.BEAN, species);

		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		return "admin/species/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer speciesId,Integer parentId,String speciesName,Integer active,String comment) {
		
		speciesService.updateSpecies(speciesId,parentId,speciesName,active,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		return "redirect:/admin/species/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		List<Species> species= speciesService.findSpeciesByPid(0);
		
		model.addAttribute(Constants.BEANS, species);
		
		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		
		return "admin/species/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer parentId,String speciesName,Integer active,String comment) {
		
		speciesService.saveSpecies(parentId,speciesName,active,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		return "redirect:/admin/species/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer speciesId) {
		
		speciesService.deleteSpecies(speciesId);

		session.setAttribute(request, response, Constants.CHANNEL, "species");
		
		return "redirect:/admin/species/list";
	}
	@Autowired
	private SpeciesService speciesService;
	@Autowired
	private SessionProvider session;
}
