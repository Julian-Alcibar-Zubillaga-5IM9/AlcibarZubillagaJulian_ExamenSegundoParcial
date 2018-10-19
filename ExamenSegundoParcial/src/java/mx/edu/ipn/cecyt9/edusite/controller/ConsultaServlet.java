/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.edusite.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.edu.ipn.cecyt9.edusite.model.Info;
import mx.edu.ipn.cecyt9.edusite.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class ConsultaServlet extends HttpServlet {

    private Connection conex;
    private ResultSet res = null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        Info inf = null;
        ArrayList<Info> in = new ArrayList();

        final String INSERT = "select * from Info;";

        try {
            res = con.query(INSERT);
            
            while (res.next()) {
                inf = new Info();
                inf.setIdInfo(res.getInt("id_Info"));
                inf.setNombre(res.getNString("Nombre"));
                inf.setApePater(res.getNString("ApePater"));
                inf.setApeMater(res.getNString("ApeMater"));
                inf.setEscuela(res.getNString("Escuela"));
                inf.setMatFav(res.getNString("MatFav"));
                inf.setDepFav(res.getNString("DepFav"));
                
                in.add(inf);  
                
                System.out.println("Se encontraron");
            }
            conex.close();
        } catch (Exception eee) {
            System.out.println("No se encontraron los registros");
        }
        
        request.setAttribute("in", in );
        getServletContext().getRequestDispatcher("/JSP/Consulta.jsp").forward(request, response);

        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
