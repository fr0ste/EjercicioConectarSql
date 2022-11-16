package service;

import entity.Rol;
import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.RolModelImpl;
import model.UsuarioModelImpl;

/**
 *
 * @author labingsw01
 */
public class UsuarioServiceImpl implements IUsuarioService{
    // Realiza una instancia a la capa model
    IUsuarioModel model = new UsuarioModelImpl();

    @Override
    public void insertarRegistro(Usuario registro) {
        model.insertarRegistro(registro);
    }

    @Override
    public List<Usuario> obtenerRegistro() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Usuario registro) {
        model.eliminarRegistro(registro);
    }

    @Override
    public Usuario buscarRegistro(int id) {
        return model.buscarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Usuario registro, int id) {
        model.actualizarRegistro(registro, id);
    }
}
