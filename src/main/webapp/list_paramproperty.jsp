<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<jsp:include page="includ/directoryparam.jsp"></jsp:include>
<br>
<a href="WorkTaskController?action=add_paramproperty">Добавить</a>
<table  class="table table-striped">
    	<thead>
    		<tr>
    			<th>Площадь</th>
				<th>Расположение</th>
				<th>Этаж</th>
				<th>Описание</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${paramproperty}" var = "parampropert">
    			<tr>
					<td><c:out value="${parampropert.paramPropertyArea}"/></td>
    				<td><c:out value="${parampropert.locationEntity.streetsEntity.streetsName}"/></td>
					<td><c:out value="${parampropert.paramPropertyFloor}"/></td>
					<td><c:out value="${parampropert.paramPropertyDescription}"/></td>
					<td><a href = "WorkTaskController?action=edit_paramproperty&id=<c:out value = "${parampropert.idParamProperty}"/>">Редактировать</a></td>
					<td><a href = "WorkTaskController?action=delete_paramproperty&id=<c:out value = "${parampropert.idParamProperty}"/>">Удалить</a></td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>
    </form>

<jsp:include page="includ/footer.jsp"></jsp:include>