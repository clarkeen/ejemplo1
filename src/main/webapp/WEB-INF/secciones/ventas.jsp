<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas de sucursal</title>
    </head>
    <body>
        <h1>Ventas de sucursales</h1>
        <c:if test="${empty sucursal and empty error_validacion}">
            <p class="error">No ha seleccionado una sucursal</p>
        </c:if>
        <c:if test="${not empty error_validacion}">
            <p class="error">${error_validacion}</p>
        </c:if>
            
        <c:if test="${not empty total}">
            <p>Ventas de sucursal ${sucursal}: $${total}</p>
        </c:if>
            <p>
                <c:forEach begin="1" end="5" var="i">
                    <a href="<c:url value="/v1/ventas?suc=${i}"/>">Sucursal ${i}</a> | 
                </c:forEach>
            </p>
        <p><a href="<c:url value="/"/>">Volver al inicio</a></p>
    </body>
    <style>
        p.error {color: red;}
    </style>
</html>