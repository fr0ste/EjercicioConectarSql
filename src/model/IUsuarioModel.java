package model;

import entity.Usuario;
import java.util.List;

/**
 *
 * @author labingsw01
 */
public interface IUsuarioModel{
    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void imprimir(List<Usuario> lista);
    public void eliminarRegistro(Usuario usuario);
    public Usuario buscarRegistro(int idUsuario); 
    public void actualizarRegistro(Usuario usuario, int id);
    
}
