import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/24 下午 09:07
 * @description：
 * @modified By：
 * @version: $
 */
public class AuthFilter extends HttpFilter {
    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = null;

        try {
            out = response.getWriter();
            String password = request.getParameter("password");
            if (password.equals("admin")) {
                chain.doFilter(request, response);
            } else {
                ((HttpServletResponse) response).sendRedirect("http://www.baidu.com");
            }

        } catch (Exception e) {
            out.println(e);
        } finally {
            out.close();
        }

    }
}
