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
@WebServlet("/v1/tabla")
public class listaProductosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Map> productos = Productos.obtenerTodos();
/*
        String resultado = "<table><tr><th>producto</th><th>presio</th></tr>";

        for (Map item : productos) {
            resultado += String.format("<tr><td>\"%s\"</td><td>\"%s\"</td></tr>", item.get("nombre"), item.get("precio"));
        }
        
        //resultado = productos.stream().map((item) -> String.format("<tr><td>\"%s\"</td><td>\"%s\"</td></tr>", item.get("nombre"), item.get("precio"))).reduce(resultado, String::concat);
        
        resultado += "</table><a href=\"http://localhost:8080/ejemplo1/v1/productos\">Descargar catálogo de productos</a>";
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(resultado);
 */

        req.setAttribute("productos", productos);
        getServletContext().getRequestDispatcher("/WEB-INF/tabla/tablaVentas.jsp").forward(req, resp);

    }

}
