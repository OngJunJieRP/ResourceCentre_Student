
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += "Asset tag: " + this.getAssetTag() + "\n";
		output += "Description: " + this.getDescription() + "\n";
		output += "Optical zoom: " + this.getOpticalZoom() + "\n";
		return output;
	}
}

