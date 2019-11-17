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
 * Servlet implementation class StaffCont
 */
@WebServlet("/StaffCont")
public class StaffCont extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StaffCont() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		if (request.getParameter("yc").equals("0")) {
			Staff sta = new Staff();
			sta.setId(request.getParameter("id"));
			sta.setAge(Integer.parseInt(request.getParameter("age")));
			sta.setDep(request.getParameter("bm"));
			sta.setName(request.getParameter("name"));
			sta.setSalary(request.getParameter("cmmt"));
			sta.setSex(request.getParameter("sex"));
			try {
				new StaffDAOImpl().doAdd(sta);
				System.out.println("cg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (request.getParameter("yc").equals("2")) {
			try {
				new StaffDAOImpl().delete(request.getParameter("id"));
				System.out.println("cg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (request.getParameter("yc").equals("1")) {
			Staff sta = new Staff();
			sta.setId(request.getParameter("id"));
			sta.setAge(Integer.parseInt(request.getParameter("age")));
			sta.setDep(request.getParameter("bm"));
			sta.setName(request.getParameter("name"));
			sta.setSalary(request.getParameter("cmmt"));
			sta.setSex(request.getParameter("sex"));
			System.out.println("cg");
			try {
				new StaffDAOImpl().update(sta);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (request.getParameter("yc").equals("3")) {
			try {
				Staff sta = new StaffDAOImpl().findByid(request.getParameter("id"));
				request.setAttribute("id", sta.getId());
				request.setAttribute("sex", sta.getSex());
				request.setAttribute("dep", sta.getDep());
				request.setAttribute("name", sta.getName());
				request.setAttribute("age", sta.getAge());
				request.setAttribute("sal", sta.getSalary());
				System.out.println("cg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.getRequestDispatcher("StaffView.jsp").forward(request, response);
	}

}
