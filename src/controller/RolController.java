package controller;

import entity.Rol;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IRolService;
import service.RolServiceImpl;

public class RolController {
    IRolService service = new RolServiceImpl();
    
    public void insertarRegistro(Rol rol){
        service.insertarRegistro(rol);
    }
    
    public void mostrarRegistros(DefaultTableModel modeloTabla){
        List<Rol> listaRol = service.obtenerRegistro();
        modeloTabla.setRowCount(0);
        for (Rol rol : listaRol) {
            Object[] fila = new Object[2];
            fila[0] = String.valueOf(rol.getIdRol());
            fila[1] = rol.getRol();
            modeloTabla.addRow(fila);
        }
    }
    
    public void eliminarRegistro(Rol rol, DefaultTableModel modeloTabla){
        List<Rol> listaRol = service.obtenerRegistro();
        
    }
    
     public void eliminarRegistro(Rol rol){
        service.eliminarRegistro(rol);
    }
    
     public Rol buscarRegistro(int idRol){
         return service.buscarRegistro(idRol);
     }
     
     public void actualizarRegistro(Rol rol, Rol rolNuevo){
         
         service.actualizarRegistro(rol, rolNuevo);
         
     }
     
     
}
