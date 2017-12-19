<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
    <head>

        <script src="includ/js/bootstrap.min.js"></script>
        <script src="includ/js/jquery-1.9.1.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>

        <title>
            <c:out value="${title}"/>
        </title>
    </head>
    <body>
    <nav class="navbar navbar-expand-md bg-primary navbar-dark">
        <div class="container">
            <a class="navbar-brand" href="#"><i class="fa d-inline fa-lg fa-cloud"></i><b>   Учет сделок агентства недвижимости</b></a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
            <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#"></i> <c:out value="${user}"/></a>
                    </li>

                </ul>
                <a class="btn navbar-btn ml-2 text-white btn-secondary"><i class="fa d-inline fa-lg fa-user-circle-o"></i> Выйти</a>

            </div>
        </div>
    </nav>
    <nav class="navbar navbar-expand-md bg-secondary navbar-dark">
        <div class="container">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link
                            <c:if test="${markdeal eq 1}">
                                active
                            </c:if>

                              <c:if test="${marklocation eq 1}">
                                active
                            </c:if>
                              <c:if test="${markparamproperty eq 1}">
                                active
                            </c:if>
" href="WorkTaskController?action=deal" text-white >Сделки</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link
                            <c:if test="${markclients eq 1}">
                                active
                            </c:if>
                        " href="WorkTaskController?action=clients">Клиенты</a>
                    </li>

                    <c:if test="${role eq 'admin'}">
                        <li class="nav-item">
                            <a class="nav-link
                            <c:if test="${markemployees eq 1}">
                                active
                            </c:if>
                        " href="WorkTaskController?action=employees">Сотрудники</a>
                        </li>
                    </c:if>
                    <li class="nav-item">
                        <a class="nav-link
                            <c:if test="${markviewdeal eq 1}">
                                active
                            </c:if>

                            <c:if test="${markstreets eq 1}">
                                active
                            </c:if>

                            <c:if test="${markpositions eq 1}">
                                active
                            </c:if>

                            <c:if test="${markproperty eq 1}">
                                active
                            </c:if>

                  " href="WorkTaskController?action=viewdeal">Cправочники</a>
                    </li>
                </ul>
                <form class="form-inline m-0">
                    <input class="form-control mr-2" type="text" placeholder="Поиск">
                    <button class="btn btn-primary" type="submit">Найти</button>
                </form>
            </div>
        </div>
    </nav>
    </body>
</html>