<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
<div class="page-content no-min-height">
<div class="container-fluid promo-page">
  <div class="row-fluid" style="padding:0px 100px 0px 100px;">
	<div class="span12">
		<h3 class="page-title">
			功能介绍 <small>客盟多用户微信营销系统系统内置100多项应用，涵盖近30个行业的垂直领域应用</small>
		</h3>
		<!-- END PAGE TITLE & BREADCRUMB-->
	</div>
</div>

 <div class=" row-fluid functionNav styleGrayBg mt40" >
          <div class="clearfix">
              <ul>
                   <li class="on"><a href="javascript:;">最新功能</a></li>
                   <li  class=""> <a href="javascript:;">互动游戏</a></li>
                   <li  class=""> <a href="javascript:;">品牌展示</a></li>
                   <li  class=""><a href="javascript:;">涨粉神器</a></li>
                   <li  class=""><a href="javascript:;">营销活动</a></li>
                   <li  class=""><a href="javascript:;">电商分销</a></li>
                   <li  class=""><a href="javascript:;">会员客服</a></li>
                   <li  class=""><a href="javascript:;">线下吸粉</a></li>
                   <li  class=""><a href="javascript:;">行业方案</a></li>
                   <li  class=""><a href="javascript:;">定制开发</a></li>                
                 </ul>
          </div>
 </div>  
  <div class="container-fluid " style="padding:0px 100px 0px 100px;">
  <div class="block-grey">
					<div class="container">
						<div id="promo_carousel" class="carousel slide">
							<div class="carousel-inner">
								<div class=" item">
									<div class="row-fluid">
										<div class="span7 margin-bottom-20 margin-top-20 animated rotateInUpRight">
											<h1>Welcome to Metronic..</h1>
											<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<a href="${basePath}/index.html" class="btn red big xlarge">
											Take a tour
											<i class="m-icon-big-swapright m-icon-white"></i>                                
											</a>
										</div>
										<div class="span5 animated rotateInDownLeft">
											<a href="${basePath}/index.html"><img src="${basePath}/media/image/img1.png" alt=""></a>
										</div>
									</div>
								</div>
								<div class="active item">
									<div class="row-fluid">
										<div class="span5 animated rotateInUpRight">
											<a href="index.html"><img src="${basePath}/media/image/img1_2.png" alt=""></a>
										</div>
										<div class="span7 margin-bottom-20 animated rotateInDownLeft">
											<h1>Buy Metronic Today..</h1>
											<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<a href="${basePath}/index.html" class="btn green big xlarge">
											But it today
											<i class="m-icon-big-swapright m-icon-white"></i>                                
											</a>
										</div>
									</div>
								</div>
							</div>
							<a class="carousel-control left" href="#promo_carousel" data-slide="prev">
							<i class="m-icon-big-swapleft m-icon-white"></i>
							</a>
							<a class="carousel-control right" href="#promo_carousel" data-slide="next">
							<i class="m-icon-big-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
				</div>
     <div class="portlet">
     <div class="span3" >
     <img alt="" src="${basePath}/media/image/iphone-6-sideral.png">
     </div>
     <div class="span9">
          <h3 class="title_zw">爱情天使</h3>
          <div class="textDesc">
               <p> <strong>功能介绍：</strong><span class="desc">爱情之路艰险坎坷，小天使勇敢追爱。粉丝需要把握好技巧，让小天使穿越石柱，收集爱情之心。收集的越多，得分越高。</span></p>
               <p class="app_sight"><strong>应用场景：</strong><span class="sce_content">这款游戏可用于214情人节、520表白日、七夕等节日营销应用，适用行业广泛，如餐饮、商城、鲜花、零售等行业；同时也可用于婚庆、摄影等相关行业的日常营销推广工具。</span></p>
           </div>
           
     </div>
     </div>
 </div>
</div>
</div>
<script>
	jQuery(document).ready(function() {    
	   jQuery('#promo_carousel').carousel({
	      interval: 10000,
	      pause: 'hover'
	   });
	});
</script>