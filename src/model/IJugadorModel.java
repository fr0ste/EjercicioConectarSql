package model;

import entity.Jugador;
import java.util.List;

/**
 *
 * @author labingsw01
 */
public interface IJugadorModel{
    public void insertarRegistro(Jugador jugador);
    public List<Jugador> obtenerRegistros();
    public void imprimir(List<Jugador> lista);
    public void eliminarRegistro(Jugador jugador);
    public Jugador buscarRegistro(int idJugador); 
    public void actualizarRegistro(Jugador jugador, int id);
    
}
