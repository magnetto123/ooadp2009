package dk.aau.imi.med4.ooadp2009.javainter.lesson05;

public class MobileHome implements Home, Vehicle {

	private String address;
	private Double groundArea;
	private Double internalArea;
	private Integer numberOfRooms;
	private Double engineCapacity = 0.0; // cc
	private Double fuelEconomy = 0.0; // km/l
	private FuelType fuelType;
	private Double topSpeed = 0.0; // km/h

	public MobileHome(String address, Double groundArea, Double internalArea,
			Integer numberOfRooms, Double engineCapacity, Double fuelEconomy,
			FuelType fuelType, Double topSpeed) {
		this.address = address;
		this.groundArea = groundArea;
		this.internalArea = internalArea;
		this.numberOfRooms = numberOfRooms;
		this.engineCapacity = engineCapacity;
		this.fuelEconomy = fuelEconomy;
		this.fuelType = fuelType;
		this.topSpeed = topSpeed;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public Double getGroundArea() {
		return groundArea;
	}

	@Override
	public Double getInternalArea() {
		return internalArea;
	}

	@Override
	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	@Override
	public Double getEngineCapacity() {
		return engineCapacity;
	}

	@Override
	public Double getFuelEconomy() {
		return fuelEconomy;
	}

	@Override
	public FuelType getFuelType() {
		return fuelType;
	}

	@Override
	public Double getTopSpeed() {
		return topSpeed;
	}

	public String toString() {
		return "MobileHome(engineCapacity=" + getEngineCapacity() + 
				",fuelEconomy="+ getFuelEconomy() + 
				",fuelType=" + getFuelType() +
				",topSpeed=" + getTopSpeed() +
				",address=" + getAddress() + 
				",groundArea=" + getGroundArea() + 
				",internalArea=" + getInternalArea() + 
				",numberOfRooms=" + getNumberOfRooms() + ")";
	}

}
