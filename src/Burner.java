
public class Burner {
	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	}
	
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public static final int TIME_DURATION = 2;
	
	public Temperature getTemperature() {
		return this.myTemperature;
	}
	
	

}


