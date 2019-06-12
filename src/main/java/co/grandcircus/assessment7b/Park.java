package co.grandcircus.assessment7b;

public class Park {
	
	private int id;
	private String ref;
	private String name;
	private Data data;
	
	public Park() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Park [id=" + id + ", ref=" + ref + ", name=" + name + ", data=" + data + "]";
	}

}
