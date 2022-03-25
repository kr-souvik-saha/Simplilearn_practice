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
import com.bean.Class;
import com.service.ClassService;
import com.service.ClassService;

/**
 * Servlet implementation class ClassesController
 */
public class ClassesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ClassService c= new ClassService();
		List<Class> listOfCls=c.getAllClasses();
		HttpSession hs=request.getSession();
				hs.setAttribute("obj", listOfCls);
		response.sendRedirect("Classes.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name  = request.getParameter("name");
		 
		Class cls = new Class();
		cls.setName(name);
		 
		
		ClassService ts = new ClassService();
		
		String result = ts.storeClasses(cls);
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("AddClass.jsp");
		rd.include(request, response);
	}

}
