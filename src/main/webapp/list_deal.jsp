<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directoryparam.jsp"></jsp:include>
<%--<form name="loginForm" method="POST" action="WorkTaskController">--%>
	<%--<input type="hidden" name="action" value="deal"/>--%>
	<%--<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>--%>
	<%--<div class="form-group"><label>Вид сделки</label>--%>
	<%--<select name="viewDeal" class="form-control">--%>
		<%--<option value="-1">Отобразить все</option>--%>
		<%--<c:forEach items="${viewDeals}" var="viewDeal">--%>
			<%--<option value="<c:out value="${viewDeal.idViewDeal}"/>" >--%>
				<%--<c:out value="${viewDeal.viewDeal}"/>--%>
			<%--</option>--%>
		<%--</c:forEach>--%>
	<%--</select>--%>
	<%--<button type="submit" class="btn btn-primary">Отправить</button>--%>
<%--</div>--%>

<%--</form>--%>
<table  class="table table-striped">
	<thead>
	<tbody>
	<tr>
		<th>Дата</th>
		<th>Поставщик
			<form name="loginForm" method="POST" action="WorkTaskController">
				<input type="hidden" name="action" value="deal"/>
				<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
				<div class="form-group" style="float:left; width: 75%">
					<select name="clients1" class="form-control">
						<option value="-1">Все</option>
						<c:forEach items="${clients1}" var="client">
							<option value="<c:out value="${client.idClients}"/>" >
								<c:out value="${client.snmClients}"/>
							</option>
						</c:forEach>
					</select>
				</div>
				<div style="float:left; width:25%"><button type="submit" class="btn btn-primary">Ок</button> </div>
			</form>
		</th>
		<th>Заказчик
			<form name="loginForm" method="POST" action="WorkTaskController">
				<input type="hidden" name="action" value="deal"/>
				<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
				<div class="form-group" style="float:left; width: 75%">
					<select name="clients2" class="form-control">
						<option value="-1">Все</option>
						<c:forEach items="${clients2}" var="client">
							<option value="<c:out value="${client.idClients}"/>" >
								<c:out value="${client.snmClients}"/>
							</option>
						</c:forEach>
					</select>
				</div>
				<div style="float:left; width:25%"><button type="submit" class="btn btn-primary">Ок</button> </div>
			</form>
		</th>
		<th>Вид сделки
			<form name="loginForm" method="POST" action="WorkTaskController">
				<input type="hidden" name="action" value="deal"/>
				<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
				<div class="form-group" style="float:left; width: 75%">
					<select name="viewDeal" class="form-control">
						<option value="-1">Все</option>
						<c:forEach items="${viewDeals}" var="viewDeal">
							<option value="<c:out value="${viewDeal.idViewDeal}"/>" >
								<c:out value="${viewDeal.viewDeal}"/>
							</option>
						</c:forEach>
					</select>
				</div>
				<div style="float:left; width:25%"><button type="submit" class="btn btn-primary">Ок</button> </div>
			</form>
		</th>
		<th>Недвижимость
			<form name="loginForm" method="POST" action="WorkTaskController">
				<input type="hidden" name="action" value="deal"/>
				<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
				<div class="form-group" style="float:left; width: 75%">
					<select name="property" class="form-control">
						<option value="-1">Все</option>
						<c:forEach items="${propertys}" var="propert">
							<option value="<c:out value="${propert.idProperty}"/>" >
								<c:out value="${propert.property}"/>
							</option>
						</c:forEach>
					</select>
				</div>
				<div style="float:left; width:25%"><button type="submit" class="btn btn-primary">Ок</button> </div>
			</form>

		</th>
		<th>кв.м</th>
		<th>Сотрудник
			<form name="loginForm" method="POST" action="WorkTaskController">
				<input type="hidden" name="action" value="deal"/>
				<input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
				<div class="form-group" style="float:left; width: 75%">
					<select name="employee" class="form-control">
						<option value="-1">Все</option>
						<c:forEach items="${employees}" var="employee">
							<option value="<c:out value="${employee.idEmployees}"/>" >
								<c:out value="${employee.employeesSnm}"/>
							</option>
						</c:forEach>
					</select>
				</div>
				<div style="float:left; width:25%"><button type="submit" class="btn btn-primary">Ок</button> </div>
			</form>
		</th>
		<th>Сумма</th>
		<th>%</th>
		<th></th>
		<th></th>
	</tr>
	</tbody>
	</thead>
    	<tbody>
    		<c:forEach items="${deal}" var = "deal">
    			<tr>
    				<td><c:out value="${deal.dateDeal}"/></td>
					<td><c:out value="${deal.clientsEntity1.snmClients}"/></td>
					<td><c:out value="${deal.clientsEntity2.snmClients}"/></td>
					<td><c:out value="${deal.viewdealEntity.viewDeal}"/></td>
					<td><c:out value="${deal.propertyEntity.property}"/></td>
					<td><c:out value="${deal.parampropertyEntity.paramPropertyArea}"/></td>
					<td><c:out value="${deal.employeesEntity.employeesSnm}"/></td>
					<td><c:out value="${deal.dealSum}"/></td>
					<td><c:out value="${deal.dealPercent}"/></td>
					<td><a href = "WorkTaskController?action=edit_deal&id=<c:out value = "${deal.idDeal}"/>">Ред</a></td>
					<td><a href = "WorkTaskController?action=delete_deal&id=<c:out value = "${deal.idDeal}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>
<jsp:include page="includ/footer.jsp"></jsp:include>
