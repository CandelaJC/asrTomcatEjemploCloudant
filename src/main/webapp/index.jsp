<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pr�ctica 11 ASR</title>
</head>
<body>
<h1>Pr�ctica 11 de ASR Candela Janeiro</h1>
<h2>Integraci�n con Servicios Cloudant y Watson Language Translator</h2>
<hr />
<p>Opciones:</p>
<ul>
<li><a href="listar">Listar</a></li>
<li>Palabra en espa�ol: <!-- <input type="text" id="palabra_traducir">-->
<form action="/insertar" method="post">
<input type="text" id="palabra" value="palabra">
<input type="submit" name="guardar" value="Guardar en Cloudant"></a></li>

</form>
<!-- nsertar?palabra="+ document.getElementById('palabra_traducir').value>
<input type="submit" name="guardar" value="Guardar en Cloudant"></a></li>-->
</ul>
</body>
</html>