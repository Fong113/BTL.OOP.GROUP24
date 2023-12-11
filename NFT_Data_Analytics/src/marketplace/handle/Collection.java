package marketplace.handle;

public class Collection {
	private String id;
	private String logo;
	private String name;
	private double volume;
	private double volumeChange;
	private double floorPrice;
	private double floorPriceChange;
	private int items;
	private int owners;
	
	public Collection(String id, String logo, String name, double volume, double volumeChange,
			double floorPrice, double floorPriceChange, int items, int owners) {
		super();
		this.id = id;
		this.logo = logo;
		this.name = name;
		this.volume = volume;
		this.volumeChange = volumeChange;
		this.floorPrice = floorPrice;
		this.floorPriceChange = floorPriceChange;
		this.items = items;
		this.owners = owners;
	}

	@Override
	public String toString() {
		return logo + " " + name + " " + " " + owners;
	}

	public String getId() {
		return id;
	}

	public String getLogo() {
		return logo;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}

	public double getVolumeChange() {
		return volumeChange;
	}

	public double getFloorPrice() {
		return floorPrice;
	}

	public double getFloorPriceChange() {
		return floorPriceChange;
	}

	public int getItems() {
		return items;
	}

	public int getOwners() {
		return owners;
	}
}
