<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Adicionar tarefas</title>
</head>
<body>
<h3>Adicionar tarefas</h3>


<form action="adicionaTarefa" method="post">
	Descrição: <br />
	<textarea name="descricao" rows="5" cols="100"></textarea>
	<br />
		<form:errors path="tarefa.descricao" cssStyle="color:red" />
	<br />
	
	<input type="submit" value="Adicionar" />
</form>
</body>
</html>