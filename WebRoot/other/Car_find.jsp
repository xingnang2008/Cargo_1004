
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Tables | Bootstrap 3.x Admin Theme</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="css/bootstrap-admin-theme.css">
        <link rel="stylesheet" media="screen" href="css/bootstrap-admin-theme-change-size.css">

        <!-- Datatables -->
        <link rel="stylesheet" media="screen" href="css/DT_bootstrap.css">

		<!-- datepicker -->
		 <link rel="stylesheet" media="screen" href="vendors/bootstrap-datepicker/css/datepicker.css">
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
        <style>
        	*{
        		padding:0;
        		margin:0;
        	}
        	body{
        		margin:20px;
        		align:center;
        	}
        	#mt{
        		border: 1px solid #abcdef;
        		border-collapse:collapse;
        		width:600px;
        		margin-left:auto;
				margin-right:auto;
        	}
        	#mt tr{
        			height: 30px;
        	}
        	#mt th{
        			border: 1px solid #abcdef;
        			text-align:center;
        	}
        	#mt td{
        			border: 1px solid #abcdef;
        	}
        
        </style>
          <script src="/taxi_1003/script/jquery.js"></script>
        
        <script type="text/javascript"> 
		        /* 提交结果，执行ajax */
		        function btn(){
		        	
		            var $btn = $("#search");//获取按钮元素
		            //给按钮绑定点击事件
		            $btn.bind("click",function(){
		            	
		            	$("#mt tr:not(:first)").remove();   	
						 var url="/taxi_1003/admin/Car-testAjax";
		            	 var data= {carNo:$("#carnos").val()};
		            	 $.ajax({
		            		 	url:url,
		            		 	async:false,
		            		 	type:'get',
		            			data:data,
		            			dataType:'json',
		            			success:function(data){
		            				var res = eval("("+data+")");
		            				alert("Data length:"+res.length);
		            			 	for(var i=0;i<res.length;i++){
		            			 		
		            			 		var tr_info = "<tr><td>"+res[i].id+"</td><td>"+res[i].carNo+"</td><td>"+res[i].brand+
										"</td><td>"+res[i].engineNo+"</td><td>"+res[i].bodyNo+
										"</td><td>"+res[i].classType+"</td><td>"+res[i].rental+"</td></tr>";
										
			            			 	$('#mt').append(tr_info);
		            			 	}            			
		            			
		            			},
		            			error:function(){
		            			 alert("Erro:"+XMLHttpRequest.status);
		            			 alert("Erro:"+XMLHttpRequest.readyState);
		            			 alert(textStatus);
		            			
		            			}
		                    
		                });
		            });
		        }


		    
		     
		        /* 页面加载完成，绑定事件 */
		        $(document).ready(function(){          
		            btn();//点击提交，执行ajax
		           
		        });
    </script>
      
        
        
    </head>
   <body>
       

                <!-- content -->
				
               
	                <div>
	                
		               <div>
		                	<div><label>车牌号：</label></div>
		                	<div><input type="text" id="carnos" /></div>
		                </div>	
	                </div>
	                <div>
	                
	               </div>
	                		 <button class="btn btn-primary" id="search">筛选</button>
                             <button type="reset" class="btn btn-default">重置</button>
                      
					<div>
					<div>
							<form action="">
							    <input type="file" id="fileName" /> 
								<button type="submit" id="upload">导入</button>
								</form>
					</div>
                        <div>
                            <div class="page-header">
                                <h1>车辆信息</h1>
                            </div>
                        </div>
                    </div>
					<div id="myTable">
                        <table id='mt'>
                      <tr>
                        <th>id</th>
                        <th>车牌号</th>
                        <th>品牌 </th>
                        <th>发动机号</th>
                    	<th>车架号</th>
                    	<th>班型</th>
                    	<th>承包金</th>
                    </tr>
                      
                        </table>
                           
                
					</div>
		
               

        <!-- footer -->
        
		
      
    </body>
</html>
