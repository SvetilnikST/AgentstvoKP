<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directory.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_streets">Добавить</a>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Улицы</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${streets}" var = "street">
		<tr>
			<td><c:out value="${street.streetsName}"/></td>

			<td><a href = "WorkTaskController?action=edit_streets&id=<c:out value = "${street.idStreets}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_streets&id=<c:out value = "${street.idStreets}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>