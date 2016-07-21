<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><table width="50%" align="center">
<form:form action="${session.getContextPath()}/shoppingAdda/upload" commandName="upload" method="POST" enctype="multipart/form-data">

 <tr>
        <td width="20%">
            <form:label path="image">
                <spring:message text="Please select a image to upload a image"/>
            </form:label>
        </td>
        <td width="20%">
            <form:input path="image" type="file" />
        </td>
        </tr>
        <tr>
		<td>        
            <input type="submit"  value="<spring:message text="upload"/>">
        </td>
    </tr>
    
</form:form>
</table>





</body>
</html>