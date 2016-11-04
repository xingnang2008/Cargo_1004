<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<%@include file="../head.jspf" %>
	 <link rel="stylesheet" href="<%=basePath%>css/Bitch/Bitch_list.css" type="text/css" />
	<script type="text/javascript">
	$(function(){
		$('#btnSearch').click(function(){
			$('#dg').datagrid('load',{						
				stdate: $('#stdate').datebox('getValue'), 
				enddate: $('#enddate').datebox('getValue')	
			});
		});	
		
		$('#dg').datagrid({    
				//请求的url地址
			    url:'<%=basePath%>admin/Waybill/Waybill-listByBitchGroup.action', 
			    queryParams: {					
					stdate: 'stdate', 
					enddate: 'enddate'				
				},
			   loadMsg:'请等待...',
				//隔行换色——斑马线
				fit:true,
				striped:true,
				//数据同行显示
				nowrap:true,
				//自动适应列，如设为true则不会出现水平滚动条，在演示冻结列此参数不要设置
				fitColumns:false,
				//单行选择，全选功能失效
				singleSelect:false,
				//显示分页条				
				
				
				//同列属性，冰结在最左侧
			
				frozenColumns:[[
					{field:'z',checkbox:true},
					{field:'bitch',title:'运输批次',align:'left'}
					
				]],
				toolbar: [{
					iconCls: 'icon-add',
					text:'新建',
					handler: function(){
						$("#win").window({
							title:'新建记录',
							width:'650',
							height:'80%',
							content:'<iframe src="Bitch_saveInput.jsp" frameborder="0" width="100%" height="100%"> </iframe>'
						});
					
						}
					},
					{
						iconCls: 'icon-edit',
						text:'编辑记录',
						handler: function(){
						var rows =$("#dg").datagrid("getSelections");
						if(rows.length !=1){
							$.messager.show({
								title:'错误提示',
								msg:'一次只能更新一条记录',
								timeout:2000,
								showType:'slide'
							});
						}else{
							//1.完成弹出更新页面
							$("#win").window({
								title:'更新记录',
								width:'80%',
								height:'90%',
								content:'<iframe title="" src="Bitch_updateInput.jsp" frameborder="0" width="100%" height="100%"/>'
							});
					}}},
					{
						iconCls: 'icon-remove',
						text:'删除记录',
						handler: function(){
						var rows =$("#dg").datagrid("getSelections");
						if(rows.length ==0){
							$.messager.show({
								title:'选择行',
								msg:'至少要选中一行，进行删除操作。',
								timeout:2000,
								showType:'slide'
							});

						}else{
							//提示是否删除，如果确认，执行删除
							$.messager.confirm("删除确认对话框","是否要删除选中的记录",function(r){
								if(r){
									//获取被选中的记录，后从记录中获取相应的id
									var ids ="";
									for(var i=0;i<rows.length;i++){
										ids += rows[i].id+",";
									}
									//拼接id的值
									ids = ids.substring(0,ids.lastIndexOf(","));
									
									//发送ajax请求
									$.post("Bitch/Bitch-deleteByIds.action",{ids:ids},function(result){
										if(result =="true"){

											$.messager.show({
												title:'删除成功',
												msg:'删除成功',
												timeout:2000,
												showType:'slide'
											
											});
											//取消选中所有行
											$("#dg").datagrid("uncheckAll");
											//重新刷新页面
											$("#dg").datagrid("reload");
											
										}else{
											$.messager.show({
												title:'删除错误',
												msg:'删除失败,必须先删除此批次下的运单明细！',
												timeout:2000,
												showType:'slide'
											
											});
										}
									
									
									},"text");
								
								}
							
							
							
							});

						}

						}
					},
					'-',
					{
						iconCls: 'icon-reload',
						text:'刷新',
						handler: function(){$("#dg").datagrid("reload");}
					}],
				
			    columns:[[ 
												      
					      
			              {field:'sdDate',title:'发出日期', 
				              formatter:function(value,row,index){
			            	  		if(value!=""){
		                        	var unixTimestamp = new Date(value);  
		                        	return unixTimestamp.toLocaleDateString();
						        	}else{
										return "";
						        	}  
		                        } ,align:'right',width:80},
			              {field:'arrDate',title:'到达日期', 
				              formatter:function(value,row,index){
						        	if(value!=null){
		                        	var unixTimestamp = new Date(value);  
		                        	return unixTimestamp.toLocaleDateString();
						        	}else{
										return "-";
						        	}  
		                        } ,align:'right',width:80},    
			            
					        {field:'pics',title:'包数',align:'right',width:50},
					        {field:'weight',title:'重量',align:'right',width:80},
					        {field:'volumu',title:'体积',align:'right',width:70},
					        {field:'advancedZ',title:'垫付￥',align:'right',width:80},			        
					        {field:'advancedU',title:'垫付$',align:'right',width:80},
					        {field:'packfeeZ',title:'包费￥',align:'right',width:80},
					        {field:'packfeeU',title:'包费$',align:'right',width:80},
					        {field:'noaccPackfee',title:'未加包费',align:'right',width:80},
					        {field:'noaccAdvance',title:'未加运费',align:'right',width:80},
					        {field:'worth',title:'货值',align:'right',width:80},
					        {field:'insurance',title:'保费',align:'right',width:80},
					        {field:'indemnity',title:'索赔',align:'right',width:80}, 
					        {field:'sumbill',title:'运费',align:'right',width:80},
					        
					        {field:'cod',title:'代收款',align:'right',width:80},
					        {field:'discount',title:'代理费',align:'right',width:80},

					        {field:'total',title:'应收金额',align:'right',width:80},
					        {field:'actualSum',title:'实收金额',align:'right',width:80},
					        
					        {field:'outWorth',title:'结算货值',align:'right',width:80},
					        {field:'outInsurance',title:'结算保费',align:'right',width:80},					        
					        {field:'outSum',title:'结算金额',align:'right',width:80},
					        {field:'profit',title:'毛利',align:'right',width:80} , 
					        {field:'changeRate',title:'汇率',align:'right',width:80} 
						       
				]]    
			});	
		
		
		
	});
	
	
	</script>

  </head>
  
  
<body>  
<div id="container"> 
	<div id="searchDiv">
			<div>
				
			
			<div id="label">起始日期</div>
			<div id="hang"><input type="text" id="stdate" class="easyui-datebox" name="stdate" style="width:120px"/></div>
			<div id="label">截止日期</div>
			<div id="hang"><input type="text" id="enddate" class="easyui-datebox" name="enddate" style="width:120px" /></div>
			</div>
			<div>
			<a id="btnSearch" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
			</div>
		</div>
	<hr/>
	<div id="tableDG"><table id="dg"></table></div>
	
	<div id="win" data-options="collapsible:false,minimizable:false,maxmizable:true,modal:true">   
	        
	</div>  
 </div>
</body>  


</html>
