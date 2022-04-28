package co.edu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu/jsonData.do")
public class jsonData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=UTF-8");
		// [{"name":"홍길동","age":"20"},{"name":"김길동","age":"30"},{"name":"박길동","age":"30"},{"name":"고길동","age":"40"}]
		resp.getWriter().print(
				"[{\"name\":\"홍길동\",\"age\":\"20\"},{\"name\":\"김길동\",\"age\":\"30\"},{\"name\":\"박길동\",\"age\":\"30\"},{\"name\":\"고길동\",\"age\":\"40\"}]");
	}

}
