package ie.gmit.sw;

import java.io.Serializable;

public class Cx implements Serializable {

	private static final long serialVersionUID = 1l;
	private String name;
	private String address;
	
	public Cx(){
		
	}
	public Cx(String n, String a){
		super();
		this.name =n;
		this.address =a;
	}
	public String getName(){
		return name;
	}
	public void  setName(String name){
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
