package controller;

import controller.base.RegistroControllerBase;
import entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IRolService;
import service.RolServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario> {

    private IRolService service;
/*
    public void insertarRegistro(Usuario usuario) {
        service = new RolServiceImpl();
        super.setService(service);
        super.setRegistro(usuario);
        super.crearRegistro();
    }

    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        service = new RolServiceImpl();
        List<Rol> listaRol = service.obtenerRegistro();
        modeloTabla.setRowCount(0);
        for (Rol rol : listaRol) {
            Object[] fila = new Object[2];
            fila[0] = String.valueOf(rol.getIdRol());
            fila[1] = rol.getRol();
            modeloTabla.addRow(fila);
        }
    }

    public void eliminarRegistro(Rol rol, DefaultTableModel modeloTabla) {
        service = new RolServiceImpl();
        List<Rol> listaRol = service.obtenerRegistro();

    }

    public void eliminarRegistro(Rol rol) {
        service = new RolServiceImpl();
        service.eliminarRegistro(rol);
    }

    public Rol buscarRegistro(int idRol) {
        service = new RolServiceImpl();
        return service.buscarRegistro(idRol);
    }

    public void actualizarRegistro(Rol rol, int id) {
        service = new RolServiceImpl();
        service.actualizarRegistro(rol, id);
    }
*/
}
