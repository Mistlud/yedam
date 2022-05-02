package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudnetGetServlet")
public class StudnetGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudnetGetServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get : cmd=search파라메타, cmd=null이면 Json형태로 반환
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=utf-8");

		String cmd = request.getParameter("cmd");
		if (cmd != null && cmd.equals("search")) {
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			Student student = new Student();
			student =  dao.searchStudent(id);
			
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println("<h3>학생번호 : " + student.getStudentNo() + "</h3>");
			response.getWriter().println("<h3>학생이름 : " + student.getStudentName() + "</h3>");
			response.getWriter().println("<h3>영어점수 : " + student.getEngScore() + "</h3>");
			response.getWriter().println("<h3>국어점수 : " + student.getKorScore() + "</h3>");
			response.getWriter().println("<hr>");
			response.getWriter().println("<input type=\"text\" id=\"num1\"><input type=\"button\" id=\"num2\" value=\"조회\"><br>");
			response.getWriter().println("<a href=\"home.jsp\"> 폼 화면으로 </a>");
			
			

		} else if (cmd != null && cmd.equals("list")) {

		} else {
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(list));
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		String cmd = request.getParameter("cmd");
		if (cmd != null && cmd.equals("add")) {
			
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			dao.addStudent(stud);
			System.out.println("입력성공");
			response.getWriter().println("<h3>입력성공</h3>");

		} else if (cmd !=null && cmd.equals("del")) {
			
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			if(dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제 성공')</script>");
			} else {
				response.getWriter().print("<script>alert('삭제 실패')</script>");
			}
			
		}
		response.sendRedirect("studentList.jsp");
	} //eod

}
