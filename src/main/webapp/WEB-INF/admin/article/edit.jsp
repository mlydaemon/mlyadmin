<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <link rel="stylesheet" type="text/css" href="${basePath}/media/css/wangEditor.min.css"/>
 <script type="text/javascript" src="${basePath}/media/js/wangEditor.js"></script>
 
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
		
		 <div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="#" id="articleForm" class="form-horizontal form-bordered form-row-stripped">
						<input type="hidden" name="contentId" value="${bean.contentId}"/>
						<div class="control-group">
							<label class="control-label">标题</label>
							<div class="controls">
								<input type="text" name="title" value="${bean.title}" placeholder="small" class="m-wrap span12">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">副标题</label>
							<div class="controls">
								<input type="text" name="shortTitle"  value="${bean.shortTitle}" placeholder="small" class="m-wrap span12">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">栏目</label>
							<div class="controls">
								<select name="channelId" class="span12 ">
									<option selected="selected" >请选择栏目</option>
									<c:forEach var="channel" items="${channels}"> 
									     <option <c:if test="${bean.channelId == channel.channelId}"> selected="selected"</c:if> value="${channel.channelId}">${channel.channelName }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">内容</label>
							<div class="controls">
								<div id="editor-trigger" style="height:400px">${bean.txt}</div>
							</div>
						</div>
						<div class="form-actions">
							<button  id="submit" type="button" class="btn blue"><i class="icon-ok"></i> Save</button>
							<button type="button" class="btn">Cancel</button>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
 <script type="text/javascript">
        // 阻止输出log
        // wangEditor.config.printLog = false;

        var editor = new wangEditor('editor-trigger');

        // 上传图片
        editor.config.uploadImgUrl = '${basePath}/member/image/upload';
        editor.config.uploadParams = {
            // token1: 'abcde',
            // token2: '12345'
        };
        editor.config.uploadHeaders = {
            // 'Accept' : 'text/x-json'
        }
        editor.config.uploadImgFileName = 'myfiles';

        // 隐藏网络图片
        // editor.config.hideLinkImg = true;

        // 表情显示项
        editor.config.emotionsShow = 'value';
        editor.config.emotions = {
            'default': {
                title: '默认',
                data: '${basePath}/media/data/emotions.data'
            },
            'weibo': {
                title: '微博表情',
                data: [
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/7a/shenshou_thumb.gif',
                        value: '[草泥马]'    
                    },
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/60/horse2_thumb.gif',
                        value: '[神马]'    
                    },
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/bc/fuyun_thumb.gif',
                        value: '[浮云]'    
                    },
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/c9/geili_thumb.gif',
                        value: '[给力]'    
                    },
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/f2/wg_thumb.gif',
                        value: '[围观]'    
                    },
                    {
                        icon: 'http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/70/vw_thumb.gif',
                        value: '[威武]'
                    }
                ]
            }
        };

        // 插入代码时的默认语言
        // editor.config.codeDefaultLang = 'html'

        // 只粘贴纯文本
        // editor.config.pasteText = true;

        // 跨域上传
        // editor.config.uploadImgUrl = 'http://localhost:8012/upload';

        // 第三方上传
        // editor.config.customUpload = true;

        // 普通菜单配置
        // editor.config.menus = [
        //     'img',
        //     'insertcode',
        //     'eraser',
        //     'fullscreen'
        // ];
        // 只排除某几个菜单（兼容IE低版本，不支持ES5的浏览器），支持ES5的浏览器可直接用 [].map 方法
        // editor.config.menus = $.map(wangEditor.config.menus, function(item, key) {
        //     if (item === 'insertcode') {
        //         return null;
        //     }
        //     if (item === 'fullscreen') {
        //         return null;
        //     }
        //     return item;
        // });

        // onchange 事件
        editor.onchange = function () {
            console.log(this.$txt.html());
        };

        // 取消过滤js
        // editor.config.jsFilter = false;

        // 取消粘贴过来
        // editor.config.pasteFilter = false;

        // 设置 z-index
        // editor.config.zindex = 20000;

        // 语言
        // editor.config.lang = wangEditor.langs['en'];

        // 自定义菜单UI
        // editor.UI.menus.bold = {
        //     normal: '<button style="font-size:20px; margin-top:5px;">B</button>',
        //     selected: '.selected'
        // };
        // editor.UI.menus.italic = {
        //     normal: '<button style="font-size:20px; margin-top:5px;">I</button>',
        //     selected: '<button style="font-size:20px; margin-top:5px;"><i>I</i></button>'
        // };
        editor.create();
        $('#submit').click(function () {
            // 获取编辑器区域完整html代码
            var html = editor.$txt.html();
             
            // 获取编辑器纯文本内容
            var text = editor.$txt.text();

            // 获取格式化后的纯文本
            var formatText = editor.$txt.formatText();
            var formData = new FormData($( "#articleForm" )[0]);
            formData.append("txt", html);
            $.ajax({  
                 url: '${basePath}/admin/article/update' ,  
                 type: 'POST',  
                 data: formData,  
                 async: false,  
                 cache: false,  
                 contentType: false,  
                 processData: false,  
                 success: function (returndata) {  
                	 var result = JSON.parse(returndata);
                	 console.log(result);
                	 window.location.href='${basePath}/admin/article/list';
                 },  
                 error: function (returndata) {  
                     alert(returndata);  
                 }  
            });  
        });
    </script>		