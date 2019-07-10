
package ru.avalon.blog.servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ru.avalon.blog.entities.Comment;
import static ru.avalon.blog.helpers.ServletHelper.redirectToReferer;
import ru.avalon.blog.services.CommentServise;




@WebServlet("/comment")
public class CommentShowServlet extends HttpServlet {
   
    private static final String JSP = "/WEB-INF/pages/commet/show.jsp";
    @EJB    CommentServise commentService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id != null) {
            long lid = Long.parseLong(id);

            Comment comment = commentService.find(lid);
            if (comment != null) {
                request.setAttribute("comment", comment);
                request.getRequestDispatcher(JSP).forward(request, response);
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND);

            }

        } else {
            redirectToReferer(request, response);
        }
    }
    
}
