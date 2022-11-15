package controller.base;

import entity.base.IRegistroEntityBase;
import service.base.IRegistroServiceBase;

/**
 *
 * @author labingsw05
 */
public abstract class RegistroControllerBase <T extends IRegistroEntityBase>{
    private IRegistroServiceBase<T> service;
    private T registro;

    public T getRegistro() {
        return registro;
    }

    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public void setService(IRegistroServiceBase<T> service) {
        this.service = service;
    }    
    
    public void crearRegistro(){
        service.insertarRegistro(registro);
    }
}
