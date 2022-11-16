package service.base;
import java.util.List;

/**
 *
 * @author labingsw05
 */
public interface IRegistroServiceBase <T>{
    public void insertarRegistro(T registro);
    public List<T> obtenerRegistro();
    public void eliminarRegistro(T registro);
    public T buscarRegistro(int id);
    public void actualizarRegistro(T registro, int id);
}
