package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DaoImp.IssueDaoImp;

/**
 * Servlet implementation class DeleteIssuedBook
 */
@WebServlet("/DeleteIssuedBook")
public class DeleteIssuedBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       IssueDaoImp issueDao=new IssueDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteIssuedBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
	  issueDao.deleteIssuedBook(id);
		response.sendRedirect("ViewAllIssuedBooks.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
