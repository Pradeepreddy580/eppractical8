package postlab;

public class Fabrics {
	private int Id;
	private String type;
	private String color;
	private double length;
	private double costPerLength;
	
	public Fabrics() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getCostPerLength() {
		return costPerLength;
	}

	public void setCostPerLength(double costPerLength) {
		this.costPerLength = costPerLength;
	}
	
	
}
