package service;

import entity.Jugador;
import java.util.List;
import model.IJugadorModel;
import model.JugadorModelImpl;

/**
 *
 * @autor froste
 */
public class JugadorServiceImpl implements IJugadorService{
    // Realiza una instancia a la capa model
    IJugadorModel model = new JugadorModelImpl();
    
    @Override
    public void insertarRegistro(Jugador registro) {
        model.insertarRegistro(registro);
    }

    @Override
    public List<Jugador> obtenerRegistro() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Jugador registro) {
        model.eliminarRegistro(registro);
    }

    @Override
    public Jugador buscarRegistro(int id) {
        return model.buscarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Jugador registro, int id) {
        model.actualizarRegistro(registro,id);
    }
    
}
