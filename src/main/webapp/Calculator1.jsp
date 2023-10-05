<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
<style type="text/css">
body {
	display: flex;
	align-items: center;
	justify-content: center;
}

</style>
</head>
<body>
	<form>
		<fieldset>
			<legend>Calculator</legend>
			<table>
				<tr>
					<td align="center" colspan="2"><input type="text" name="x" value="${x}"></td>
					<td align="center" colspan="2"><input type="text" name="y" value="${y}"></td>
				</tr>
				<tr>
					<td align="center" colspan="4"><input type="text" name="z" value="${z}"></td>
				</tr>
				<tr>
					<td align="center"><button formaction="add1">+</button></td>
					<td align="center"><button formaction="sub1">-</button></td>
					<td align="center"><button formaction="mul1">*</button></td>
					<td align="center"><button formaction="div1">/</button></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>