<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Id </th>
		<th>название</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${streets}" var = "street">
		<tr>
			<td><c:out value="${street.idStreets}"/></td>
			<td><c:out value="${street.streetsName}"/></td>

			<td><a href = "WorkTaskController?action=delete_streets&id=<c:out value = "${street.idStreets}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_streets&id=<c:out value = "${street.idStreets}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	<form action ="/webapp/new_streets.jsp">
		<br></br>
		<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
	</form>
	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>