<%--
  Created by IntelliJ IDEA.
  User: Vitya
  Date: 30.05.2016
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
             pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>University</title>

  <style>
    tr:first-child{
      font-weight: bold;
      background-color: #C6C9C4;
    }
  </style>
</head>
<body>

<h2>List of Coach</h2>
<table>
  <tr>
    <td>NAME</td>
  </tr>
  <c:forEach items="${coachs}" var="coach">
    <tr>
      <td><a href="<c:url value='/findteam${coach.team.id}' />">${coach.name}</a></td>
    </tr>
  </c:forEach>
</table>
<br/>
<a href="<c:url value='/' />">Teams</a><br/>
<a href="<c:url value='/players' />">Players</a><br/>
<a href="<c:url value='/countrys' />">Country</a><br/>
<a href="<c:url value='/coachs' />">Coachs</a><br/>


</body>
</html>