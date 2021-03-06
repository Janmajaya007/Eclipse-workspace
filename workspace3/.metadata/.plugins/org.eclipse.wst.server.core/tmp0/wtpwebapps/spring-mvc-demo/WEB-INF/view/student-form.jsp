<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>StudentForm</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name:<form:input path="firstName" />
		<br>
		<br>
	Last Name:<form:input path="lastName" />
		<br>
		<br>
	Country:
	<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>

		<br>
		<br>
	favorite Language:
	Java<form:radiobutton path="favoriteLanguage" value="Java" />
	C++<form:radiobutton path="favoriteLanguage" value="C++" />
	Python<form:radiobutton path="favoriteLanguage" value="Python" />
	PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
	C#<form:radiobutton path="favoriteLanguage" value="C#" />
		<br>
		<br>
	Operating System
	Linux<form:checkbox path="operatingSystem" value="Linux" />
	MicroSoft Windows<form:checkbox path="operatingSystem"
			value="MicroSoft Windows" />
	iOS<form:checkbox path="operatingSystem" value="iOS" />
		<input type="submit" value="submit" />
	</form:form>

</body>
</html>

