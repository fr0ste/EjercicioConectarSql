package model;

import entity.Rol;
import java.util.List;

/**
 *
 * @author labingsw01
 */
public interface IRolModel{
    public void insertarRegistro(Rol rol);
    public List<Rol> obtenerRegistros();
    public void imprimir(List<Rol> lista);
    public void eliminarRegistro(Rol rol);
    public Rol buscarRegistro(int idRol); 
    public void actualizarRegistro(Rol rol, Rol rolNuevo);
    
}
