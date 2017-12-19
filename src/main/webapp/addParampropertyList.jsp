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

            <div class="form-group"> <label>Этаж</label>
                <input type="text" name="paramPropertyFloor" class="form-control" placeholder="Введите этаж"  value="<c:out value="${paramPropertyEntity.paramPropertyFloor}"/>"/> </div>


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
              <c:if href="WorkTaskController?action=add_location">Добавить>

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

                    <div class="form-group"><label>Квартира</label>
                        <input type="text" name="locationFlat" class="form-control" placeholder="Введите квартиру"
                               value="<c:out value="${locationEntity.locationFlat}"/>"/></div>

                </c:if>


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