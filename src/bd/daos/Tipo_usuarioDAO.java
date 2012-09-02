package bd.daos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import bd.beans.Tipo_usuario;
import bd.conexao.Conexao;


public class Tipo_usuarioDAO
{
  @SuppressWarnings("finally")
public boolean excluir(Tipo_usuario tipo_usuario)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "DELETE FROM tipo_usuario WHERE id_tipousuario=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, tipo_usuario.getId_tipousuario());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public boolean inserir(Tipo_usuario tipo_usuairo)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "INSERT INTO tipo_usuario (privilegio, descricao) "
            + "VALUES (?, ?)";
    
    con.preparar(query);
    try
    {
     con.getPstmt().setString(1, tipo_usuairo.getPrivilegio());
     con.getPstmt().setString(2, tipo_usuairo.getDescricao());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  @SuppressWarnings("finally")
public boolean atualizar(Tipo_usuario tipo_usuario)
  {
    boolean res = false;
    Conexao con = new Conexao();
    String query = "UPDATE tipo_usuario SET privilegio=?, descricao=? "
            + "WHERE id_tipousuario=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, tipo_usuario.getPrivilegio());
      con.getPstmt().setString(2, tipo_usuario.getDescricao());
      con.getPstmt().setInt(3, tipo_usuario.getId_tipousuario());
      res = con.executeUpdate();
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  public ArrayList<Tipo_usuario> buscar()
  {
    ArrayList<Tipo_usuario> res = new ArrayList<Tipo_usuario>();
    Conexao con = new Conexao();
    String query = "SELECT id_tipousuario, privilegio, descricao "
            + "FROM tipo_usuario ORDER BY privilegio";
    
    con.preparar(query);
    try
    {
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Tipo_usuario tipo_usuario = new Tipo_usuario();
        tipo_usuario.setId_tipousuario(rs.getInt("id_tipousuario"));
        tipo_usuario.setDescricao(rs.getString("descricao"));
        
        //falta fazer
        
        UfDAO ufdao = new UfDAO();
        Uf uf = ufdao.buscar(rs.getString("uf"));
        
        cidade.setUf(uf);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  public ArrayList<Cidade> buscar(Uf uf)
  {
    ArrayList<Cidade> res = new ArrayList<Cidade>();
    Conexao con = new Conexao();
    String query = "SELECT idcidade, nome, uf "
            + "FROM cidade WHERE uf=? ORDER BY nome";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, uf.getUf());
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Cidade cidade = new Cidade();
        cidade.setIdcidade(rs.getInt("idcidade"));
        cidade.setNome(rs.getString("nome"));
        cidade.setUf(uf);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  public ArrayList<Cidade> buscar(String uf)
  {
    ArrayList<Cidade> res = new ArrayList<Cidade>();
    Conexao con = new Conexao();
    String query = "SELECT idcidade, nome, uf "
            + "FROM cidade WHERE uf=? ORDER BY nome";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, uf);
      ResultSet rs = con.getPstmt().executeQuery();
      while (rs.next())
      {
        Cidade cidade = new Cidade();
        cidade.setIdcidade(rs.getInt("idcidade"));
        cidade.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(uf);
        cidade.setUf(u);
        res.add(cidade);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  public Cidade buscar(int idcidade)
  {
    Cidade res = null;
    Conexao con = new Conexao();
    String query = "SELECT idcidade, nome, uf "
            + "FROM cidade WHERE idcidade=?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setInt(1, idcidade);
      ResultSet rs = con.getPstmt().executeQuery();
      if (rs.next())
      {
        res = new Cidade();
        res.setIdcidade(rs.getInt("idcidade"));
        res.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(rs.getString("uf"));
        
        res.setUf(u);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
  
  public Cidade buscarPorNome(String nome)
  {
    Cidade res = null;
    Conexao con = new Conexao();
    String query = "SELECT idcidade, nome, uf "
            + "FROM cidade WHERE nome LIKE ?";
    
    con.preparar(query);
    try
    {
      con.getPstmt().setString(1, "%"+nome+"%");
      ResultSet rs = con.getPstmt().executeQuery();
      if (rs.next())
      {
        res = new Cidade();
        res.setIdcidade(rs.getInt("idcidade"));
        res.setNome(rs.getString("nome"));
        
        UfDAO ufdao = new UfDAO();
        Uf u = ufdao.buscar(rs.getString("uf"));
        
        res.setUf(u);
      }
    } catch (SQLException ex)
    {
      Logger.getLogger(Tipo_usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      con.fechar();
      return(res);
    }
  }
}
