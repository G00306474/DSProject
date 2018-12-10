package ie.gmit.sw;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

@WebServlet("/Cx")
public class CxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CxServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("Tester Client");
		// Create a client
		Client client = Client.create();

		// Request a connection to the Jax rs service
		WebResource wr = client.resource("http://localhost:8080/WebService/webapi/cxlist/get");

		// Get a response from the service
		// System.out.println("Tester Client 2");
		String r = wr.accept(MediaType.APPLICATION_JSON).get(String.class);
		// System.out.println("Tester Client 3");
		Gson gson = new Gson();

		Type listType = new TypeToken<ArrayList<Cx>>() {
		}.getType();

		List<Cx> cxs = gson.fromJson(r, listType);

		request.setAttribute("customers", cxs);

		request.getRequestDispatcher("/WEB-INF/Cx.jsp").forward(request, response);
		// System.out.println("Tester");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("delButton") != null) {

			System.out.println("DELETE");
			del(request, response);

		} else if (request.getParameter("updateButton") != null) {

			System.out.println("PUT");
			update(request, response);

		}

		doGet(request, response);
	}

	private void del(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a client
		Client client = Client.create();

		// Request a connection to the Jax rs service
		client.resource("http://localhost:8080/WebService/webapi/customerlist/delete").delete();

	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a client
		Client client = Client.create();

		// Request a connection to the Jax rs service
		client.resource("http://localhost:8080/WebService/webapi/customerlist/update").put();

	}

}
