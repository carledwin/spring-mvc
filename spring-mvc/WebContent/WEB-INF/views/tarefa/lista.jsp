<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
	<a href="novaTarefa" >Criar nova tarefa</a>
	<br />
	<br />
	<table>
	<tr>
		<th>Id</th>
		<th>Descrição</th>
		<th>Finalização</th>
		<th>Data de finalização</th>
	</tr>
	<c:forEach items="${tarefas}" var="tarefa">
	<tr>
		<td>${tarefa.id}</td>
		<td>${tarefa.descricao}</td>
		<c:if test="${tarefa.finalizado eq false}">
			<td>Finalizado</td>
		</c:if>
		<c:if test="${tarefa.finalizado eq true }" >
			<td>Finalizado</td>
		</c:if>
		<td>
			<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />
		</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>