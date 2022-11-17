package model;

import DB.Conexion;
import entity.Jugador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JugadorModelImpl implements IJugadorModel {

    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    @Override
    public void insertarRegistro(Jugador jugador) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "insert into jugador(nombre, edad, sexo, telefono,correo,direccion,puntos)" + "values('" + jugador.getNombre() + "', 20, 'null', 'null', 'null', 'null', 'null', 0)";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close(); 
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JugadorModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Jugador> obtenerRegistros() {
        try {
            List<Jugador> listaJugador = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "SELECT * FROM jugador";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);

            while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setId(rs.getInt("idJugador"));
                jugador.setNombre(rs.getString("jugador"));
                listaJugador.add(jugador);
            }

            stm.close();
            connection.close();
            return listaJugador;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Jugador> lista) {
        for (Jugador jugador : lista) {
            System.out.println(jugador.getNombre());
        }

    }

    @Override
    public void eliminarRegistro(Jugador jugador) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "DELETE FROM jugador WHERE idJugador='"+ jugador.getId() + "'";
            stm = connection.createStatement();
            stm.execute(query);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JugadorModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Jugador buscarRegistro(int idJugador) {
        try {

            Jugador jugador = new Jugador();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection(); //se obtiene la conexion de la base de datos
            String query = "SELECT * FROM jugador where idJugador='" + idJugador ;
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            jugador.setIdJugador(rs.getInt(1));
            jugador.setNombre(rs.getString(2));
            stm.close();
            connection.close();
            return jugador;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JugadorModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void actualizarRegistro(Jugador jugador, int id) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "UPDATE jugador set nombre='" + jugador.getNombre() + "' where jugador.idJugador='" + id + "';";
            ResultSet rs;
            stm = connection.createStatement();
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JugadorModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
