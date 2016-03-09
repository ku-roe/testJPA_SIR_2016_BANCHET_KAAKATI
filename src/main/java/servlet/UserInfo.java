package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Person;
import services.PersonServiceImpl;

@WebServlet(name = "userinfo", urlPatterns = { "/UserInfo" })
public class UserInfo extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("HEY");
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<HTML>\n<BODY>\n" + "<H1>Recapitulatif des informations</H1>\n" + "<UL>\n" + " <LI>Nom: "
				+ request.getParameter("name") + "\n" + " <LI>mail: " + request.getParameter("mail") + "\n"
				+ " <LI>Age: " + request.getParameter("age") + "\n" + "</UL>\n" + "</BODY></HTML>");
		Person p = new Person( request.getParameter("name"),  request.getParameter("mail"),  Integer.parseInt(request.getParameter("age")));
		PersonServiceImpl psi =  new PersonServiceImpl();
		psi.addPerson(p);
	}
}
