<h1>Usuario cadastrado com sucesso</h1>
<section>
<p>Nome: <strong><%= request.getAttribute("nome")%></strong></p>
<p>Sobrenome: <strong><%= request.getAttribute("sobrenome")%></strong></p>
<p>Telefone: <strong><%= request.getAttribute("telephone")%></strong></p>
<p>Email: <strong><%= request.getAttribute("email")%></strong></p>
<p>Rua: <strong><%= request.getAttribute("rua")%></strong></p>
<p>Cep: <strong><%= request.getAttribute("cep")%></strong></p>

<input type="button" value="retornar" onclick="history.back()">
</section>