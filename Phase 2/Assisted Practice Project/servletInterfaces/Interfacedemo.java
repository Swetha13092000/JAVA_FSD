package servletInterfaces;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class Interfacedemo
 */
public class Interfacedemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    ServletConfig config=null;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Interfacedemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
        this.config=config;
        System.out.println("Initialization complete");

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In destroy() method");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
        return "This is a sample servlet info";
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter pwriter=response.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");

	}

}
