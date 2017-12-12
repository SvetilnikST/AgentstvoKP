package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import me.svetilnik.dbService.DAO.AuthorizationDao;
import me.svetilnik.agentstvo.servlet.model.UserRole;
import javax.servlet.http.HttpSession;

public class LoginCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (login==null || password==null){
            return PageURL.LOGIN_PAGE;
        }

        AuthorizationDao dao = new AuthorizationDao();
        UserRole role = dao.checkAccess(login, password);
        if (role!=null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", login);
            session.setAttribute("user_id", dao.getUserId(login));
            session.setAttribute("role", role);
            session.setMaxInactiveInterval(30 * 60);
            return PageURL.LIST_DEAL_ACTION;
        } else {
            return PageURL.LOGIN_PAGE;
        }
    }
}
