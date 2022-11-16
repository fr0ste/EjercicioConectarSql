package model;

import DB.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioModelImpl implements IUsuarioModel {

    //public static void main(String[] args) throws ClassNotFoundException {
    //Conexion conexion = new Conexion();
    //conexion.getConnection();
    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    @Override
    public void insertarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call GuardarRol('" + usuario.getUser() + "')";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Usuario> obtenerRegistros() {
        try {
            List<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call mostrarUsuario()";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setUser(rs.getString("usr"));
                listaUsuario.add(usuario);
            }
            
            System.out.println(listaUsuario.size());

            stm.close();
            connection.close();
            return listaUsuario;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Usuario> lista) {
        for (Usuario usuario : lista) {
            System.out.println(usuario.getUser());
        }

    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call EliminarRol('" + usuario.getIdUsuario() + "')";
            stm = connection.createStatement();
            stm.execute(query);
            connection.close();
        } catch (SQLException e) {
            System.out.println("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Usuario buscarRegistro(int idUsuario) {
        try {

            Usuario usuario = new Usuario();
            ResultSet rs;

            conexion = new Conexion();//se establece la conexion

            connection = conexion.getConnection(); //se obtiene la conexion de la base de da

            String query = "call BuscarRol('" + idUsuario + "')";
            stm = connection.createStatement();

            rs = stm.executeQuery(query);

            rs.next();

            usuario.setIdUsuario(rs.getInt(1));

            usuario.setUser(rs.getString(2));

            stm.close();

            connection.close();

            return usuario;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void actualizarRegistro(Usuario usuario, int id) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call actualizarRol('" + id + "','" + usuario.getUser() + "')";              
            stm = connection.createStatement();         
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
