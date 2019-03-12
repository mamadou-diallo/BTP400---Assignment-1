package btp400ass1;

public class PaintStation extends Station{
	public String paintColor;
	
	public PaintStation() {
		super.stationName = "Paint Station";
	}

	public String getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}
	
	
}
