package service;

import entity.Rol;
import java.util.List;
import model.IRolModel;
import model.RolModelImpl;

/**
 *
 * @author labingsw01
 */
public class RolServiceImpl implements IRolService{
    // Realiza una instancia a la capa model
    IRolModel model = new RolModelImpl();
    
    
    @Override
    public void insertarRegistro(Rol registro) {
        model.insertarRegistro(registro);
    }

    @Override
    public List<Rol> obtenerRegistro() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Rol registro) {
        model.eliminarRegistro(registro);
    }

    @Override
    public Rol buscarRegistro(int id) {
        return model.buscarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Rol registro, int id) {
        model.actualizarRegistro(registro,id);
    }
    
}
