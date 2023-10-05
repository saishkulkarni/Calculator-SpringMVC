<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form>
		<input type="number" name="num1"> <input type="number"
			name="num2">
		<button formaction="add">Add</button>
		<button formaction="sub" formmethod="post">Sub</button>
		<button formaction="mul" formmethod="post">Mul</button>
		<button formaction="div" formmethod="post">Div</button>
	</form>
</body>
</html>