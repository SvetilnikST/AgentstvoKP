<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<br>

<table  class="table table-striped">
	<thead>
	<tr>
	<th><a href="WorkTaskController?action=add_employees">Добавить</a></th>
	<th>Сотрудники</th><th/><th/><th/><th/><th/><th/><th/><th/><th/><th/><th/>
				<tr>
    			<th>ФИО</th>
				<th>Пол</th>
				<th>Граждантство</th>
				<th>Дата рождения</th>
				<th>Паспортные данные</th>
				<th>Должность</th>
				<th>Телефон</th>
				<th>Mail</th>
				<th>Пароль</th>
				<th>solt</th>
				<th>Статус</th>
				<th/>
				<th/>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${employees}" var = "employee">
    			<tr>
					<td><c:out value="${employee.employeesSnm}"/></td>
    				<td><c:out value="${employee.employeesFloor}"/></td>
					<td><c:out value="${employee.employeesCitizinship}"/></td>
					<td><c:out value="${employee.employeesDoB}"/></td>
					<td><c:out value="${employee.employeesPassport}"/></td>
					<td><c:out value="${employee.positionsEntity.positions}"/></td>
					<td><c:out value="${employee.employeesPhone}"/></td>
					<td><c:out value="${employee.employeesMail}"/></td>
					<td><c:out value="${employee.password}"/></td>
					<td><c:out value="${employee.solt}"/></td>
					<td><c:out value="${employee.status}"/></td>
					<td><a href = "WorkTaskController?action=edit_employees&id=<c:out value = "${employee.idEmployees}"/>">Ред</a></td>
					<td><a href = "WorkTaskController?action=delete_employees&id=<c:out value = "${employee.idEmployees}"/>">Удалить</a></td>

				</tr>
    		</c:forEach>
    	</tbody>
</table>

<jsp:include page="includ/footer.jsp"></jsp:include>