/*package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import global.Command;
import global.CommandFactory;


@WebServlet({"/member/login_form.do","/member/join_form.do"})
public class MemberController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
       
	@SuppressWarnings("restriction")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("인덱스에서 들어옴");
		CommandFactory fac = new CommandFactory();
		RequestDispatcher dis = 
				//request.getRequestDispatcher(new Command(doProc(request,reponse)[0],doProc(request,response[1]).getView());
				request.getRequestDispatcher(CommandFactory.getCommand(request, response).getView());
				dis.forward(request,response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public String[] doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String[] arr = new String[2];
		//String uri = request.getRequestURI();
		String  path = request.getServletPath();
		//String temp1= path.split("/")[0];
		//String temp2= path.split("/")[1];
		String temp= path.split("/")[2];
		
		
		String directory = path.split("/")[1];
		//arr[1] = temp3.split("\\.")[0];
		String action = temp.substring(0, temp.indexOf("."));
		Command command = CommandFactory.createCommand(directory, action);
		switch (action) {
		case "login_form":
			RequestDispatcher dis = 
			request.getRequestDispatcher(command.getView());
			dis.forward(request,response);
			break;
		case "jogin_form":
			RequestDispatcher dis2 = 
			request.getRequestDispatcher(command.getView());
			dis2.forward(request,response);
			break;
		default:
			break;
		}
		
		System.out.println("path : " +arr[0]);
		System.out.println("temp : " +arr[1]);
		return arr;
		
	}

}
*/
package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.CommandFactory;

@WebServlet({"/member/login_form.do",
			"/member/join_form.do",
			"/member/Login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 페이지 이동시에는 doGet  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("인덱스에서 들어옴");
    	Command command = new Command();
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		
		switch (action) {
		case "join":
			String id = request.getParameter("id");
			command = CommandFactory.createCommand(directory,"detail");
			break;
			
		case "Loghin":
			System.out.println("=======로그인=======");
			command = CommandFactory.createCommand(directory,"+detail");
			break;
		
		default:
			command = CommandFactory.createCommand(directory,action);
			break;
		}
		System.out.println("디렉토리"+directory);
		System.out.println("액션"+action);
		command = CommandFactory.createCommand(directory,action);
		
		RequestDispatcher dis = 
		request.getRequestDispatcher(command.getView());
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}