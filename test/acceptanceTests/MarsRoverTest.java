package acceptanceTests;

import static org.junit.Assert.*;

import org.junit.Test;

import rover.RoverCommand;

public class MarsRoverTest {

	@Test
	public void marsRover_moves_to_expected_position() {
		RoverCommand roverCommand = new RoverCommand();
		roverCommand.enter("5 5");
		roverCommand.enter("1 2 N");
		roverCommand.enter("LMLMLMLMM");
		assertEquals("1 3 N", roverCommand.getOutput());
		roverCommand.enter("3 3 E");
		roverCommand.enter("MMRMMRMRRM");
		assertEquals("5 1 E", roverCommand.getOutput());
	}
}
