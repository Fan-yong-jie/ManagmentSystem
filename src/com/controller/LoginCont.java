package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.*;
import com.vo.*;
/**
 * Servlet implementation class LoginCont
 */
@WebServlet("/LoginCont")
public class LoginCont extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码格式
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//获取当前验证码字符串
		String code = (String) request.getSession().getAttribute("checkcode_session");
		Register reg = new Register();
		reg.setName(request.getParameter("username"));
		
		reg.setPassword(request.getParameter("password"));
		PrintWriter out = response.getWriter();
		//判断输入的信息
		if(new RegisterDAOImpl().find(reg))
		{
			System.out.println("cg");
			//判断验证码是否输入正确
			if(code.equalsIgnoreCase(request.getParameter("code")))
			{
				//输入信息全正确，跳转到主界面
				request.getRequestDispatcher("MainView.jsp").forward(request, response);
			}else
			{
				//验证码输入错误，弹出警示框，返回输入的信息
				request.setAttribute("pass", request.getParameter("password"));
				request.setAttribute("name", request.getParameter("username"));				
				//request.setAttribute("cod", request.getParameter("code"));
				request.setAttribute("dd","1");
				request.getRequestDispatcher("LoginView.jsp").forward(request, response);
			
				
			}
		}else{
			System.out.println("sb");
			//弹出错误提示框，并返回输入的信息
			request.setAttribute("pass", request.getParameter("password"));
			request.setAttribute("name", request.getParameter("username"));
			request.setAttribute("dd","0");
			request.getRequestDispatcher("LoginView.jsp").forward(request, response);
		
		}
		
		out.flush();
		
	}

	//response.sendRedirect("");

}
