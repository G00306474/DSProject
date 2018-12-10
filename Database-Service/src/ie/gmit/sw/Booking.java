package ie.gmit.sw;

import java.io.Serializable;

public class Booking implements Serializable {

	private static final long serialVersionUID = 1l;

	private Vehicle vehicle;
	private Cx cx;

	public Booking() {

	}

	public Booking(Vehicle vehicle, Cx cx) {
		super();
		this.vehicle = vehicle;
		this.cx = cx;

	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Cx getCx() {
		return cx;
	}

	public void setCx(Cx cx) {
		this.cx = cx;
	}

}
