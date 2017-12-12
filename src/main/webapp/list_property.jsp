<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directory.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_property">Добавить</a>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Вид недвижимости</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${property}" var = "propert">
		<tr>
				<td><c:out value="${propert.property}"/></td>

			<td><a href = "WorkTaskController?action=edit_property&id=<c:out value = "${propert.idProperty}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_property&id=<c:out value = "${propert.idProperty}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>