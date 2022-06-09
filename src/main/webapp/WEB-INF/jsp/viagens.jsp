<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="../css/viagens.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		<div class="container">
			<p>Lista de Viagens</p>

			<p>
				<a href="viagens/form">Adicionar novo</a>
			</p>

			<div class='parent'>
				<c:forEach var="viagem" items="${viagem}">
					<div class='child'>
						<img alt="Desenho de uma nave espacial" src="../assets/photo.png">
						<p>
							<b>Data decolagem:</b> ${viagem.dataDecolagem}
						</p>
						<p>
							<b>Data retorno:</b> ${viagem.dataRetorno}
						</p>
						<a href="viagens/${viagem.id}">Editar</a>
					</div>
					<div class='child'>
						<p class='spaceship-name'>${viagem.modeloNave}</p>
						<p>
							Nome do primeiro comandante: <br> <b>${viagem.comandante1}</b>
						</p>

						<p>
							Matrícula Interespacial: <br> <b>${viagem.matriculaInterespacial1}</b>
						</p>

						<p>
							Nome do segundo comandante: <br> <b>${viagem.comandante2}</b>
						</p>

						<p>
							Matrícula Interespacial: <br> <b>${viagem.matriculaInterespacial2}</b>
						</p>
						<a href="viagens/${viagem.id}/delete">Apagar</a>
					</div>
			</div>
			</c:forEach>
</body>
</html>