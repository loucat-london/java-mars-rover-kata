package rover;

public class Rover {

	private String _initialHeading;
	private String _heading;

	public Rover(String initialHeading) {
		_initialHeading = initialHeading;
	}

	public void turnRight() {
		if (_initialHeading.equals("N"))
			_heading = "E";
		
		if (_initialHeading.equals("E"))
			_heading = "S";
	}

	public void turnLeft() {
		if (_initialHeading.equals("E"))
			_heading = "N";	
		
		if (_initialHeading.equals("N"))
			_heading = "W";
	}

	public String getHeading() {
		return _heading;
	}	
}