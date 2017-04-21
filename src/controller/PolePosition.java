package controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PolePosition
 */
@WebServlet("/PolePosition")
public class PolePosition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolePosition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<h1>POLE POSITION</h1>"
				+ "<form>"
				+ "Tempo A: <input type='text' name='tempoa' values='tempos'></br>"
				+ "Tempo B: <input type='text' name='tempob' values='tempos'></br>"
				+ "Tempo C: <input type='text' name='tempoc' values='tempos'></br>"
				+ "Tempo D: <input type='text' name='tempod' values='tempos'></br>"
				+ "<input type='submit' value='ENVIAR'></br>"
				+ " </form>");
		
		if(request.getParameter("tempoa")!=null){
			
			int[] tempos = new int[4];
			
			tempos[0]= Integer.valueOf(request.getParameter("tempoa"));
			tempos[1]= Integer.valueOf(request.getParameter("tempob"));
			tempos[2]= Integer.valueOf(request.getParameter("tempoc"));
			tempos[3]= Integer.valueOf(request.getParameter("tempod"));
			
			Arrays.sort( tempos );
			
			for(int i=0; i<tempos.length;i++){
				response.getWriter().append("Tempos: "+tempos[i]+"</br>");
			}
		
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
