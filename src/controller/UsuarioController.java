package controller;

import controller.base.RegistroControllerBase;
import entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IUsuarioService;
import service.UsuarioServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario> {

    private IUsuarioService service;

    public void insertarRegistro(Usuario usuario) {
        service = new UsuarioServiceImpl();
        super.setService(service);
        super.setRegistro(usuario);
        super.crearRegistro();
    }

    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistro();
        modeloTabla.setRowCount(0);
        for (Usuario usuario : listaUsuario) {
            Object[] fila = new Object[2];
            fila[0] = String.valueOf(usuario.getId());
            fila[1] = usuario.getUser();
            modeloTabla.addRow(fila);
        }
    }

    public void eliminarRegistro(Usuario usuario, DefaultTableModel modeloTabla) {
        service = new UsuarioServiceImpl();
        //List<Usuario> listaUsuario = service.obtenerRegistro();

    }

    public void eliminarRegistro(Usuario usuario) {
        service = new UsuarioServiceImpl();
        service.eliminarRegistro(usuario);
    }

    public Usuario buscarRegistro(int idusuario) {
        service = new UsuarioServiceImpl();
        return service.buscarRegistro(idusuario);
    }

    public void actualizarRegistro(Usuario usuario, int id) {
        service = new UsuarioServiceImpl();
        service.actualizarRegistro(usuario, id);
    }

}
