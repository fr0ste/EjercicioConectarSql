package entity;

import entity.base.IRegistroEntityBase;

/**
 *
 * @author labingsw05
 */
public class Usuario implements IRegistroEntityBase{
    
    private int idUsuario;
    private String user;
    private String password;

    public Usuario(int idUsuario, String user, String password) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.password = password;
    }
    
    public Usuario() {
       
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getId() {
        return getIdUsuario();
    }

    @Override
    public void setId(int id) {
        setIdUsuario(idUsuario);
    }    
    
    
}
