package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init호출");  // 서버호출후 최초호출에서만
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter(); //출력 스트림 생성
		out.print("<h3> Student Sample page </h3>");
		
		String method = req.getMethod();
		if(method.equals("GET")) {
			out.print("<h3> GET방식 호출 </h3>");
		}else if(method.equals("POST")) {
			out.print("<h3> POST방식 호출 </h3>");
		}
		
		out.print("<a href = './index.jsp'> index page </a><br>");
		out.print("<a href='./index.jsp?user_name=kildong&user_id=hong'> index page 2 </a>");
		
	}
	@Override
	public void destroy() {
		System.out.println("디스트로이 호출");
	}
	

}
