<html>
	<head>
		<title>WELCOME TO APP</title>
	</head>
	<body>
		<pre>
		<h2>WELCOME TO REGISTER FORM </h2>
		<form action="register" method="POST">
			ID  : <input type="text" name="employeeId"/>
			NAME: <input type="text" name="employeeName"/>
			SAL : <input type="text" name="employeeSalary"/>
			PWD : <input type="password" name="employeePassword"/>
			DEPT: <select name="employeeDeportment">
					<option value="DEV">DEV</option>
					<option value="QA">QA</option>
					<option value="BA">BA</option>
				  </select>
		    ADDR: <textarea name="employeeAddress"></textarea>
			<input type="submit" value="CREATE"/>
		</form>
		</pre>
	</body>
</html>