<%-- 
    Document   : addAddress
    Created on : 2014-08-07, 15:10:16
    Author     : Adrian Lapierre <adrian@soft-project.pl>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form:form modelAttribute="address" action="save-address" method="POST">
            <form:label path="citi">Miasto: </form:label>
            <form:input path="citi" placeholder="Miasto"/> <form:errors path="citi"/> <br>
            
            <form:label path="postcode">Kod pocztowy: </form:label>
            <form:input path="postcode" placeholder="Kod pocztowy"/> <form:errors path="postcode"/><br>
            
            <form:label path="street">Ulica: </form:label>
            <form:input path="street" placeholder="Ulica"/> <form:errors path="street"/><br>
        
            <form:button>Zapisz</form:button>
        
        </form:form> 
        
        
    </body>
</html>
