import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/24 下午 06:10
 * @description：
 * @modified By：
 * @version: $
 */
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = null;
        try {
            resp.setContentType("text/html; charset=UTF-8");
            out = resp.getWriter();

            ServletContext context = getServletContext();
            String ss = (String) context.getAttribute("name");
            out.println("<h1>Test Servlet Demo1111111</h1>");
            out.println(ss);
            out.close();

        } catch (Exception e) {
            out.println(e);
        } finally {
            out.close();
        }
    }
}
