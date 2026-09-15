
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
	
	
	public Burner() {
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	public void plusButton() {
		switch(this.mySetting) {
			case OFF:
				this.mySetting = Setting.LOW;
				break;
			case LOW:
				this.mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:
				this.mySetting = Setting.HIGH;
				break;
			case HIGH:
				break;
		}
		
		this.timer = TIME_DURATION;
	}

	public void minusButton() {
		switch(this.mySetting) {
			case OFF:
				break;
			case LOW:
				this.mySetting = Setting.OFF;
				break;
			case MEDIUM:
				this.mySetting = Setting.LOW;
				break;
			case HIGH:
				this.mySetting = Setting.MEDIUM;
				break;
		}
		
		this.timer = TIME_DURATION;
	}
	
	
	public void updateTemperature() {
		
	}
}


