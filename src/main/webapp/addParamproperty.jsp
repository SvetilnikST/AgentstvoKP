<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<jsp:include page="includ/header.jsp"></jsp:include>
<head>
    <title>Добавление параметров недвижимости</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>
</head>

<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-6">
        <h1 class="text-gray-dark">Добавить параметров</h1>
        <form name="loginForm" method="POST" action="WorkTaskController">
            <input type = "hidden" name="action" value="save_paramProperty"/>
            <input type = "hidden" name="mode" value="<c:out value="${mode}"/>"/>
            <input type = "hidden" name="idParamProperty"  value="<c:out value="${paramPropertyEntity.idParamProperty}"/>"/>
        <div class="form-group"> <label>Параметры</label>

            <div class="form-group"> <label>Площадь</label>
                <input type="text" name="paramPropertyArea" class="form-control" placeholder="укажите площадь"  value="<c:out value="${paramPropertyEntity.paramPropertyArea}"/>"/> </div>

            <div class="form-group"> <label>расположение</label>
            <select name="paramPropertyLocation" class="form-control">
                <c:forEach items="${locationEntities}" var = "location">
                    <option value="<c:out value="${location.idLocation}"/>"
                            <c:if test = "${location.idLocation eq curLocation}">
                                selected
                            </c:if>
                    >
                        Улица: <c:out value="${location.streetsEntity.streetsName}"/>;
                        номер дома: <c:out value="${location.locationHouse}"/>;
                        корпус: <c:out value="${location.locationCorps}"/>;
                        квартира: <c:out value="${location.locationFlat}"/>
                    </option>
                </c:forEach>

            </select>

            <div class="form-group"> <label>Этаж</label>
                <input type="text" name="paramPropertyFloor" class="form-control" placeholder="Введите этаж"  value="<c:out value="${paramPropertyEntity.paramPropertyFloor}"/>"/> </div>

                <div class="form-group"> <label>Описание</label>
                    <input type="text" name="paramPropertyDescription" class="form-control" placeholder="Введите описание"  value="<c:out value="${paramPropertyEntity.paramPropertyDescription}"/>"/> </div>

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