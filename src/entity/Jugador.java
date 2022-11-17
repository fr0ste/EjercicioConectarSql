package entity;

import entity.base.IRegistroEntityBase;

/**
 *
 * @author labingsw05
 */
public class Jugador extends Persona implements IRegistroEntityBase{
    private int idJugador;
    private int puntos;

    public Jugador(int id, int puntos, String nombre, int edad, String sexo, String telefono, String correo, String direccion) {
        super(nombre, edad, sexo, telefono, correo, direccion);
        this.idJugador = id;
        this.puntos = puntos;
    }

    public Jugador() {       
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }
    
    
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int getId() {
        return this.getId();
    }

    @Override
    public void setId(int id) {
        this.setId(id);
    }
    
    
    
    
}
