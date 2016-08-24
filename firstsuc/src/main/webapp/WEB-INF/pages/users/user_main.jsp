<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>用户管理</title>
<%@ include file="/WEB-INF/pages/common/common.jsp"%>
<!--<script type="text/javascript" src="${ctx }/js/main.js"></script>   -->
</head>

<body>
<form role="form">
   <div class="form-group">
	<section id="container">
		<div class="row">
			<div class="col-lg-12">
				<!--breadcrumbs start -->
				<ul class="breadcrumb">
					<li><a href="#"><i class="icon-home"></i> Home</a>
					</li>
					<li><a href="#">Library</a>
					</li>
					<li class="active">Data</li>
				</ul>
				<!--breadcrumbs end -->
			</div>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="col-md-12">
					<form class="form-search">
						<input class="input-medium search-query" type="text" />
						<button type="submit" class="button">查找</button><br>
					</form>
					<button class="btn btn-info" data-toggle="modal"
						data-target="#myModal">模态框</button>
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">×</button>
									<h4 class="modal-title" id="myModalLabel">确认框</h4>
								</div>
								<div class="modal-body">确认要提交吗？</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">关闭</button>
									<button type="button" class="btn btn-primary">提交</button>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class = "button-group">
					<button class="btn btn-success" type="button">成功按钮</button>
					<button class="btn btn-warning" type="button">警告按钮</button>
					<button class="btn btn-danger" type="button">危险按钮</button>
					<button class="btn btn-info" type="button">信息按钮</button>
					</div>
					<table class="table table-striped  table-hover">
						<thead>
							<tr>
								<th width="8%"><strong>编号</strong></th>
								<th width="12%"><strong>产品</strong></th>
								<th width="60%"><strong>交付时间</strong></th>
								<th width="20%"><strong>状态</strong></th>  
							</tr>
						</thead>
						
						<!-- <tfoot>
							<tr align="center">
							<td colspan = " 3 "></td> <td >
								<ul class="pagination pagination-centered">
									<li><a href="#">&laquo;</a>
									</li>
									<li><a href="#">1</a>
									</li>
									<li><a href="#">2</a>
									</li>
									<li><a href="#">3</a>
									</li>
									<li><a href="#">4</a>
									</li>
									<li><a href="#">5</a>
									</li>
									<li><a href="#">&raquo;</a>
									</li>
								</ul>
								</td>
							</tr>
						</tfoot> -->
						<tbody>
						<%-- <s:iterator value="pageInfo.pageData" var="entity" status="sta">
			<tr>
				<td>${entity.name }</td>
				<td>${entity.code}</td>
				<td><c:if test="${entity.type eq 1}">单频道</c:if><c:if test="${entity.type eq 2}">节目包</c:if><c:if test="${entity.type eq 3}">折扣区</c:if></td>
				<td>${entity.price}</td>
				<td>${entity.intro}</td>
				<td>${entity.sales}</td>
				<td><s:date name="#entity.releaseTime" format="yyyy-MM-dd" /></td>
				<td>${entity.feeCode}</td>
 				<td>
					<a href="${ctx}/admin/pri/channel_edit.action?model.id=${entity.id}" class="btn-small">编辑</a>
 					<a href="javascript:" class="btn-small doDelete" data-appId="${entity.id}">删除</a>
				</td>
			</tr>
			</s:iterator> --%>
							
							<c:forEach var="userInfo" items="${usersInfo}">
							<tr>
								<td value="${userInfo.userId}">${userInfo.userId}</td>
								<td value="${userInfo.userName}">${userInfo.userName}</td>
								<td value="${userInfo.password}">${userInfo.password}</td>
								<td value="${userInfo.password}">${userInfo.password}</td> 
							</tr>
								</c:forEach>
							
							<!-- <tr class="success">
								<td>1</td>
								<td>TB - Monthly</td>
								<td>01/04/2012</td>
								<td>Approved</td>
							</tr>
							<tr class="error">
								<td>2</td>
								<td>TB - Monthly</td>
								<td>02/04/2012</td>
								<td>Declined</td>
							</tr>
							<tr class="warning">
								<td>3</td>
								<td>TB - Monthly</td>
								<td>03/04/2012</td>
								<td>Pending</td>
							</tr>
							<tr class="info">
								<td>4</td>
								<td>TB - Monthly</td>
								<td>04/04/2012</td>
								<td>Call in to confirm</td>
							</tr> -->
						</tbody>
					</table>
					<c:import url="/WEB-INF/pages/common/footer.jsp" charEncoding="UTF-8"></c:import>
				</div>
			</div>
		</div>
	</section>
	</div>
	</form>
</body>
</html>
