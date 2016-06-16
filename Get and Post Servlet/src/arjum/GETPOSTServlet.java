package arjum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GETPOSTServlet
 */
@WebServlet("/getpost")
public class GETPOSTServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GETPOSTServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Welcome ");
		String firstName = request.getParameter("frname");
		printWriter.print(firstName);
		//https://www.youtube.com/watch?v=VxDW54jrKQY
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter printWriter = response.getWriter()){
		printWriter.println("Data in formular are: ");
		printWriter.println("");
		
		String gen = "";
		String gender[] = request.getParameterValues("gender");
		int j;
		for (j = 0; j < gender.length; j++) {
			gen = gender[j];
			printWriter.print("Gender is: ");
			printWriter.println(gen);
		}
		
		String firstName = request.getParameter("frname");
		printWriter.print("First Name is: ");
		printWriter.println(firstName);
		
		String lastName = request.getParameter("lsname");
		printWriter.print("Last Name is: ");
		printWriter.println(lastName);
		
		int age = Integer.parseInt(request.getParameter("age"));
		printWriter.print("Age is: ");
		printWriter.println(age);
		
		String date = request.getParameter("birthDate");
		printWriter.print("Birth date is: ");
		printWriter.println(date);
		
		int telNumber = Integer.parseInt(request.getParameter("telNumber"));
		printWriter.print("Phone number is: ");
		printWriter.println(telNumber);
		
		String street = request.getParameter("street");
		printWriter.print("Street is: ");
		printWriter.println(street);
		
		String city = request.getParameter("city");
		printWriter.print("City is: ");
		printWriter.println(city);
		
		String zipCode = request.getParameter("zipCode");
		printWriter.print("Zip Code is: ");
		printWriter.println(zipCode);
		
		String deliveryEqualLiving = "";
		String deleqliv[] = request.getParameterValues("deleqliv");
		int i;
		for (i = 0; i < deleqliv.length; i++) {
			deliveryEqualLiving = deleqliv[i];
			printWriter.print("Delivery adress equal living address: ");
			printWriter.println(deliveryEqualLiving);
		}
		
	}
	}

}
