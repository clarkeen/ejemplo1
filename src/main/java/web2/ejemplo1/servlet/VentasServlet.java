package web2.ejemplo1.servlet;

import web2.ejemplo1.model.Ventas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rmpalacio
 */
@WebServlet("/v1/ventas")
public class VentasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer sucursal = null;

        try {
            sucursal = validarSucursal(req);
        } catch (Exception ex) {
            req.setAttribute("error_validacion", "El código de sucursal es incorrecto.");
            req.getRequestDispatcher("/WEB-INF/secciones/ventas.jsp").forward(req, resp);
            return;
        }

        if (sucursal != null) {
            Integer total = Ventas.obtenerDeSucursal(sucursal);
            req.setAttribute("sucursal", sucursal);
            req.setAttribute("total", total);
        }

        req.getRequestDispatcher("/WEB-INF/secciones/ventas.jsp").forward(req, resp);

    }

    private Integer validarSucursal(HttpServletRequest req) {
        Integer cod = null;
        try {
            cod = Integer.parseInt(req.getParameter("suc"));
            
            if (cod < 0 || cod > 5) {
                throw new IllegalArgumentException("no es un número.");
            }

        } catch (Exception ex) {
            throw ex;
        }

        return cod;
    }

}
