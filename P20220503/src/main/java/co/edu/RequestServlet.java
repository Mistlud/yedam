package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RequestServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		req.setAttribute("id", id);
		req.setAttribute("name", name);
		
		req.getRequestDispatcher("response.jsp").forward(req, resp);
		// 요청 정보와 응답 정보를 그대로 다른 페이지로 포워딩
		// 샌드리다이렉트와 달리 기존 요청,응답정보 사용가능
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("인잇 콜");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("서비스 콜");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter out = resp.getWriter();
		out.print("<h3>홍길동</h3>");
		out.print("<h3>네트워크 정보</h3>");
		out.print("Request Schme : " + req.getScheme() + "<br>");
		out.print("Server Name : " + req.getServerName() + "<br>");
		out.print("Server Address : " + req.getRemoteHost() + "<br>");
		out.print("Client Address : " + req.getRemoteAddr() + "<br>");
		out.print("Client Port : " + req.getRemotePort() + "<br>");
	}

}
