
public class Burner {
	public enum Temperature {
		COLD (0), WARM (1), HOT(2), BLAZING(3);
		private final int value;
		private Temperature(int aValue) {
			value = aValue; 
		}
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
	
	//this function is called whenever timer hits 0
	private void handleTemperature() {
		switch (this.mySetting) {
		case OFF: 
			switch(this.myTemperature) {
			case COLD:
				break;
			case WARM:
				this.myTemperature = Temperature.COLD;
				break;
			case HOT: 
				this.myTemperature = Temperature.WARM; 
				break;
			case BLAZING: 
				this.myTemperature = Temperature.HOT;
				break;
			
			}
		case LOW:
			switch(this.myTemperature) {
			case COLD:
				this.myTemperature = Temperature.WARM;
				break;
			case WARM:
				break;
			case HOT: 
				this.myTemperature = Temperature.WARM;
				break;
			case BLAZING: 
				this.myTemperature = Temperature.HOT;
				break;
			}
		case MEDIUM:
			switch(this.myTemperature) {
			case COLD:
				this.myTemperature = Temperature.WARM;
				break;
			case WARM:
				this.myTemperature = Temperature.HOT;
				break;
			case HOT: 
				break;
			case BLAZING: 
				this.myTemperature = Temperature.HOT;
				break;
			}
		case HIGH: 
			switch(this.myTemperature) {
			case COLD:
				this.myTemperature = Temperature.WARM;
				break;
			case WARM:
				this.myTemperature = Temperature.HOT;
				break;
			case HOT: 
				this.myTemperature = Temperature.BLAZING;
				break;
			case BLAZING: 
				break;
			}
			break;
		}
		timer = TIME_DURATION;
	}
	
	public void updateTemperature() {
		if (this.timer ==0) {
			handleTemperature();
		
		}
		else {
			this.timer--;
		}
		
	}
}


