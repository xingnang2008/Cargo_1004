<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!--  <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

  
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String downloadPath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/download/";
%>
<html>
  <head>
  <title>运输管理系统0.1</title>
	<meta charset="utf-8">
	
	<link rel="shortcut icon" href="<%=basePath%>image/favicon2.ico" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>script/jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>script/jquery-easyui-1.4.3/themes/icon.css">
	
	<script type="text/javascript" src="<%=basePath%>script/jquery-easyui-1.4.3/jquery.min.js" ></script>
	<script type="text/javascript" src="<%=basePath%>script/jquery-easyui-1.4.3/jquery.easyui.min.js" ></script>
	<script type="text/javascript" src="<%=basePath%>script/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js" ></script>


	<script type="text/javascript">
	$(function(){
		$("a[title]").click(function(){
			var text = $(this).text();
			var href = $(this).attr("title");			
			if($("#tt").tabs("exists",text)){    <!--判断是否存在tabs-->				
				$("#tt").tabs('select',text);
			}else{
				//3:如果没有创建一个
				$("#tt").tabs("add",{
					title:text,
					closable:true,
					//href:'send_category_query.action'            //默认通过url加载远程页面仅仅是body部分
					content:'<iframe src='+href+' frameborder="0" width="100%" height="100%"> </iframe>'
					
				});
			}
		})
	});
	
	</script>
	<style type="text/css">
		body{
			text-align:center;
		}
		#menu {
			margin:auto; 
			width:200;
		}
		#menu ul{
			padding:0;   
			margin:auto; 
			list-style-position:inside;
		}
		#menu ul li{
			margin:auto;
			border-bottom:1px solid #fff;
			text-aglin:center;  
		}
		#menu ul li a{
			display:block;		
			background-color:#008792;
			color:#fff;
			padding:5px;   
			text-decoration:none;  
		}
		#menu ul li a:hover{
			background-color:#00a6ac;
		}
	</style>

  </head>
  
  
   <body class="easyui-layout">   
   
    <div data-options="region:'north',title:'North Title',split:true" style="height:50px;">
    	<a href="<%=basePath%>j_spring_security_logout">退出</a>
    </div>    
    
    <div data-options="region:'west',title:'菜单',split:true" style="width:200px;">
    <div id="menu" class="easyui-accordion" data-options="fit:true">   <!--适应最外层-->
    			<div title="运单管理">
				<ul>
					<li><a href="#" title="admin/Waybill/Waybill_list.jsp">运单明细</a></li>
					
					<!-- 
					<sec:authorize access="hasRole('ROLE_ADMIN')">
					<li><a href="#" title="Waybill/Waybill_accountInput.jsp">运单结算</a></li>
					</sec:authorize>
					 -->
					
					
				</ul>
				</div>
				
    
				<div title="核销管理">
				<ul>
					<li><a href='#' title="admin/Rebate/Rebate_list.jsp">核销登记</a></li>
				</ul>
				</div>
				
				<div title="跟踪管理">
				<ul>
					<li><a href="#" title="admin/Waybill/Waybill_track.jsp">货物跟踪</a></li>
					<li><a href="#" title="Track/Track_list.jsp">到货管理</a></li>
					
				</ul>
				</div>
				
				<div title="东线报价管理">
				<ul>
					<li><a href="#" title="Quote/Quote_list.jsp">东线报价查询</a></li>					
					<li><a href="#" title="Quote/Quote_uploadfile.jsp">东线报价更新</a></li>
					
					
				</ul>
				</div>
				<div title="西线报价管理">
				<ul>
					<li><a href="#" title="HuiQuote/HuiQuote_list.jsp">西线报价查询</a></li>
					<li><a href="#" title="HuiQuote/HuiQuote_uploadfile.jsp">西线报价更新</a></li>					
					
					
				</ul>
				</div>
		</div></div>   
    <div data-options="region:'center',title:'工作区'" style="padding:5px;background:#eee;">
	    <div id="tt" class="easyui-tabs" data-options="fit:true">
	    	 
	    </div>
    </div>   
</body>  


</html>
