import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

    public OrderServlet()
    {
        System.out.println("servlet started");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String customerName = req.getParameter("customerName");
        String quantity = req.getParameter("quantity");
        String item = req.getParameter("item");
        System.out.println("Customer name: "+customerName);
        System.out.println("Quantity: "+quantity);
        System.out.println("Item: "+item);



        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Order was success</h1>");
        printWriter.println("<h3>Name:"+req.getParameter("customerName"));
        printWriter.println("</h3>");
        printWriter.println("<h3>quantity:"+req.getParameter("quantity"));
        printWriter.println("</h3>");
        printWriter.println("<h3>Item: "+req.getParameter("item")+"</h3>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        }
}
