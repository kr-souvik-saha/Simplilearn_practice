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

import com.bean.Class_Subject;
import com.service.Class_SubjectService;

import com.bean.Class;
import com.service.ClassService;

/**
 * Servlet implementation class AddClassSubjectController
 */
public class AddClassSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassSubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ClassService c= new ClassService();
		List<Class> listOfCls=c.getAllClasses();
		HttpSession hs=request.getSession();
				hs.setAttribute("obj", listOfCls);
		response.sendRedirect("AddClassSubject.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String class_id  = request.getParameter("class_id");
		String subName=request.getParameter("sub");
		
		int id=Integer.parseInt(class_id);
		
		Class_Subject clsub = new Class_Subject();
		
		clsub.setClass_id(id);
		clsub.setSub_name(subName);
		
		Class_SubjectService ts = new Class_SubjectService();
		
		String result = ts.storeClass_Subject(clsub);
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("AddClassSubject.jsp");
		rd.include(request, response);
	}

}
