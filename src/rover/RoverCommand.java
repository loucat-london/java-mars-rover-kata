package rover;

public class RoverCommand {

	private static final int TURN_COMMAND_LENGTH = 1;
	private static final int ROVER_INITIAL_POSITION_AND_HEADING_COMMAND_LENGTH = 5;
	private String turnCommand;
	private String initialHeading;
	private Rover _rover;

	public void enter(String input) {		
		initialHeading = getInitialHeading(input);
		turnCommand = getTurnCommand(input);
		
		if (turnCommand != null)
		{
			_rover = new Rover(initialHeading);
			
			if (turnCommand == "R")
				_rover.turnRight();
			else
				_rover.turnLeft();
		}
	}

	private String getTurnCommand(String input) {
		return input.length() == TURN_COMMAND_LENGTH ? input : turnCommand;
	}

	private String getInitialHeading(String input) {
		if (input.length() == ROVER_INITIAL_POSITION_AND_HEADING_COMMAND_LENGTH)
			return input.substring(input.length() - 1, input.length());
		
		return initialHeading;
	}

	public Object getOutput() {
		return "1 2 " + _rover.getHeading();
	}
}