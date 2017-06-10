<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>4HOUSE</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/logo-nav.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<!-- Navigation -->
	<nav id="menu" class="navbar navbar-default navbar-fixed-top"
		role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#"> <img id="logo"
				src="imagens\Imagem1.png" alt="">
			</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#">About</a></li>
				<li><a href="#">Services</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">

				<div class="row">
					<div class="col-lg-4">
						<form action="cadastrar?acao=Cadastrar" method="POST">
							<h1>Cadastro</h1>

							<div class="alert alert-danger" role="alert">
								<span class="glyphicon glyphicon-exclamation-sign"
									aria-hidden="true"></span> <span class="sr-only">Error:</span>

							</div>

							<div class="input-group">
								<label>Nome</label> <input name="nome" type="text" class="form-control"
									placeholder="Username">
							</div>

							<div class="input-group">
								<label>Email</label> <input name="email" type="text" class="form-control"
									placeholder="Exemple@...">
							</div>

							<div class="input-group">
								<label>Senha</label> <input name="senha" type="password" class="form-control"
									placeholder="Senha">
							</div>

							<div class="input-group">
								<label>Confirme senha</label> <input name="confirmaSenha" type="password"
									class="form-control" placeholder="Senha">
							</div>

							<div class="input-group">
								<label>Telefone</label> <input name="telefone" type="text" class="form-control"
									placeholder="(xx)xxxxx-xxxx">
							</div>

							<p></p>

							<div class="input-group">
								<label>Selecione Seu bairro</label>
								<p></p>
								<td align="left"><select name="bairro">
										<option value="Areias">Areias</option>
										<option value="Barra de jangada">Barra de jangada</option>
										<option value="Bulhoes">Bulhoes</option>
										<option value="Cajueiro seco">Cajueiro seco</option>
										<option value="Candeias">Candeias</option>
										<option value="Cavaleiro">Cavaleiro</option>
										<option value="Centro">Centro</option>
										<option value="Comportas">Comportas</option>
										<option value="Curado">Curado</option>
										<option value="curado I">Curado I</option>
										<option value="Dois carneiros">Dois carneiros</option>
										<option value="Engenho velho">Engenho velho</option>
										<option value="Floriano">Floriano</option>
										<option value="guararapes">Guararapes</option>
										<option value="Jardim jordao">Jardim jordao</option>
										<option value="jordao">Jordao</option>
										<option value="Manassu">Manassu</option>
										<option value="Marcos freire">Marcos freire</option>
										<option value="Muribeca">Muribeca</option>
										<option value="Muribeca dos guararapes">Muribeca dos
											guararapes</option>
										<option value="Muribequinha">Muribequinha</option>
										<option value="Piedade">Piedade</option>
										<option value="Pontizinha">Pontizinha</option>
										<option value="prazeres">prazeres</option>
										<option value="Santana">Santana</option>
										<option value="santo Aleixo">Santo Aleixo</option>
										<option value="Socorro">Socorro</option>
										<option value="Sucupira">Sucupira</option>
										<option value="Vila rica">Vila rica</option>
										<option value="vista Alegre">Vista Alegre</option>
										<option value="Zumbi Pacheco">Zumbi Pacheco</option>
								</select></td>

							</div>

							<p></p>

							<div class="btn-group">
								<input type="submit" class="btn btn-primary" value="Acessar" />
								<a href="index.jsp"><button type="button" class="btn btn-default">Voltar</button></a>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>
</html>