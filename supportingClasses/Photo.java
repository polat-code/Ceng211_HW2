package sourceCode.supportingClasses;

public class Photo {
	private String resolution;
	private String position;
	
	Photo() {
		this(null,null);
	}
	
	Photo(String resolution,String position) {
		this.resolution = resolution;
		this.position = position;
	}
	
	Photo(Photo photo) {
		this.resolution = photo.resolution;
		this.position = photo.position;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
