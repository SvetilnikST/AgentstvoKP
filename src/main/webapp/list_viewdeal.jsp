<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
<table  class="table table-striped">
	<thead>
	<tr>
		<th>Id </th>
		<th>Вид сделки</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${viewdeal}" var = "viewdeall">
		<tr>
			<td><c:out value="${viewdeall.idViewDeal}"/></td>
			<td><c:out value="${viewdeall.viewDeal}"/></td>

			<td><a href = "WorkTaskController?action=add_viewDeal&id=<c:out value = "${viewdeall.idViewDeal}"/>">Редактировать</a></td>
			<td><a href = "WorkTaskController?action=delete_viewDeal&id=<c:out value = "${viewdeall.idViewDeal}"/>">Удалить</a></td>
		</tr>
	</c:forEach>

	<form action ="addViewDeal.jsp">
		<br></br>
		<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
	</form>
	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>