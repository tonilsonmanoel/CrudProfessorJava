<%-- 
    Document   : CadastroProfessor
    Created on : 08/10/2022, 13:48:48
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de professor</title>
    </head>
    <body>
        <h1>Cadastrar Professor</h1>
        <form action="professor.do" method="POST">
            Nome: <input type="text" name="nome"><br><br>
            Disciplina: <input type="text" name="disciplina"><Br><BR>
            Turno: <select name="turno">
                <option value="manha">Manhã</option>
                <option value="tarde">Tarde</option>
                <option value="noite">Noite</option>
            </select><br><br>
            <input type="submit" value="Cadastar">
            
        </form>
    </body>
</html>
