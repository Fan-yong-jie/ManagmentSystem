package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vo.*;
import com.dao.*;

/**
 * Servlet implementation class RegisterCont
 */
@WebServlet("/RegisterCont")
public class RegisterCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Register reg=new Register();
		reg.setName(request.getParameter("username"));
		reg.setPassword(request.getParameter("password"));
		new RegisterDAOImpl().add(reg);
		//System.out.println("cg");
		//request.getRequestDispatcher("RegisterView.jsp").forward(request, response);

		response.sendRedirect("RegisterView.jsp");
		//response.getWriter().println("<script language='javascript'>alert('用户名或密码错误');</script>");
		
	}

}
