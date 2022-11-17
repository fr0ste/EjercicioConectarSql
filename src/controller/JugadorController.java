package controller;

import controller.base.RegistroControllerBase;
import entity.Jugador;

import service.IJugadorService;
import service.JugadorServiceImpl;

public class JugadorController extends RegistroControllerBase<Jugador> {

    private IJugadorService service;
    
    public void insertarRegistro(Jugador jugador) {
        service = new JugadorServiceImpl();
        super.setService(service);
        super.setRegistro(jugador);
        super.crearRegistro();
    }
}
