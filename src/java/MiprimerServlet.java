/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author charlie
 */
@WebServlet(name = "ServletOperaciones", urlPatterns = {"/ServletOperaciones"})
public class MiprimerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            String num1 = request.getParameter("txtNum1");
            String num2 = request.getParameter("txtNum2");
            String num = request.getParameter("txtFactorial");
            String numFibo = request.getParameter("txtFibonacci");
            String btnSumar = request.getParameter("btnSumar");
            String btnRestar = request.getParameter("btnRestar");
            String btnMultiplicar = request.getParameter("btnMultiplicacion");
            String btnDividir = request.getParameter("btnDivision");
            String btnFactorial = request.getParameter("btnFactorial");
            String btnFibo= request.getParameter("btnFibo");
            if (btnSumar != null) {
                int resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
                out.println("El resultado es: " + resultado);

            }
            if (btnRestar != null) {
                int resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
                out.println("El resultado es: " + resultado);
            }
            if (btnMultiplicar != null) {
                int resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
                out.println("El resultado es: " + resultado);
            }
            if (btnDividir != null) {
                if (Integer.parseInt(num2) != 0) {
                    double resultado = (double) Integer.parseInt(num1) / Integer.parseInt(num2);
                    out.println("El resultado es: " + resultado);
                } else {
                    out.println("Division no es para 0 ");
                }

            }
            if (btnFactorial != null) {
                int variable = 1;
                for (int i = 1; i <= Integer.parseInt(num); i++) {
                    variable = variable * i;
                }
                out.println("Factorial del numero es: "+variable);
            }
            
            if (btnFibo != null) {
                int variable = 0; int variable2 = 1;
                
                if (Integer.parseInt(numFibo)==0) {
                    out.println(variable);
                    
                }
                if (Integer.parseInt(numFibo)==1) {
                    out.println(variable+"\n"+variable2);
                }
                if(Integer.parseInt(numFibo)>=2){
                    out.println(variable+"\n"+variable2);
                for (int i = 2; i <= Integer.parseInt(numFibo); i++) {
                    int r = variable + variable2;
                    out.println(r);
                    variable=variable2;
                    variable2=r;
                }
                }
                
            }
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
