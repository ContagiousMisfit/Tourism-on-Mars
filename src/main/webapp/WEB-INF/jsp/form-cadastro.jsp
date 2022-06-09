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
	<form:form action="${viagem_salva_url}" method="post"
		modelAttribute="viagem">

		<form:label path="id" readonly="true">Id: ${id}</form:label>
		<br>
		<form:input type="text" path="id" readonly="true" />
		<br>

		<form:label path="dataDecolagem">Data da decolagem:</form:label>
		<br>
		<form:input path="dataDecolagem" />
		<br>

		<form:label path="diasEstadia">Dias estadia:</form:label>
		<br>
		<form:input type="text" path="diasEstadia" />
		<br>

		<form:label path="modeloNave">Modelo da nave:</form:label>
		<br>
		<form:input type="text" path="modeloNave" />
		<br>

		<form:label path="assentos">Assentos:</form:label>
		<br>
		<form:input type="text" path="assentos" />
		<br>

		<h3>Informações do Primeiro comandante</h3>

		<form:label path="matriculaInterespacial1">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial1" />
		<br>

		<form:label path="comandante1">Nome:</form:label>
		<br>
		<form:input type="text" path="comandante1" />
		<br>

		<h3>Informações do Segundo comandante</h3>

		<form:label path="matriculaInterespacial2">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial2" />
		<br>

		<form:label path="comandante2">Nome:</form:label>
		<br>
		<form:input type="text" path="comandante2" />
		<br>

		<input type="submit" name="salvar" value="Salvar" />
		
	</form:form>
</body>
</html>