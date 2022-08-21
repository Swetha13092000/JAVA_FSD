package com.program;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


@WebServlet("/AddProduct")

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProducteServlet
 */
public class AddProducteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProducteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
PrintWriter out = response.getWriter();
		
		String productName = request.getParameter("name");
		String productPrice = request.getParameter("price");
		
		//Step1: Gets session Factory
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		//Step 2: Gets Session object
		Session session = sf.openSession();
		
		//Step3: Gets Tx object and begin transaction
		Transaction tx =  session.beginTransaction();
		
		// Step 4: Create and populate entity object
		EProduct product = new EProduct();
		product.setName(productName);
		product.setPrice(Double.parseDouble(productPrice));
		
		//Step 5: <h3 style='color:green'> ProductNischithNischith is created successfully ! </h3>Save record in DB
		session.save(product);
		
		tx.commit();
		
		out.print("<h3> Product is created successfully ! <h3>");
		session.close();
	}

	}

}
