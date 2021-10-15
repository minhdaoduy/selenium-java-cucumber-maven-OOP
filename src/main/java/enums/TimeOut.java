package enums;

public enum TimeOut {
	LOW(5),
	MIDDLE(10),
	HIGH(15),
	CUSTOM_MAX(60);
	private final int value;

	public int getValue() {
		return value;
	}

	// enum constructor - cannot be public or protected
	private TimeOut(int value) {
		this.value = value;
	}
}