<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/common/common.jsp"%> 
<s:iterator value="#session.menuMap" var="myMap" status="sta">
	<p>
		<a href="javascript://" class="<s:property value='#myMap.key.style'/>"><s:property value="#myMap.key.title"/></a>
	</p>
	<ul class="mian_nav_1" style="display: none;margin-left: 25px;">
		<s:iterator value="#myMap.value" var="menu">
		<s:if test="#menu.link==null||#menu.link==''">
			<li><a href="javascript://" target="${menu.target}">${menu.title }</a></li>
		</s:if>
		<s:else>
			<li><a href="${ctx}${menu.link}" target="${menu.target}">${menu.title }</a></li>
		</s:else>
		</s:iterator>
	</ul>
</s:iterator>
<script type="text/javascript">
$(document).ready(function(){
	$(".mian_nav > p").live("click",function(){
		//如果没有可以展开的菜单 不做处理
		var length=$(this).next('ul').find("li").length;
		if(length==0){
			return ;
		}
		
		if($(this).next('ul').css("display")=='block'){
			$(this).next("ul").slideUp("normal");
			//$(".mian_nav > p").next("ul").css("display","none");
		}else{
			$(".mian_nav > p:not(:first)").next("ul").css("display","none");
			$(this).next("ul").slideDown("normal");
		}
	});
});
</script>