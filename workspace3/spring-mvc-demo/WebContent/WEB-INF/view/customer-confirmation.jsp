<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>customer Confirmation</title>
</head>
<body>
The Customer is confirmed: ${customer.firstName}${customer.lastName} 
<br><br>
Free Passes: ${customer.freePass}
<br><br>
${customer.firstName}${customer.lastName} postal code is ${customer.postalCode}
<br><br>
${customer.firstName}${customer.lastName} course code is ${customer.courseCode}

</body>
</html>