package life.test;

import static org.junit.Assert.*;
import life.Game;
import life.GameImpl;
import life.State;

import org.junit.Assert;
import org.junit.Test;

public class test1 {

	static Boolean[][] state =  { {false,false,false,false,false},
								  {false,false,true,false,false},
								  {false,false,true,false,false},
								  {false,false,true,false,false},
								  {false,false,false,false,false}};

	static Boolean[][] stateFinish =  { {false,false,false,false,false},
										{false,false,false,false,false},
										{false,true,true,true,false},
										{false,false,false,false,false},
										{false,false,false,false,false}};


	@Test
	public void test() {

		Game game = new GameImpl();
		State state = new State();
		state.setState(this.state);
		game.init(state);
		game.iterate();
		game.getState();
		Assert.assertArrayEquals(stateFinish, game.getState().getState());
		
	}

}
