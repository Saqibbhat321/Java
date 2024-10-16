import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/regis")
public class RegisterServlet extends HttpServlet {

    public RegisterServlet()
    {
        System.out.println("register servlet started");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fName = req.getParameter("firstName");
        String lName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String mobileNo = req.getParameter("mobile");
        String password = req.getParameter("password");
        String Gender = req.getParameter("gender");
        String country = req.getParameter("country");

        System.out.println("FName: "+fName);
        System.out.println("LName: "+lName);
        System.out.println("Email: "+email);
        System.out.println("mobileNo: "+mobileNo);
        System.out.println("password: "+password);
        System.out.println("Gender: "+Gender);
        System.out.println("country: "+country);


        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Registration was success</h1>");
        printWriter.println("<h3>first Name:"+req.getParameter("firstName"));
        printWriter.println("</h3>");
        printWriter.println("<h3>Last Name: "+req.getParameter("lastName")+"</h3>");
        printWriter.println("<h3>Email:"+req.getParameter("email"));
        printWriter.println("</h3>");
        printWriter.println("<h3>mobile number: "+req.getParameter("mobile")+"</h3>");
        printWriter.println("<h3>password: "+req.getParameter("password")+"</h3>");
        printWriter.println("<h3>gender: "+req.getParameter("gender")+"</h3>");
        printWriter.println("<h3>country: "+req.getParameter("country")+"</h3>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}

