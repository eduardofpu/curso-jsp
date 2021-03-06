package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
       
    }
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {	
		
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		Login entrar = new Login();
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		
		
		
		if(entrar.validarLoginSenha(login, senha)){
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("acesso-liberado.jsp");
			dispatcher.forward(request,response);
			
		}else{
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("acesso-negado.jsp");
			dispatcher.forward(request,response);
		}
	}

}
