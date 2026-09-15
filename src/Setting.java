public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	private String value;
	
	private Setting(String aValue) {
		this.value = aValue;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
