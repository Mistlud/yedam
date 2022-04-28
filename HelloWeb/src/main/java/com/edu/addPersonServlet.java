package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class addPersonServlet
 */
@WebServlet("/addPersonServlet")
public class addPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addPersonServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		String id = request.getParameter("uid");
		String name = request.getParameter("uname");
		String score = request.getParameter("uscore");
		String age = request.getParameter("uage");

		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
		System.out.println("나이 : " + age);

		PrintWriter out = response.getWriter();
		out.println("<h3> 응답 결과 </h3>");
		out.println("<h4>ID : " + id + "</h4>");
		out.println("<h4>이름 : " + name + "</h4>");
		out.println("<h4>점수 : " + score + "</h4>");
		out.println("<h4>나이 : " + age + "</h4>");

	}

}
