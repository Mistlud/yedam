package co.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/modStudentServlet")
public class modStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public modStudentServlet() {

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		String sNo = req.getParameter("a");
		String sName = req.getParameter("b");
		String engScore = req.getParameter("c");
		String korScore = req.getParameter("d");

		Student std = new Student();
		std.setStudentNo(Integer.parseInt(sNo));
		std.setStudentName(sName);
		std.setEngScore(Integer.parseInt(engScore));
		std.setKorScore(Integer.parseInt(korScore));

		StudentDAO dao = new StudentDAO();
		boolean success = dao.modifyStudent(std);

		if (success) {
			resp.getWriter().println("{\"retCode\":\"ok\", \"studNo\":\"" + sNo + "\", \"studName\":\"" + sName
					+ "\", \"engScore\":\"" + engScore + "\", \"korScore\":\"" + korScore + "\"}");
		}

	}
}