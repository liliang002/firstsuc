$(document).ready(function() {
//	alert("test2");
});

//custom select box

$(function() {
//	alert("test3");
	var tb = $("#panel-body");
//	alert("test4");
	tb.html(CommnUtil.loadingImg());
	tb.load(rootPath+"/log/test.htmls");
//	alert("test6");
	
	$("#sidebar ul.sub li a").click(function() {
		var link = $(this).attr("linkId");
//		alert("test001="+$(this).attr("linkId")); 
		tb.html(CommnUtil.loadingImg());
		tb.load(rootPath+link);
//		return false;
//		alert("test002");
	});
	
//	$("#sidebar ul.sub li.menu").click(function() {
//		var link = $(this).attr("linkId");
//		alert("test001="+$(this).attr("linkId")); 
//		alert("test001="+this.href); 
//		tb.html(CommnUtil.loadingImg());
//		tb.load(rootPath+link);
//		return false;
////		alert("test002");
//	});
});