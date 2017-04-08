package unitTests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import RockPaperScissors.Controller;

public class ControllerUnitTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	// test manageGame
	@Test(expected = Exception.class)
	public void shouldNotManageGameWithLessOrZeroRound() {
		Controller.manageGame(-1);
	}
	
	@Test
	public void shouldManageGameWithMoreThanZeroRound() {
		
	}

}
