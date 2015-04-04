<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>Metronic | Page Layouts - Blank Page</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular-route.min.js"></script>
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css">
<link href="theme/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="theme/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css">
<link href="theme/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="theme/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
<link href="theme/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="theme/assets/global/plugins/select2/select2.css"/>
<link rel="stylesheet" type="text/css" href="theme/assets/global/plugins/bootstrap-select/bootstrap-select.min.css"/>
<link rel="stylesheet" type="text/css" href="theme/assets/global/plugins/jquery-multi-select/css/multi-select.css"/>
<link rel="stylesheet" type="text/css" href="theme/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css"/>
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="theme/assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css"/>
<link href="theme/assets/global/css/plugins-md.css" rel="stylesheet" type="text/css"/>
<link href="theme/assets/admin/layout2/css/layout.css" rel="stylesheet" type="text/css"/>
<link id="style_color" href="theme/assets/admin/layout2/css/themes/grey.css" rel="stylesheet" type="text/css"/>
<link href="theme/assets/admin/layout2/css/custom.css" rel="stylesheet" type="text/css"/>

<link href="core/bootstrap-expandable-input.css" rel="stylesheet" type="text/css"/>
<link href="core/bootstrap-editable-table.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>

<body ng-app="sampleApp" class="page-md page-boxed page-header-fixed page-container-bg-solid page-sidebar-closed-hide-logo" >
<!-- BEGIN HEADER -->
<div class="page-header md-shadow-z-1-i navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner container">
		<!-- BEGIN LOGO -->
		<div ng-include="'include/logo.html'"></div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN PAGE ACTIONS -->
		<div ng-include="'include/page_actions.html'"></div>
		<!-- END PAGE ACTIONS -->
		<!-- BEGIN PAGE TOP -->
		<div class="page-top">
			<!-- BEGIN HEADER SEARCH BOX -->
			<div ng-include="'include/search_box.html'"></div>			
			<!-- END HEADER SEARCH BOX -->
			<!-- BEGIN TOP NAVIGATION MENU -->
			<div ng-include="'include/navigation_manu.html'"></div>
			<!-- END TOP NAVIGATION MENU -->
		</div>
		<!-- END PAGE TOP -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<div class="container">
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
	<div ng-include="'include/left_menu.html'"></div>	
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<div ng-include="'include/page_header.html'"></div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row">
					<div class="col-md-12">
						<div ui-view></div>
					</div>
				</div>
				<!-- END PAGE CONTENT-->
			</div>
		</div>
		<!-- END CONTENT -->
		<!-- BEGIN QUICK SIDEBAR -->
		<!--Cooming Soon...-->
		<!-- END QUICK SIDEBAR -->
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div ng-include="'include/page_footer.html'"></div>
	<!-- END FOOTER -->
</div>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="theme/assets/global/plugins/respond.min.js"></script>
<script src="theme/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="theme/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="theme/assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="theme/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<script src="theme/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="theme/assets/admin/layout2/scripts/layout.js" type="text/javascript"></script>
<script src="theme/assets/admin/layout2/scripts/demo.js" type="text/javascript"></script>
<script src="core/view_routing.js" type="text/javascript"></script>
 <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
 <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular-route.js"></script>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="theme/assets/global/plugins/select2/select2.min.js"></script>
<script type="text/javascript" src="theme/assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="theme/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
<script type="text/javascript" src="theme/assets/global/plugins/bootstrap-select/bootstrap-select.min.js"></script>
<script type="text/javascript" src="theme/assets/global/plugins/select2/select2.min.js"></script>
<script type="text/javascript" src="theme/assets/global/plugins/jquery-multi-select/js/jquery.multi-select.js"></script>
<script src="core/bootstrap.js"></script>
<script src="core/bootstrap-navigable-table.js"></script>
<script src="core/bootstrap-expandable-input.js"></script>
<script src="core/bootstrap-editable-table.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="theme/assets/admin/pages/scripts/table-editable.js"></script>
<script src="theme/assets/admin/pages/scripts/components-dropdowns.js"></script>
<script>
    jQuery(document).ready(function() {    
        Metronic.init(); // init metronic core components
		Layout.init(); // init current layout
		Demo.init(); // init demo features
		TableEditable.init();
		ComponentsDropdowns.init();
	});
       
    </script> 
    
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>