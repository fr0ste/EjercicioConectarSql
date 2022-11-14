package model;

import DB.Conexion;
import entity.Rol;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RolModelImpl implements IRolModel {

    //public static void main(String[] args) throws ClassNotFoundException {
    //Conexion conexion = new Conexion();
    //conexion.getConnection();
    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    @Override
    public void insertarRegistro(Rol rol) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Guardar('" + rol.getRol() + "')";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Rol> obtenerRegistros() {
        try {
            List<Rol> listaRol = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call mostrar()";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);

            while (rs.next()) {
                Rol rol = new Rol();
                rol.setIdRol(rs.getInt("idRol"));
                rol.setRol(rs.getString("rol"));
                listaRol.add(rol);
            }

            stm.close();
            connection.close();
            return listaRol;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Rol> lista) {
        for (Rol rol : lista) {
            System.out.println(rol.getRol());
        }

    }

    @Override
    public void eliminarRegistro(Rol rol) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Eliminar('" + rol.getIdRol() + "')";
            stm = connection.createStatement();
            stm.execute(query);
            connection.close();
        } catch (SQLException e) {
            System.out.println("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Rol buscarRegistro(int idRol) {
        try {

            Rol rol = new Rol();
            ResultSet rs;

            conexion = new Conexion();//se establece la conexion

            connection = conexion.getConnection(); //se obtiene la conexion de la base de da

            String query = "call Buscar('" + idRol + "')";
            stm = connection.createStatement();

            rs = stm.executeQuery(query);

            rs.next();

            rol.setIdRol(rs.getInt(1));

            rol.setRol(rs.getString(2));

            stm.close();

            connection.close();

            return rol;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void actualizarRegistro(Rol rol, Rol rolNuevo) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call actualizar('" + rol.getIdRol() + "','" + rolNuevo.getRol() + "')";
            ResultSet rs;
            System.out.println("0");
            stm = connection.createStatement();
            System.out.println("1");
            stm.execute(query);
            System.out.println("2");
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");

            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
