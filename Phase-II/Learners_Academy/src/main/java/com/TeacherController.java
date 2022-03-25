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

import com.bean.Teacher;
import com.bean.Teacher;
import com.service.TeacherService;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		TeacherService ts=new TeacherService();
		List<Teacher> listOfTcr=ts.getAllTeacher();
		HttpSession hs=request.getSession();
		hs.setAttribute("obj", listOfTcr);
		response.sendRedirect("Teacher.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name  = request.getParameter("name");
		 
		Teacher tcr = new Teacher();
		tcr.setTeacher_name(name);
		 
		
		TeacherService ts = new TeacherService();
		
		String result = ts.storeTeacher(tcr);
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("AddTeacher.jsp");
		rd.include(request, response);
	}

}
