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
}s.read())!=-1)
					b.write(c);
				flag=true;
				fis.close();
				b.close();
				client.close();
			}catch(Exception e){
				System.out.println(e);
			}
			return flag;
		}
		
}
        5  6  8  9 - : ; ;      
Rajkot
      �    IEND�B`�

Registers:
EAX=0x33a626a0, EBX=0x03d31988, ECX=0x00000005, EDX=0x0000013c
ESP=0x018cf4dc, EBP=0x018cf