<%--
  Created by IntelliJ IDEA.
  User: Vitya
  Date: 30.05.2016
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>University Enrollments</title>

  <style>
    tr:first-child{
      font-weight: bold;
      background-color: #C6C9C4;
    }
  </style>
</head>
<body>

<h2>List of Countrys</h2>
<table>
  <tr>
    <td>NAME</td><td>Rate</td>
  </tr>
  <c:forEach items="${countrys}" var="country">
    <tr>
      <td>${country.name}</td>
      <td>${country.rate}</td>
  </c:forEach>
</table>
<br/>
<a href="<c:url value='/' />">Teams</a><br/>
<a href="<c:url value='/players' />">Players</a><br/>
<a href="<c:url value='/countrys' />">Country</a><br/>
<a href="<c:url value='/coachs' />">Coachs</a><br/>
</body>
</html>
