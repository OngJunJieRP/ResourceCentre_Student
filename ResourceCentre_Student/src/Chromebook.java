
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += "Asset tag: " + this.getAssetTag() + "\n";
		output += "Description: " + this.getDescription() + "\n";
		output += "Operation system: " + this.getOs() + "\n";
		
		return output;
	}
}


