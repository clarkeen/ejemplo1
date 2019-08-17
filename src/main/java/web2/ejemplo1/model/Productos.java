package web2.ejemplo1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Modelo para obtener productos.
 *
 * @author rmpalacio
 */
public class Productos {
    private static final String NOMBRES[] = {"arroz", "fideos", "yerba", "café", "azúcar"};
    private static final int PRECIOS[] = {50,35,140,220,80};

    public static List<Map> obtenerTodos() {
        List<Map> res = new ArrayList();
        
        for (int i = 0; i < NOMBRES.length; i++) {
            Map map = new HashMap();
            map.put("nombre", NOMBRES[i]);
            map.put("precio", PRECIOS[i]);
            res.add(map);
        }

        return res;
    }

}
