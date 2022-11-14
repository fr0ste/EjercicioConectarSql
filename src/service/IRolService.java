/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Rol;
import java.util.List;

/**
 *
 * @author labingsw01
 */
public interface IRolService {
    public void insertarRegistro(Rol rol);
    public List<Rol> obtenerRegistro();
    public void eliminarRegistro(Rol rol);
    public Rol buscarRegistro(int idRol);
    public void actualizarRegistro(Rol rol, Rol rolNuevo);
    
}
