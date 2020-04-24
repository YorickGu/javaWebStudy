import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/24 下午 05:48
 * @description：
 * @modified By：
 * @version: $
 */
@WebServlet("/servlet1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = null;
        try {
            resp.setContentType("text/html; charset=UTF-8");
            out = resp.getWriter();
            ServletContext context = getServletContext();
            context.setAttribute("name", "Test Servletcontext");
            out.println("This is a demo ServletContext");
            out.println("<a href = 'servlet2'>点击链接</a>");
            out.close();
        } catch (Exception e) {
            out.println(e);
        } finally {
            out.close();
        }
    }
}
