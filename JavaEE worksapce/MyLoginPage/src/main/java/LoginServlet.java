import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (isValidUser(username, password)) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Successfully logged in! Welcome " + username + "</h2>");
            out.println("</body></html>");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2 style=\"color:red;\">Invalid credentials</h2>");
            out.println("<form action=\"login\" method=\"post\">");
            out.println("Username: <input type=\"text\" name=\"username\"><br>");
            out.println("Password: <input type=\"password\" name=\"password\"><br>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
            out.println("</body></html>");
        }
    }

    private boolean isValidUser(String username, String password) throws IOException {
    	//String filePath = "WEB-INF/classes/users.txt";
    	ServletContext context = getServletContext();
    	String appRoot = context.getRealPath("/");
    	String filename = "/WEB-INF/classes/users.txt";
    	File inputFile = new  File(appRoot, filename);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
