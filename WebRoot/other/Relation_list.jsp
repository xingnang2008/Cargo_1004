<!--
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
-->
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

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
    </head>
   <body class="bootstrap-admin-with-small-navbar">
        <!-- small navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar-sm" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-left bootstrap-admin-theme-change-size">
                                <li class="text">字体大小:</li>
                                <li><a class="size-changer small">小号</a></li>
                                <li><a class="size-changer large active">大号</a></li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#">链接1</a></li>
                                <li><a href="#">链接2</a></li>
                                <li>
                                    <a href="#">信息 <i class="glyphicon glyphicon-bell"></i></a>
                                </li>
                                <li>
                                    <a href="#">设置 <i class="glyphicon glyphicon-cog"></i></a>
                                </li>
                                <li>
                                    <a href="#">Go to 主页 <i class="glyphicon glyphicon-share-alt"></i></a>
                                </li>
                                <li class="dropdown">
                                    <a href="#" role="button" class="dropdown-toggle" data-hover="dropdown"> <i class="glyphicon glyphicon-user"></i> 用户信息 <i class="caret"></i></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">基本信息</a></li>
                                        <li><a href="#">登陆密码</a></li>
                                        <li><a href="#">说说</a></li>
                                        <li role="presentation" class="divider"></li>
                                        <li><a href="index.html">注销</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>

        <!-- main / large navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar bootstrap-admin-navbar-under-small" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".main-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="about.html">用户信息</a>
                        </div>
                        <div class="collapse navbar-collapse main-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#">Link</a></li>
                                <li><a href="#">Link</a></li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-hover="dropdown">设置 <b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li role="presentation" class="dropdown-header">Dropdown header</li>
                                        <li><a href="#">基本信息</a></li>
                                        <li><a href="#">登陆密码</a></li>
                                        <li><a href="#">说说</a></li>
                                        <li role="presentation" class="divider"></li>
                                        <li role="presentation" class="dropdown-header">Dropdown header</li>
                                        <li><a href="#">Separated link</a></li>
                                        <li><a href="#">注销</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div>
                </div>
            </div><!-- /.container -->
        </nav>

        <div class="container">
            <!-- left, vertical navbar & content -->
            <div class="row">
                <!-- left, vertical navbar -->
                <div class="col-md-2 bootstrap-admin-col-left">
                    <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                        <li>
                            <a href="Car_list.html"><i class="glyphicon glyphicon-chevron-right"></i> 车辆信息</a>
                        </li>
                         <li>
                            <a href="Driver_list.html"><i class="glyphicon glyphicon-chevron-right"></i> 驾驶员信息</a>
                        </li>                        
                        <li class="active">
                            <a href="Relation_list.html"><i class="glyphicon glyphicon-chevron-right"></i> 承包管理</a>
                        </li>
                        <li>
                            <a href="Contract_list.html"><i class="glyphicon glyphicon-chevron-right"></i> 合同管理</a>
                        </li>
                        <li>
                            <a href="Company_list.html"><i class="glyphicon glyphicon-chevron-right"></i> 公司信息</a>
                        </li>
                        <li>
                            <a href="Manager_list.html"><i class="glyphicon glyphicon-chevron-right"></i>经理信息</a>
                        </li>
                       </ul>
                </div>

                <!-- content -->
                <div class="col-md-10">
					<div class="row">
                        <div class="col-lg-12">
                            <div class="page-header">
                                <h1>车辆信息</h1>
                            </div>
                        </div>
                    </div>
					<div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">Table with actions</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <table class="table bootstrap-admin-table-with-actions">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>车牌号</th>
                                                <th>车型</th>
                                                <th>发动机号</th>
                                                <th>车架号</th>
												<th>班型</th>
												<th>租金</th>
												<th>入列日期</th>
												
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Mark</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
												<td>@mdo</td>
												<td>@mdo</td>
												<td>@mdo</td>
												<td>@mdo</td>
                                                <td class="actions">
                                                    <a href="#">
                                                        <button class="btn btn-sm btn-primary">
                                                            <i class="glyphicon glyphicon-pencil"></i>
                                                            Edit
                                                        </button>
                                                    </a>
                                                    <a href="#">
                                                        <button class="btn btn-sm btn-success">
                                                            <i class="glyphicon glyphicon-ok-sign"></i>
                                                            Confirm
                                                        </button>
                                                    </a>
                                                    <a href="#">
                                                        <button class="btn btn-sm btn-warning">
                                                            <i class="glyphicon glyphicon-bell"></i>
                                                            Notify
                                                        </button>
                                                    </a>
                                                    <a href="#">
                                                        <button class="btn btn-sm btn-danger">
                                                            <i class="glyphicon glyphicon-trash"></i>
                                                            Delete
                                                        </button>
                                                    </a>
                                                </td>
                                            </tr>                                           
                                         
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

				</div>
			</div>
		</div>

               

        <!-- footer -->
        

        <script type="text/javascript" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/twitter-bootstrap-hover-dropdown.min.js"></script>
        <script type="text/javascript" src="js/bootstrap-admin-theme-change-size.js"></script>
        <script type="text/javascript" src="vendors/datatables/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/DT_bootstrap.js"></script>
    </body>
</html>
