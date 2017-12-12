package me.svetilnik.agentstvo.servlet.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/WorkTaskController")
public class WorkTaskController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public WorkTaskController() {
        super();
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(req);
        String page = command.execute(req, resp);
        if(page!=null){
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
            dispatcher.forward(req, resp);
          } else {
            resp.sendRedirect(PageURL.ERROR_PAGE);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
