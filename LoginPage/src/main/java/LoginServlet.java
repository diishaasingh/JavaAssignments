

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(username.equals("Disha") && password.equals("Disha@123")) {
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("<font color=red size=14>Invalid login credentials, please try again</font>");
			RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
			rd.include(request, response);
		}
	}

}
