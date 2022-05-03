package co.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RequestServ", "/request1.do" })
public class RequestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RequestServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		
		StudentDAO dao = new StudentDAO();
		Student result = dao.searchStudent(id);
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("response.jsp").forward(request, response);
		// 요청 정보와 응답 정보를 그대로 다른 페이지로 포워딩
		// 샌드리다이렉트와 달리 기존 요청,응답정보 사용가능
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
