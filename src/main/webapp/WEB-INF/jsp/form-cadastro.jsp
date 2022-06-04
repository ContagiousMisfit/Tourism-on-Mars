<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Adicionar Viagem ${viagem.id}</title>
</head>
<body>

	<c:if test="${viagemAdicionadaComSucesso}">
		<h3>Viagem adicionada com sucesso. Id: ${viagemSalva.id}</h3>
	</c:if>

	<c:url var="viagem_salva_url" value="/viagens/save" />
	<form:form action="${save_viagem_url}" method="post"
		modelAttribute="formRequest">

		<form:label path="id">Id: ${id}</form:label>
		<br>
		<form:input type="text" path="id" readonly="true" />
		<br>

		<form:label path="dataDecolagem">Data da decolagem:</form:label>
		<br>
		<form:input type="text" path="dataDecolagem" />
		<br>

		<form:label path="diasEstadia">Dias estadia:</form:label>
		<br>
		<form:input type="text" path="diasEstadia" />
		<br>

		<form:label path="modelo">Modelo da nave:</form:label>
		<br>
		<form:input type="text" path="modelo" />
		<br>

		<form:label path="assentos">Assentos:</form:label>
		<br>
		<form:input type="text" path="assentos" />
		<br>

		<h3>Informações do Primeiro comandante</h3>

		<form:label path="matriculaInterespacial">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial" />
		<br>

		<form:label path="nome">Nome:</form:label>
		<br>
		<form:input type="text" path="nome" />
		<br>

		<h3>Informações do Segundo comandante</h3>

		<form:label path="matriculaInterespacial">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial" />
		<br>

		<form:label path="nome">Nome:</form:label>
		<br>
		<form:input type="text" path="nome" />
		<br>

		<input type="submit" name="salver" value="Salvar" />
	</form:form>
</body>
</html>