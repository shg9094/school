package grade;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @WebServlet("/grade/my_grade.do")
    public class GradeController extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    	GradeService service = GradeServiceImpl.getInstance();
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		Command command = new Command();
    		GradeService service = new GradeServiceImpl();
        	GradeBean Grade = new GradeBean();
        	String id="";
        	String path = request.getServletPath();
    		String temp = path.split("/")[2];
    		String directory = path.split("/")[1];
    	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
    		String action = temp.substring(0, temp.indexOf("."));
    		switch (action) {
    		case "my_grade":
    			
    			break;

    		default:
    			break;
    		}
    		
    	}

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	}

    }