<%-- 
    Document   : tablaVentas
    Created on : 15/08/2019, 16:11:23
    Author     : universidad
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catálogo de productos</title>
    </head>
    <body>
        <table>
            <tr>
                <th>producto</th>
                <th>presio</th> 
            </tr>
            <c:forEach items="${productos}" var="producto">
                <tr>
                    <td><c:out value="${producto.nombre}"/></td>
                    <td><c:out value="${producto.precio}"/></td>
                </tr>
            </c:forEach>
        </table>
        <a href="<c:url value="/v1/productos"/>">Descargar catálogo de productos</a>
    </body>
</html>
