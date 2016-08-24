<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--  system values--%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="addr" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}" />
<link	href="${ctx}/bootstrap/css/bootstrap.min.css"	rel="stylesheet">
<link	href="${ctx}/bootstrap/css/bootstrap-responsive.min.css"	rel="stylesheet">
<%-- <link	href="${ctx}/bootstrap/css/bootstrap-reset.css"	rel="stylesheet"> --%>
<link	href="${ctx}/bootstrap/css/font-awesome.css"	rel="stylesheet">
<%-- <link	href="${ctx}/bootstrap/css/jquery.easy-pie-chart.css"	rel="stylesheet">
<link	href="${ctx}/bootstrap/css/owl.carousel.css"	rel="stylesheet"> --%>
<link	href="${ctx}/bootstrap/css/style.css"	rel="stylesheet">
<link	href="${ctx}/bootstrap/css/style-responsive.css"	rel="stylesheet">
<script type="text/javascript"	src="${ctx}/js/jquery.js"></script><!-- 版本号2.1.4 -->
<script type="text/javascript"	src="${ctx}/js/jquery.min.js"></script><!-- 版本号2.1.4 -->
<script type="text/javascript"	src="${ctx}/js/jquery-ui.js"></script><!-- 版本号1.11.4 -->
<%-- <script	src="${ctx}/bootstrap/js/bootstrap-combined.min.css"></script> --%>
<script	src="${ctx}/bootstrap/js/bootstrap.min.js"></script> 
<!-- bootstrap 版本号3.3.6 -->	
<%-- <script class="include" type="text/javascript" src="${ctx}/bootstrap/js/jquery.dcjqaccordion.2.7.js"></script> --%>
<script	src="${ctx}/bootstrap/js/jquery.dcjqaccordion.2.7.js"></script>
<%-- <script	src="${ctx}/bootstrap/js/jquery.scrollTo.min.js"></script>
<script	src="${ctx}/bootstrap/js/jquery.nicescroll.js"></script>
<script	src="${ctx}/bootstrap/js/jquery.sparkline.js"></script>
<script	src="${ctx}/bootstrap/js/jquery.easy-pie-chart.js"></script>
<script	src="${ctx}/bootstrap/js/jquery.easy-pie-chart.js"></script>
<script	src="${ctx}/bootstrap/js/owl.carousel.js"></script>
<script	src="${ctx}/bootstrap/js/jquery.customSelect.min.js"></script> --%>
<%-- <script	src="${ctx}/bootstrap/js/respond.min.js"></script> --%>
<script	src="${ctx}/bootstrap/js/common-scripts.js"></script>
<%-- <script	src="${ctx}/bootstrap/js/sparkline-chart.js"></script>
<script	src="${ctx}/bootstrap/js/easy-pie-chart.js"></script>
<script	src="${ctx}/bootstrap/js/count.js"></script> --%>
<script	src="${ctx}/bootstrap/js/common.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="${ctx}/bootstrap/js/html5shiv.js"></script>
      <script src="${ctx}/bootstrap/js/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">
	rootPath = "${ctx}";
</script>    
