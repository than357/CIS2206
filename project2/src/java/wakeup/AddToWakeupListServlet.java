package wakeup;

import customer.User;
import data.UserIO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToWakeupListServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException
    {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String roomNum = request.getParameter("roomNum");
        String wtime = request.getParameter("wtime");

        // create the User object
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setRoomNum(roomNum);
        user.setWtime(wtime);


        // write the User object to a file
        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/WEB-INF/wakeupList.txt");
        UserIO.addRecord(user, path);

        // store the User object in the session
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        // forward request and response to JSP page
        String url = "/display_wakeup_time.jsp";
        RequestDispatcher dispatcher =
             getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException
    {
        this.doPost(request, response);
    }
}