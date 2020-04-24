import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/24 下午 03:47
 * @description：
 * @modified By：
 * @version: $
 */
public class HelloWorld extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        super.init();
        message = "servlet init!!!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "<h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
