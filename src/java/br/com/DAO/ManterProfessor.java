/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.controle.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ManterProfessor extends DAO{
    public void inserir(Professor pf){
        try {
            abrirBanco();
            String query = "INSERT INTO professor(codigo,nome,disciplina,turno) values(null,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, pf.getNome());
            ps.setString(2, pf.getDisciplina());
            ps.setString(3, pf.getTurno());
            ps.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
    
    public ArrayList pesquisarTudo(){
       ArrayList<Professor> listapf = new ArrayList<Professor>();
            try {
            abrirBanco();
            String query = "select  * FROM professor";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Professor ntcben;
            while (rs.next()){
                ntcben = new Professor();
                ntcben.setCodigo(rs.getInt("codigo"));
                ntcben.setNome(rs.getString("nome"));
                ntcben.setDisciplina(rs.getString("disciplina"));
                ntcben.setTurno(rs.getString("turno"));
                listapf.add(ntcben);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
        return listapf;
    }
    
   public void deletar (Professor pf) throws Exception{
       try {
           abrirBanco();
           String query = "DELETE FROM professor where codigo=?";
           ps= (PreparedStatement) con.prepareStatement(query);
           ps.setInt(1, pf.getCodigo());
           ps.execute();
           fecharBanco();
       } catch (Exception e) {
           System.out.println("Erro"+ e.getMessage());
       }
   }
   // Inicio Pesquisar 
   public Professor pesquisar(Professor pf) throws Exception{
       try {
           //Professor pf = new Professor();
           abrirBanco();
           String query = "select * FROM professor where codigo=?";
           ps = con.prepareStatement(query);
           ps.setInt(1,pf.getCodigo());
           ResultSet rs = ps.executeQuery();
           if (rs.next()){
               pf.setCodigo(rs.getInt("codigo"));
               pf.setNome(rs.getString("nome"));
               pf.setDisciplina(rs.getString("disciplina"));
               pf.setTurno(rs.getString("turno"));
               return pf;
           }
       } catch (Exception e) {
           System.out.println("Erro"+ e.getMessage());
       }
       return null;
    }
   
   public void atualizar(Professor pf) throws Exception{
       try {
           abrirBanco();
           String query = "UPDATE professor SET nome=?,disciplina=?,turno=? WHERE codigo=?";
           ps=con.prepareStatement(query);
           ps.setString(1, pf.getNome());
           ps.setString(2, pf.getDisciplina());
           ps.setString(3, pf.getTurno());
           ps.setInt(4, pf.getCodigo());
           ps.executeUpdate();
           fecharBanco();
       } catch (Exception e) {
           System.out.println("Erro" + e.getMessage());
       }
   }
    
    
}
