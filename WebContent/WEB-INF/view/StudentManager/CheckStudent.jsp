<sec:authorize access="hasAnyRole('ROLE_STUDENT_MANAGER')">	
	<div>
		<!--  add our html table here -->
	
		<form:form  action="CheckedStudent" method="POST" class="ui form">
	
			<p>Username: <input type="text" name="username">
			<p><input type="submit">
		</form:form>
		
			
	</div>
</sec:authorize>
<% if(request.getParameter("exist") == null){
	out.println("");
} else{
	out.println("<b>"+request.getParameter("exist")+"</b>");
}
%>