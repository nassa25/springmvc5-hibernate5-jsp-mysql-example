<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lecteur Page</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.1.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	</head>
	<body>
		
		<div class="container">
		  <div class="col-md-offset-1 col-md-10">
		   <h2>Gestion des Lecteurs</h2>
		   <hr />
		
		   <input type="button" value="Add Lecteur" onclick="window.location.href='showForm'; return false;"
		    class="btn btn-primary" />
		    <br/><br/>
		   <div class="panel panel-info">
		    <div class="panel-heading">
		     <div class="panel-title">Lecteur Liste</div>
		    </div>
		    <div class="panel-body">
		     <table class="table table-striped table-bordered">
		      <tr>
		       <th>Numero</th>
		       <th>Nom</th>
		       <th>Action</th>
		      </tr>
		
		      <c:forEach var="tempLecteur" items="${lecteur}">
		
		       <c:url var="updateLink" value="/lecteur/updateForm">
		        <c:param name="lecteurId" value="${tempLecteur.idLecteur}" />
		       </c:url>
		       <c:url var="deleteLink" value="/lecteur/delete">
		        <c:param name="lecteurId" value="${tempLecteur.idLecteur}" />
		       </c:url>
		
		       <tr>
		        <td>${tempLecteur.numeroLecteur}</td>
		        <td>${tempLecteur.nomLecteur}</td>
		        		
		        <td>
		        <a href="${updateLink}">Update</a> |
		         <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this Lecteur?'))) return false">Delete</a>
		        </td>
		
		       </tr>
		
		      </c:forEach>
		
		     </table>
		
		    </div>
		   </div>
		  </div>

 		</div>
		
	</body>
</html>