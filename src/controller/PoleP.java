package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PoleP
 */
@WebServlet("/PoleP")
public class PoleP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoleP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println(request.getParameter("c1")+":"
				+ request.getParameter("c2")+":"+
				request.getParameter("c3"));
		
		//TODO: ORDENAR TEMPOS
		request.setAttribute("vencedor", request.getParameter("c3"));
		request.setAttribute("segundo", request.getParameter("c2"));
		request.setAttribute("terceiro", request.getParameter("c1"));
		
		request.getRequestDispatcher("resultados.jsp").forward(request, response);
	}

}
