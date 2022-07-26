import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Productid
 */
public class Productid extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Productid() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/products"; 
		String uname="root"; 
		String pass=""; 
		response.setContentType("text/html"); 
		String pId = request.getParameter("productid"); 
		PrintWriter out = response.getWriter(); 
		String query="select * from product where p_id=?"; 
		out.print("<h1>Displaying the Product Details...</h1>"); 
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>quantity</th><th>bill</th></tr>"); 
		try { 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection dbCon = DriverManager.getConnection(url, uname, pass); 
		PreparedStatement st= dbCon.prepareStatement(query); 
		st.setString(1, pId); 
		ResultSet rs =st.executeQuery(); 
		while(rs.next()) { 
		out.print("<tr><td>"); 
		out.println(rs.getInt(1)); 
		out.print("</td>"); 
		out.print("<td>"); 
		out.print(rs.getString(2)); 
		out.print("</td>"); 
		out.print("<td>"); 
		out.print(rs.getInt(3)); 
		out.print("</td>"); 
		out.print("</tr>"); 
		} 
		} 
		catch(Exception e){ 
		System.out.println("Some Issue : "+ e.getMessage()); 
		} 
		out.print("</table>"); 
		} 


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
