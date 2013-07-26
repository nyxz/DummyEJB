package com.maistora.ejb.test.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maistora.ejbear.client.ICalculator;

@WebServlet(urlPatterns = "/CalcServlet")
public class CalculatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB(mappedName = "ejb/Calc")
	private ICalculator calc;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		final String content = "<html><head><title>Calculator Servlet</title></head>" +
				"<body>" +
				"<h2>" + calc.multiply(new Long(10), new Double(34.34)) + "</h2>" +
				"</body></html>";
		
		final PrintWriter writer = resp.getWriter();
		try {
			writer.append(content);
		} finally {
			writer.close();
		}
	}
}
