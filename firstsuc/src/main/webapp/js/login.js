$(function(){
	
	$('#switch_qlogin').click(function(){
		$('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_bottom').animate({left:'0px',width:'70px'});
		$('#qlogin').css('display','none');
		$('#web_qr_login').css('display','block');
		
		});
	$('#switch_login').click(function(){
		
		$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_bottom').animate({left:'154px',width:'70px'});
		
		$('#qlogin').css('display','block');
		$('#web_qr_login').css('display','none');
		});
if(getParam("a")=='0')
{
	$('#switch_login').trigger('click');
}

	});
	
function logintab(){
	scrollTo(0);
	$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
	$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
	$('#switch_bottom').animate({left:'154px',width:'96px'});
	$('#qlogin').css('display','none');
	$('#web_qr_login').css('display','block');
	
}


// 根据参数名获得该参数 pname等于想要的参数名
function getParam(pname) { 
    var params = location.search.substr(1); // 获取参数 平且去掉？
    var ArrParam = params.split('&'); 
    if (ArrParam.length == 1) { 
        // 只有一个参数的情况
        return params.split('=')[1]; 
    } 
    else { 
         // 多个参数参数的情况
        for (var i = 0; i < ArrParam.length; i++) { 
            if (ArrParam[i].split('=')[0] == pname) { 
                return ArrParam[i].split('=')[1]; 
            } 
        } 
    } 
} 

function userRegister() {

	if ($('#user').val() == "") {
		$('#user').focus().css({
			border: "1px solid red",
			boxShadow: "0 0 2px red"
		});
		$('#userCue').html("<font color='red'><b>×用户名不能为空</b></font>");
		return false;
	}



	if ($('#user').val().length < 4 || $('#user').val().length > 16) {

		$('#user').focus().css({
			border: "1px solid red",
			boxShadow: "0 0 2px red"
		});
		$('#userCue').html("<font color='red'><b>×用户名位4-16字符</b></font>");
		return false;

	}
	
	if ($('#passwd').val().length < pwdmin) {
		$('#passwd').focus();
		$('#userCue').html("<font color='red'><b>×密码不能小于" + pwdmin + "位</b></font>");
		return false;
	}
	if ($('#passwd2').val() != $('#passwd').val()) {
		$('#passwd2').focus();
		$('#userCue').html("<font color='red'><b>×两次密码不一致！</b></font>");
		return false;
	}

	var sqq = /^[1-9]{1}[0-9]{4,9}$/;
	if (!sqq.test($('#qq').val()) || $('#qq').val().length < 5 || $('#qq').val().length > 12) {
		$('#qq').focus().css({
			border: "1px solid red",
			boxShadow: "0 0 2px red"
		});
		$('#userCue').html("<font color='red'><b>×QQ号码格式不正确</b></font>");return false;
	} else {
		$('#qq').css({
			border: "1px solid #D7D7D7",
			boxShadow: "none"
		});		
	}
	alert("test"+$("#user").val());

	$.ajax({
		type: "POST",
		url: getGlobalPathRoot()+"/log/logRegister.htmls",
		data: "user=" + $("#user").val() + '&passwd=' + $("#passwd").val(),
//		data: $("form2").serialize(),
		dataType: "json", /*返回的数据类型*/
		success: function(response) {
			var jsonData = response;
			//var jsonData = JSON.parse(response); // 使用json2.js中的parse方法将data转换成json格式  
			alert(jsonData.result=="success"); 
			alert(jsonData.result);
			if (jsonData.result=="success") {
				$('#user').focus().css({
					border: "1px solid red",
					boxShadow: "0 0 2px red"
				});$("#userCue").html(jsonData.result);
				return false;
			} else {
				$('#user').css({
					border: "1px solid #D7D7D7",
					boxShadow: "none"
				});
			}

		},
		error: function(request) {
			alert("发送请求失败！");
			}
	});
}


var reMethod = "GET",
	pwdmin = 6;

$(document).ready(function() {

	});

function getGlobalPathRoot() {
	var pagesIndex = document.URL.indexOf('pages');
	var doIndex = document.URL.indexOf('.do');
	if (-1 != pagesIndex) {
		return document.URL.substr(0, pagesIndex);
	} else if (-1 != doIndex) {
		return document.URL.substr(0, document.URL.lastIndexOf('/') + 1);
	} else {
		var extIndex = document.URL.indexOf('.jsp')
				+ document.URL.indexOf('.html') + document.URL.indexOf('.htm')
				+ document.URL.indexOf('.si');
		if (-4 != extIndex) {
			return document.URL.substr(0, document.URL.lastIndexOf('/') + 1);
		} else {
			var lastUrlChar = document.URL.substr(document.URL.length - 1, 1);
			if ('/' == lastUrlChar) {
				return document.URL;
			} else {
				return document.URL + '/';
			}
		}
	}
}