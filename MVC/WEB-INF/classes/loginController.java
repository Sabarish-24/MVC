import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Bean.loginBean;
import DAO.loginDAO;

public class loginController extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		String u=request.getParameter("u");
		String p=request.getParameter("p");
		loginBean l=new loginBean();
		l.setUsername(u);
		l.setPassword(p);
		int flag=0;
		loginDAO ld=new loginDAO();
		l=ld.ua(l);
		int m=l.gets1();
		 HttpSession session = request.getSession(true);
		        session.setAttribute("name",m);
request.getRequestDispatcher("s.jsp").forward(request,response);
		
		/*if(flag==1)
			request.getRequestDispatcher("s.jsp").forward(request,response);
		else
			request.getRequestDispatcher("f.jsp").forward(request,response);
	*/
	}
}