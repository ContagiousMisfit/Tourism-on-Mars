<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="../css/viagens.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div>
		<div class="container">
			<p>Lista de Viagens</p>

			<p>
				<a href="viagens/form" class="glass-btn">Adicionar novo</a>
			</p>
		</div>
		<div class='parent'>
			<c:forEach var="viagem" items="${viagem}">
				<div class='child'>
					<img alt="Desenho de uma nave espacial" src="../assets/photo.png">
					<p class="decolagem">
						<b>Data decolagem:</b> ${viagem.dataDecolagem}
					</p>
					<a class="icon" href="viagens/${viagem.id}"><i
						class="fa fa-trash-o"></i></a> <a class="icon"
						href="viagens/${viagem.id}/delete"><i class="fa fa-edit"></i></a>
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


				</div>
		</div>
		</c:forEach>
	</div>
</body>
</html>