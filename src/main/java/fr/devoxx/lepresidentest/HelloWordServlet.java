package fr.devoxx.lepresidentest;

import java.io.IOException;
import javax.servlet.http.*;

/**
 * Servlet Hello word
 * @author sfeir
 *
 */
@SuppressWarnings("serial")
public class HelloWordServlet extends HttpServlet {
    /**
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
