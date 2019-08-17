package web2.ejemplo1.model;

/**
 *
 * @author rmpalacio
 */
public class Ventas {
    
    private static final Integer DATOS[] = {224, 432, 234, 112, 222};
    
    
    public static Integer obtenerDeSucursal(Integer sucursal) {
        return DATOS[sucursal-1];
    }
    
}
