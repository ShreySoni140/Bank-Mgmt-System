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
ESP=0x018cf4dc, EBP=0x018cf4f0, ESI=0x38220648, EDI=0x00000003
EIP=0x66ef5af9, EFLAGS=0x00010206

Top of Stack: (sp=0x018cf4dc)
0x018cf4dc:   33a626a0 3895be00 33a626a0 00000005
0x018cf4ec:   01183ff8 018cf51c 66ed64a9 3895be00
0x018cf4fc:   33a626a0 00000000 01183c00 01183308
0x018cf50c:   01183ff0 01183ff8 011843e4 018cf764
0x018cf51c:   018cf530 66efe5ad 33a626a0 38662ba0
0x0