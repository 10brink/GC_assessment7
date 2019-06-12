package co.grandcircus.assessment7b;

public class Data {

	private String city;
	private float acreage;
	private int yearEstablished;
	
	
	public Data() {
		
	}


	public float getAcreage() {
		return acreage;
	}


	public void setAcreage(float acreage) {
		this.acreage = acreage;
	}


	public int getYearEstablished() {
		return yearEstablished;
	}


	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Data [city=" + city + "]";
	}
	
}
