<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
             <h1>Aula</h1>
        
        
             <form action="pessoa" method="GET">
                 <div class="form-group">
                     <label for="nome">Nome</label>
                     <input type="text" name="pessoa.nome" class="form-group">
                 </div>
                 <div class="form-group">
                     <label for="idade">Idade</label>
                     <input type="number" name="pessoa.idade" class="form-group">
                 </div>
                 
                 <label class="radio-inline">
                 <input type="radio" name="pessoa.sexo" id="inlineRadio1" value="Masculino"> Masculino
                 </label>
                 <label class="radio-inline">
                 <input type="radio" name="pessoa.sexo" id="inlineRadio2" value="Feminino"> Feminino
                 </label>
                 <label class="radio-inline">
                 <input type="radio" name="pessoa.sexo" id="inlineRadio3" value="Outros"> Outros
                 </label>
                 <button class="btn btn-default" type="submit">
                     Enviar
                 </button>
            
            
            </form>
        </div>
    </body>
</html>
