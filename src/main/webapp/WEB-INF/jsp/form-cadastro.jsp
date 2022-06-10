<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link href="../css/form.css" rel="stylesheet" type="text/css">
<title>Adicionar Viagem ${viagem.id}</title>
</head>
<body>

	<c:if test="${viagemAdicionadaComSucesso}">
		<h3>Viagem adicionada com sucesso. Id: ${viagemSalva.id}</h3>
	</c:if>

	<c:url var="viagem_salva_url" value="/viagens/save" />
	<form:form action="${viagem_salva_url}" method="post"
		modelAttribute="viagem">

		<form:label placeholder="gerado automaticamente :)" path="id"
			readonly="true">Id: ${id}</form:label>
		<br>
		<form:input type="text" path="id" readonly="true" size="60" />
		<br>

		<form:label path="dataDecolagem">Data da decolagem:</form:label>
		<br>
		<form:input path="dataDecolagem" size="60" />
		<br>

		<form:label path="diasEstadia">Dias estadia:</form:label>
		<br>
		<form:input type="text" path="diasEstadia" size="60" />
		<br>

		<form:label path="modeloNave">Modelo da nave:</form:label>
		<br>
		<form:input type="text" path="modeloNave" size="60" />
		<br>

		<form:label path="assentos">Assentos:</form:label>
		<br>
		<form:input type="text" path="assentos" size="60" />
		<br>

		<h3>Informações do Primeiro comandante</h3>

		<form:label path="matriculaInterespacial1">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial1" size="60" />
		<br>

		<form:label path="comandante1">Nome:</form:label>
		<br>
		<form:input type="text" path="comandante1" size="60" />
		<br>

		<h3>Informações do Segundo comandante</h3>

		<form:label path="matriculaInterespacial2">Matrícula Interespacial:</form:label>
		<br>
		<form:input type="text" path="matriculaInterespacial2" size="60" />
		<br>

		<form:label path="comandante2">Nome:</form:label>
		<br>
		<form:input type="text" path="comandante2" size="60"/>
		<br>

		<input type="submit" name="salvar" value="Salvar" class="glass-btn" />

	</form:form>
</body>
</html>