package web2.ejemplo1.servlet;

import web2.ejemplo1.model.Productos;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rmpalacio
 */
@WebServlet("/v1/productos")
public class ProductosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Map> productos = Productos.obtenerTodos();

        String resultado = "producto;precio\n";
        
        for (Map item : productos) {
            resultado += String.format("%s;%s\n", item.get("nombre"), item.get("precio"));
        }

        resp.setContentType("text/csv; charset=utf8");
        resp.setHeader("Content-disposition", "attachment; filename=archivo.csv");
        resp.getWriter().write(resultado);

    }

}
