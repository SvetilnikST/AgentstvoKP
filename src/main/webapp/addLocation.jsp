<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<jsp:include page="includ/header.jsp"></jsp:include>
<head>
    <title>Добавление расположения</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
          type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
</head>

<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
            <h1 class="text-gray-dark">Добавить расположение</h1>
            <form name="loginForm" method="POST" action="WorkTaskController">
                <input type="hidden" name="action" value="save_location"/>
                <input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
                <input type="hidden" name="idLocation" value="<c:out value="${locationEntity.idLocation}"/>"/>
                <div class="form-group"><label>Улица</label>
                    <select name="locationStreet" class="form-control">
                        <c:forEach items="${streetsEntities}" var="street">
                            <option value="<c:out value="${street.idStreets}"/>"
                                    <c:if test="${street.idStreets eq curStreet}">
                                        selected
                                    </c:if>
                            ><c:out value="${street.streetsName}"/></option>
                        </c:forEach>

                    </select>
                    <div class="form-group"><label>Дом</label>
                        <input type="text" name="locationHouse" class="form-control" placeholder="Введите дом"
                               value="<c:out value="${locationEntity.locationHouse}"/>"/></div>

                    <div class="form-group"><label>Корпус</label>
                        <input type="text" name="locationCorps" class="form-control" placeholder="Введите корпус"
                               value="<c:out value="${locationEntity.locationCorps}"/>"/></div>

                    <div class="form-group"><label>Этаж</label>
                        <input type="text" name="locationFlat" class="form-control" placeholder="Введите квартиру"
                               value="<c:out value="${locationEntity.locationFlat}"/>"/></div>

                    <button type="submit" class="btn btn-primary">Сохранить</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
</div>

<jsp:include page="includ/footer.jsp"></jsp:include>