package unitTests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import rover.RoverCommand;

@RunWith(Parameterized.class)
public class RoverCommandTests {
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { "N", "R", "E" }, { "N", "L", "W" }, { "E", "L", "N" }, { "E", "R", "S" }
           });
    }
    
    @Parameter
    public String inputHeading;

    @Parameter(value = 1)
    public String turnCommand;
    
    @Parameter(value = 2)
    public String expected;

	@Test
	public void enter_whenCreatingPlateauDroppingRoverAndTurningRover_shouldReportPositionHeading() {
		RoverCommand roverCommand = new RoverCommand();
		roverCommand.enter("5 5");
		roverCommand.enter("1 2 " + inputHeading);
		roverCommand.enter(turnCommand);
		
		assertEquals("1 2 " + expected, roverCommand.getOutput());
	}

}