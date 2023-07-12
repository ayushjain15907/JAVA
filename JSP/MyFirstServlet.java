import javax.servlet.*;
import java.io.*;
public class MyServlet1 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		out.print("Hello and welcome to servlet");
	}
}
