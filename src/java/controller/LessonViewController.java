/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.CourseListDAO;
import dao.LessonViewDAO;
import dao.SubjectLessonDAO;
import entity.CourseList;
import entity.Lesson;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ductd
 */
public class LessonViewController extends HttpServlet {

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
        try {

            SubjectLessonDAO subjectLessonDAO = new SubjectLessonDAO();
            LessonViewDAO lessonViewDAO = new LessonViewDAO();
            CourseListDAO courseListDAO = new CourseListDAO();
            if (request.getParameter("id") != null) {
                int subID = Integer.parseInt(request.getParameter("id"));
                List<Lesson> getLessonBySubID = subjectLessonDAO.getLessonBySubID(subID);
                request.setAttribute("listLesson", getLessonBySubID);
                String subject = request.getParameter("subject");
                request.setAttribute("select", subject);
                Lesson lesson = lessonViewDAO.getLessonBySubId(subID);
                request.setAttribute("lesson", lesson);
                List<CourseList> listCourse = courseListDAO.getCourseListByID(subID);
                request.setAttribute("listCourse", listCourse);
                System.out.println(listCourse.toString());
                request.getRequestDispatcher("LessonView.jsp").forward(request, response);

            }

            List<Lesson> listLesson = subjectLessonDAO.getLesson();
            request.setAttribute("select", "Subject");
            request.setAttribute("listLesson", listLesson);
            request.getRequestDispatcher("LessonView.jsp").forward(request, response);
        } catch (Exception e) {
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
        processRequest(request, response);
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
