package life;

public interface Game {

	void init(State state);
	void iterate();
	State getState();
	
	
}
