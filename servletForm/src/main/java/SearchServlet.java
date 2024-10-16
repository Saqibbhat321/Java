import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/search")
public class SearchServlet extends HttpServlet {

    public SearchServlet()
    {
        System.out.println("Search servlet Started");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        System.out.println("Email"+email);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Search Result</h1>"+req.getParameter("email"));
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
