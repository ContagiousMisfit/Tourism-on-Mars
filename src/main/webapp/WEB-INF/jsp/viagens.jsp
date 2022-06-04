<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<p>Lista de Viagens</p>
	
	<p><a href="viagens/form">Adicionar novo</a></p>		
	<table>
		<thead>
			<tr>
				<th>Modelo da nave</th>
				<th>Data da viagem</th>
				<th>Nome</th>
				<th>Matrícula Interespacial</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="viagem" items="${viagem}">
				<tr>
					<td>${viagem.modelo}</td>
					<td>${viagem.dataViagem}</td>
					<td>${viagem.nome}</td>
					<td>${viagem.matriculaInterespacial}</td>
					<td><a href="viagens/${viagem.id}">Edit</a></td>
					<td><a href="viagens/${viagem.id}/delete">Apagar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>