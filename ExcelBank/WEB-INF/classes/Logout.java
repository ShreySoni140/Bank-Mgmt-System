import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;


public class Logout extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs=req.getSession();
		hs.invalidate();	
		res.sendRedirect("Login.jsp");	
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		doGet(req,res);
	}
}