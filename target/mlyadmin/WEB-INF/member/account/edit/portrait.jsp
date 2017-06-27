<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				账户信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN FORM-->
			<div style="height: auto;" id="accordion2-2" class="accordion collapse">
				<form id="uploadForm" action="${basePath}/member/account/modify" method="POST"  enctype="multipart/form-data">
					<input type="hidden" id="portrait" name="portrait" value="${bean.portrait}" />
					<p>${bean.signature}.</p>
					<br />
					<div class="controls">
						<div class="thumbnail" style="width: 291px; height: 170px;">
							<img id="avaterImage" src="${basePath}/media/image/AAAAAA&amp;text=no+image" alt="" />
						</div>
					</div>
					<div class="space10"></div>
					<div class="fileupload fileupload-new" data-provides="fileupload">
						<div class="input-append">
							<div class="uneditable-input">
								<i class="icon-file fileupload-exists"></i> 
								<span class="fileupload-preview"></span>
							</div>
							<span class="btn btn-file">
							<span class="fileupload-new">Select file</span>
							<span class="fileupload-exists">Change</span>
							<input type="file" name="myfiles" class="default" />
							</span>
							<a href="#" class="btn fileupload-exists" data-dismiss="fileupload">Remove</a>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="controls">
						<span class="label label-important">NOTE!</span>
						<span>You can write some information here..</span>
					</div>
					<div class="space10"></div>
					<div class="submit-btn">
					    <a href="javascript:modifyPortrail();" class="btn green">save</a>
						<a href="javascript:uploadImage();" class="btn green">Submit</a>
						<a href="#" class="btn">Cancel</a>
					</div>
				</form>
			</div>
			<!-- END FORM-->                
		</div>
	</div>
</div>

<!-- END PAGE CONTAINER-->    
<script  type="text/javascript" >
function modifyPortrail(){
	//var formData = new FormData($( "#uploadForm" )[0]);  
	$( "#uploadForm" ).submit();
}
function uploadImage(){
	var formData = new FormData($( "#uploadForm" )[0]);  
    $.ajax({  
         url: '${basePath}/member/image/upload' ,  
         type: 'POST',  
         data: formData,  
         async: false,  
         cache: false,  
         contentType: false,  
         processData: false,  
         success: function (returndata) {  
             var imageUrl = JSON.parse(returndata); 
             $("#avaterImage").attr("src",'${basePath}/'+imageUrl)
             $("#portrait").val(imageUrl);
         },  
         error: function (returndata) {  
             alert(returndata);  
         }  
    });  
}
</script>