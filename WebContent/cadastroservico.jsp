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
    <nav id= "menu" class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img id="logo" src="imagens\Imagem1.png" alt="">
                </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-12">

            	<div class="row">
            		<div class="col-lg-4">

		                <h1>Cadastre seu Serviço</h1>

		                
						<div class="input-group">
						  <label>Nome</label>
						  <input type="text" class="form-control" placeholder="Nome completo">
						</div>
                        
                        <div class="input-group">
                          <label>Endereço</label>
                          <input type="text" class="form-control" placeholder="Rua, AV..">
                        </div>

                        <div class="input-group">
                          <label>Telefone </label>
                          <input type="text" class="form-control" placeholder="(xx)xxxxx-xxxx">
                        </div>

                        <p></p>

                        <div class="input-group">
                          <label>profissão</label> <p></p>
                          <td align="left">
						    <select name="Profissao"> 
						    <option value="Diarista">Diarista</option> 
						    <option value="Encanador">Encanador</option> 
						    <option value="Pedreiro">Pedreiro</option> 
						    <option value="Pintor">Pintor</option> 
						    <option value="Seralheiro">Seralheiro</option> 
						    <option value="outros">outros</option> 
						    
						       </select>
						   </td>
                        </div>

                        <p></p>
                        <div class="input-group">
                          <label>Outros* </label>
                          <input type="text" class="form-control" placeholder="Caso marque a opcão outros">
                        </div>

                        <p></p> 

                        <div class="input-group">
                          <label>Descreva seu serviço </label>
                          <input type="text" class="form-control" placeholder=" Escreva">
                        </div> 
                                        
                            <p></p>

						<div class="btn-group">
  							<a href = "cadastroservico.jsp"><button type="button" class="btn btn-primary">Salvar</button></a> 
                            <a href = "principal.jsp"><button type="button" class="btn btn-default">Voltar</button></a>
  						</div>

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