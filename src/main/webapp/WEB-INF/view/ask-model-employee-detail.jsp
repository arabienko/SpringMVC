<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h2>
Dear, write your name, please!!!
</h2>
<br>
<form:form action="showModelEmployee" modelAttribute = "employee">
Name <form:input path="name"/>
<form:errors path="name"/>
<br>
<br>
Surname <form:input path="surname"/>
<form:errors path="surname"/>
<br>
<br>
Phone number <form:input path="numberPhone"/>
<form:errors path="numberPhone"/>
<br>
<br>
E-mail <form:input path="email"/>
<form:errors path="email"/>
<br>
<br>
Salary <form:input path="salary"/>
<form:errors path="salary"/>
<br>
<br>
Department <form:select path = "department" >
<%--
<form:option value = "Information Technology" label = "IT"/>
<form:option value = "Human Resources" label = "HR"/>
<form:option value = "Sales Department" label = "Sales"/>
--%>
<form:options items = "${employee.departments}" />
</form:select>
<br><br>
Which car do you want:
<%--
<form:radiobutton value = "Information Technology" label = "IT"/>
<form:radiobutton value = "Human Resources" label = "HR"/>
<form:radiobutton value = "Sales Department" label = "Sales"/>
--%>
   <form:radiobuttons path ="car" items = "${employee.cars}" />
<br><br>
Foreign language(s):
<%--
EN <form:checkbox path = "languages" value = "English"/>
BY <form:checkbox path = "languages" value = "Belorussian"/>
FR <form:checkbox path = "languages" value = "French"/>
--%>
<form:checkboxes path = "languages" items = "${employee.langMap}"/>
<br><br>

<input type = "submit" name = "OK"/>
</form:form>
</body>
</html>