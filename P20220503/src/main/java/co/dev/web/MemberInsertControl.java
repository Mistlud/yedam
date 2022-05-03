package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("입력 처리 컨트롤");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		String ps = request.getParameter("passwd");
		String nm = request.getParameter("name");
		String em = request.getParameter("email");

		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPasswd(ps);
		vo.setName(nm);
		vo.setEmail(em);

		MemberService service = new MemberService();
		service.memberInsert(vo);

		request.setAttribute("id", id);
		request.setAttribute("name", nm);
		//아웃풋으로 디스패쳐 포워드
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request, response);
	}

}
