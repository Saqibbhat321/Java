import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(loadOnStartup = 1,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

    public ContactServlet()
    {
        System.out.println("contact servlet started");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String Mobile_Number = req.getParameter("mobileNo");
        String Address = req.getParameter("address");
        System.out.println(name);
        System.out.println(email);
        System.out.println(Mobile_Number);
        System.out.println(Address);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>contact was success</h1>");
        printWriter.println("<h3>Name:"+req.getParameter("name"));
        printWriter.println("</h3>");
        printWriter.println("<h3>Email: "+req.getParameter("email")+"</h3>");
        printWriter.println("<h3>Mobile number: "+req.getParameter("mobileNo")+"</h3>");
        printWriter.println("<h3>Address: "+req.getParameter("address")+"</h3>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
