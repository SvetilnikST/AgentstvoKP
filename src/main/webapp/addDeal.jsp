<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%--<jsp:include page="includ/header.jsp"></jsp:include>--%>
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
                <input type="hidden" name="action" value="save_deal"/>
                <input type="hidden" name="mode" value="<c:out value="${mode}"/>"/>
                <input type="hidden" name="idDeal" value="<c:out value="${dealEntity.idDeal}"/>"/>
                <div class="form-group"><label>Сделки</label>

                    <div class="form-group"><label>Дата сделки</label>
                        <input type="date" name="dateDeal" class="form-control" placeholder="Введите дату"
                               value="<c:out value="${dealEntity.dateDeal}"/>"/>
                    </div>

                    <div class="form-group"><label>Поставщик</label>
                        <select name="dealClient1" class="form-control">
                            <c:forEach items="${clientsEntities}" var="clients">
                                <option value="<c:out value="${clients.idClients}"/>"
                                        <c:if test="${clients.idClients eq curClients1}">
                                            selected
                                        </c:if>
                                ><c:out value="${clients.snmClients}"/></option>
                            </c:forEach>
                        </select>
                    </div>


                    <div class="form-group"><label>Покупатель</label>
                        <select name="dealClient2" class="form-control">
                            <c:forEach items="${clientsEntities}" var="clients">
                                <option value="<c:out value="${clients.idClients}"/>"
                                        <c:if test="${clients.idClients eq curClients2}">
                                            selected
                                        </c:if>
                                ><c:out value="${clients.snmClients}"/></option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group"><label>Вид сделки</label>
                        <select name="dealView" class="form-control">
                            <c:forEach items="${viewDealEntities}" var="viewDeal">
                                <option value="<c:out value="${viewDeal.idViewDeal}"/>"
                                        <c:if test="${viewDeal.idViewDeal eq curViewDeal}">
                                            selected
                                        </c:if>
                                ><c:out value="${viewDeal.viewDeal}"/></option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group"><label>Недвижимость</label>
                        <select name="dealProperty" class="form-control">
                            <c:forEach items="${propertyEntities}" var="property">
                                <option value="<c:out value="${property.idProperty}"/>"
                                        <c:if test="${property.idProperty eq curProperty}">
                                            selected
                                        </c:if>
                                ><c:out value="${property.property}"/></option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group"><label>Параметры</label>
                        <select name="dealPropertyParam" class="form-control">
                            <c:forEach items="${parampropertyEntities}" var="paramproperty">
                                <option value="<c:out value="${paramproperty.idParamProperty}"/>"
                                        <c:if test="${paramproperty.idParamProperty eq curParamProperty}">
                                            selected
                                        </c:if>
                                >
                                    Площадь: <c:out value="${paramproperty.paramPropertyArea}"/>;
                                    улица: <c:out value="${paramproperty.locationEntity.streetsEntity.streetsName}"/>
                                    дом: <c:out value="${paramproperty.locationEntity.locationHouse}"/>;
                                    этаж: <c:out value="${paramproperty.paramPropertyFloor}"/>;
                                    описание: <c:out value="${paramproperty.paramPropertyDescription}"/>
                                </option>
                            </c:forEach>
                        </select>
                        <a href="WorkTaskController?action=add_paramproperty">Добавить</a>
                    </div>

                    <div class="form-group"><label>Содрудник</label>
                        <select name="dealEmployee" class="form-control">
                            <c:forEach items="${employeesEntities}" var="employees">
                                <option value="<c:out value="${employees.idEmployees}"/>"
                                        <c:if test="${employees.idEmployees eq curEmployees}">
                                            selected
                                        </c:if>
                                ><c:out value="${employees.employeesSnm}"/></option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group"><label>Сумма сделки</label>
                        <input type="text" name="dealSum" class="form-control" placeholder=""
                               value="<c:out value="${dealEntity.dealSum}"/>"/>
                    </div>

                    <div class="form-group"><label>Процент %</label>
                        <input type="text" name="dealPercent" class="form-control" placeholder=""
                               value="<c:out value="${dealEntity.dealPercent}"/>"/>
                    </div>

                    <button type="submit" class="btn btn-primary">Сохранить</button>

                </div>
            </form>
        </div>
    </div>


<jsp:include page="includ/footer.jsp"></jsp:include>