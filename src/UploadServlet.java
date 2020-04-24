import com.oreilly.servlet.MultipartRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/25 上午 12:30
 * @description：
 * @modified By：
 * @version: $
 */
@WebServlet("/Upload")
public class UploadServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        MultipartRequest m = new MultipartRequest(request, "d:/upload");
        out.print("上传成功");
    }

}