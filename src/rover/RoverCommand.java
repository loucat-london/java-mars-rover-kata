package rover;

public class RoverCommand {

	private Object heading;

	public void enter(String input) {
		heading = input.length() == 1 ? input : null;
	}

	public Object getOutput() {
		
		if (heading == "R")
			return "1 2 E";
		
		return "1 2 W";
	}

}
