package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/delStudentServlet")
public class delStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("delId");
		
		StudentDAO dao = new StudentDAO();
		boolean success = dao.removeStudent(id);
		
		if(success) {
			// {"resCode":"ok", "retVal":"id"}
			resp.getWriter().println("{\"resCode\":\"ok\", \"retVal\":\""+id+"\"}");
		} else {
			// {"resCode":"ng", "retVal":"id"}
			resp.getWriter().println("{\"resCode\":\"ng\", \"retVal\":\"id\"}");
			
		}

	}

}