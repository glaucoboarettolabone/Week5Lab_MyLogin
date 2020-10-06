package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author 815000
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String MSG_LOGOUT = "You have successfully logged out";
        
        HttpSession session = request.getSession();

        String param = request.getParameter("logout");
        if (param != null) {
              request.setAttribute("msgerror", MSG_LOGOUT);
              session.invalidate();             
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        final String ERROR_EMPTY = "User name and password are not empty";
        final String ERROR_FAIL = "Failed authentication";
        
        if (username == null || username.equals("") || password == null || password.equals("")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("msgerror", ERROR_EMPTY);
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);           
            return;
        }
        
        AccountService account = new AccountService();
        User user = account.login(username, password);
        
        if (user == null) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("msgerror", ERROR_FAIL);
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            
            response.sendRedirect("home");
        }
     }
}
