package ie.gmit.sw;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@WebServlet("/Vehicles")

public class VehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VehicleServlet() {
		super();
	}

	// Vehicle
	// vehicle
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Create a client
		Client client = Client.create();

		// Request a connection to the Jax rs service
		WebResource wr = client.resource("http://localhost:8080/WebService/webapi/vehiclelist/get");

		// Get a response from the service
		String r = wr.accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("1");
		Gson gson = new Gson();
		System.out.println("2");
		Type listType = new TypeToken<ArrayList<Vehicle>>() {}.getType();

		List<Vehicle> vehicles = gson.fromJson(r, listType);

		request.setAttribute("vehicles", vehicles);

		request.getRequestDispatcher("/WEB-INF/Vehicles.jsp").forward(request, response);

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
		client.resource("http://localhost:8080/WebService/webapi/vehiclelist/delete").delete();

	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a client
		Client client = Client.create();

		// Request a connection to the Jax rs service
		client.resource("http://localhost:8080/WebService/webapi/vehiclelist/update").put();

	}

}