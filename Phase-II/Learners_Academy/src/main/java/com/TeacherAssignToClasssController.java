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
import com.bean.Teacher;
import com.bean.Teacher_Assign;
import com.service.Class_SubjectService;
import com.service.TeacherService;
import com.service.Teacher_AssignService;

/**
 * Servlet implementation class TeacherAssignToClasssController
 */
public class TeacherAssignToClasssController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherAssignToClasssController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Class_SubjectService cs= new Class_SubjectService();
		List<Class_Subject> listOfClsub=cs.getAllClass_Subject();
		
		TeacherService ts=new TeacherService();
		List<Teacher> listOfTcr=ts.getAllTeacher();
		 
		HttpSession hs=request.getSession();
				hs.setAttribute("cls", listOfClsub);
				hs.setAttribute("tcr", listOfTcr);
		response.sendRedirect("TeacherAssignment.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String class_subject_id  = request.getParameter("class_subject_id");
		String teacher_id=request.getParameter("teacher_id");
		
		int id=Integer.parseInt(class_subject_id);
		int tcrid=Integer.parseInt(teacher_id);
		
		Teacher_Assign Tcrasg = new Teacher_Assign();
		
		Tcrasg.setClass_subject_id(id);
		Tcrasg.setTeacher_id(tcrid);
		
		Teacher_AssignService ts = new Teacher_AssignService();
		
		String result = ts.storeTeacher(Tcrasg);
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("TeacherAssigment.jsp");
		rd.include(request, response);
	}

}
