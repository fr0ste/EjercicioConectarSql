/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public void insertarRegistro(Rol rol) {
        model.insertarRegistro(rol);
    }

    @Override
    public List<Rol> obtenerRegistro() {
         return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Rol rol) {
        model.eliminarRegistro(rol);
    }

    @Override
    public Rol buscarRegistro(int idRol) {
        return model.buscarRegistro(idRol);
    }

    @Override
    public void actualizarRegistro(Rol rol, Rol rolNuevo) {
        model.actualizarRegistro(rol, rolNuevo);
    }
    

    
    
    
}
