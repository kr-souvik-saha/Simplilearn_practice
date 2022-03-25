package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Class;
import com.service.ClassService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.sendRedirect("Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String email  = request.getParameter("email");
		String pass	  = request.getParameter("password");
		
		if(email.equals("admin@gmail.com") && pass.equals("admin")) {
			
			ClassService c= new ClassService();
			List<Class> listOfCls=c.getAllClasses();
			HttpSession hs=request.getSession();
					hs.setAttribute("obj", listOfCls);
			
			response.sendRedirect("Index.jsp");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			
			pw.println("Invalid email or password");
			rd.include(request, response);
		}
	}

}
