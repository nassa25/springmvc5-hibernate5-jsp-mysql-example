<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lecteur Form</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.1.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	</head>
	<body>
		<div class="container">
		  <div class="col-md-offset-2 col-md-7">
		   <h2 class="text-center">SPRING MVC + JSP + MySQL</h2>
		   <div class="panel panel-info">
		    <div class="panel-heading">
		     <div class="panel-title">Ajoute Lecteur</div>
		    </div>
		    
		    <div class="panel-body">
		     <form:form action="saveLecteur" cssClass="form-horizontal"
		      method="post" modelAttribute="lecteur">
		      <form:hidden path="idLecteur" />
		
		      <div class="form-group">
		       <label for="numeroLecteur" class="col-md-3 control-label">Numero Lecteur</label>
		       <div class="col-md-9">
		        <form:input path="numeroLecteur" cssClass="form-control" />
		       </div>
		      </div>
		      
		      <div class="form-group">
		       <label for="nomLecteur" class="col-md-3 control-label">Nom Lecteur</label>
		       <div class="col-md-9">
		        <form:input path="nomLecteur" cssClass="form-control" />
		       </div>
		      </div>
		      		
		      <div class="form-group">
		       <!-- Button -->
		       <div class="col-md-offset-3 col-md-9">
		        <form:button cssClass="btn btn-primary">Valider</form:button>
		       </div>
		      </div>
		
		     </form:form>
		    </div>
		   </div>
		  </div>
 	</div>
	</body>
</html>