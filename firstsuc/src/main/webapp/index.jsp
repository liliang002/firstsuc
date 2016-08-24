<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>  
<html>
<head>
   <title>Bootstrap 实例 - 地址</title>
   <%@ include file="/WEB-INF/pages/common/common.jsp"%> 
</head>
<body>

<div id="myCarousel" class="carousel slide">
   <!-- 轮播（Carousel）指标 -->
   <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
   </ol>   
   <!-- 轮播（Carousel）项目 -->
   <div class="carousel-inner">
      <div class="item active">
         <img src="<%=request.getContextPath()%>/images/1.jpg" alt="First slide">
         <div class="carousel-caption">标题 1</div>
      </div>
      <div class="item">
         <img src="<%=request.getContextPath()%>/images/1.jpg" alt="Second slide">
         <div class="carousel-caption">标题 2</div>
      </div>
      <div class="item">
         <img src="<%=request.getContextPath()%>/images/1.jpg" alt="Third slide">
         <div class="carousel-caption">标题 3</div>
      </div>
   </div>
   <!-- 轮播（Carousel）导航 -->
   <a class="carousel-control left" href="#myCarousel" 
      data-slide="prev">&lsaquo;</a>
   <a class="carousel-control right" href="#myCarousel" 
      data-slide="next">&rsaquo;</a>
</div> 


</body>
</html>