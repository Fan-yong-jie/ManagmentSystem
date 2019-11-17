package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;
import com.vo.*;

/**
 * Servlet implementation class DepCont
 */
@WebServlet("/DepCont")
public class DepCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepCont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		if(request.getParameter("judge").equals("0"))
		{
			Department dep = new Department();
			dep.setId(request.getParameter("depno"));
			dep.setName(request.getParameter("depname"));
			dep.setNumber(request.getParameter("cmmt"));
			DepDAOImpl dil = new DepDAOImpl();
			try {
				dil.doAdd(dep);
				request.setAttribute("dd","1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		if(request.getParameter("judge").equals("3"))
		{
		
			try {
				Department find = new DepDAOImpl().findByid(request.getParameter("depno"));
				request.setAttribute("aa", find.getId());
				request.setAttribute("bb", find.getName());
				request.setAttribute("cc", find.getNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(request.getParameter("judge").equals("1"))
		{
			Department dep = null;
			dep=new Department();
			dep.setId(request.getParameter("depno"));
			dep.setName(request.getParameter("depname"));
			dep.setNumber(request.getParameter("cmmt"));
			try {
				new DepDAOImpl().update(dep);
				System.out.println("cg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(request.getParameter("judge").equals("2"))
		{
			try {
				new DepDAOImpl().delete(request.getParameter("depno"));
				System.out.println("cg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		request.getRequestDispatcher("DepView.jsp").forward(request, response);
	}

}
