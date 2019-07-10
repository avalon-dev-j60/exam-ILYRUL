
package ru.avalon.blog.servlets;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/comment/all")
public class CommentServlet extends HttpServlet{
    private static final String JSP=
            "/WEB-INF/pages/comment/all.jsp";
    @EJB CommentServlet commetServlet;
    
    @Override
    protected void doGet(
    HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException
    {
        List<Comment> items = CommentServlet.all();
        request.setAttribute("items", items);
        request.getRequestDispatcher(JSP).forward(request, response);
    
    }
}
