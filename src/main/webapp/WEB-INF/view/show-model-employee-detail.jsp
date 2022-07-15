<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>
Dear, you are welcome!!!
</h2>
<br>
<br>

<%-- Your name: ${param.employeeName} --%>

Name: ${employee.name}
<br>
<br>
Surname: ${employee.surname}
<br>
<br>
Phone number: ${employee.numberPhone}
<br>
<br>
E-mail: ${employee.email}
<br>
<br>
Salary: ${employee.salary}
<br>
<br>
Department: ${employee.department}
<br>
<br>
Select Car: ${employee.car}
<br>
<br>
Language(s):
<ul>
<c:forEach var = "lang" items = "${employee.languages}">
<li>
${lang}
</li>
</c:forEach>
</ul>
</body>
</html>