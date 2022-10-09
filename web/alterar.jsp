<%-- 
    Document   : form-alterar
    Created on : 08/10/2022, 21:41:13
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
       <title>Alterar</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
         <%  
       
        
         String vcodigo = (String) request.getAttribute("uCodigo").toString();
         String vnome    = (String) request.getAttribute("uNome").toString();
         String vdisciplina   = (String) request.getAttribute("uDisciplina").toString();
         String vturno =(String) request.getAttribute("uTurno").toString();
        
    %>
    </head>
  <body>
      <form action="alter.do" method="POST">
          <input type="hidden" name="cod" value="<%=vcodigo%>">
          nome: <input type="text" name="nome" value="<%=vnome%>"><br>
          Disciplina: <input type="text" name="disciplina" value="<%=vdisciplina%>"><br>
          Turno: <input type="text" name="turno" value="<%=vturno%>"><br>
          <input type="submit" value="Alterar">
          
      </form>
        
    
  </body>
   
</html>
