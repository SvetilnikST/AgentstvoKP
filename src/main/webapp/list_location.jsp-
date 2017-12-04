<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>
	<table  class="table table-striped">
    	<thead>
    		<tr>
    			<th>Id </th>
    			<th>Улица</th>
				<th>Номер дома</th>
				<th>Корпус</th>
				<th>Квартира</th>
    			<th>События</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${location}" var = "locatio">
    			<tr>
    				<td><c:out value="${locatio.idLocation}"/></td>
    				<td><c:out value="${locatio.streetsEntity.streetsName}"/></td>
					<td><c:out value="${locatio.locationHouse}"/></td>
					<td><c:out value="${locatio.locationCorps}"/></td>
					<td><c:out value="${locatio.locationFlat}"/></td>
					<td><a href = "WorkTaskController?action=delete_location&id=<c:out value = "${locatio.idLocation}"/>">Редактировать</a></td>
				<td><a href = "WorkTaskController?action=delete_location&id=<c:out value = "${locatio.idLocation}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>

			<form action ="/webapp/new_location.jsp">
				<br></br>
				<button type="submit" class="btn btn-primary  btn-md">Добавить</button>
			</form>
    	</tbody>
    </table>

<jsp:include page="includ/footer.jsp"></jsp:include>
