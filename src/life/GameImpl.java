package life;

public class GameImpl implements Game {
	
	private State curState;

	@Override
	public void init(State state) {
		curState = state;
	}

	@Override
	public void iterate() {
		State nextState = new State();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				Boolean curPoint =curState.getState()[i][j];
				Boolean nexPoint;
				if(curPoint == true)
				{
					Boolean sosedtrue;
					if(i>=0 && i<=5 && j>=0 && j<=5 && curState.getState()[i-1][j])
					{
						sosedtrue
					}
					if(sosedtrue)
						{
							nexPoint = true;
						}else
						{
							nexPoint = false;
						}
					
				}else
				{
					if(sosedfalse)
					{
						nexPoint = true;
					}else
					{
						nexPoint = false;
					}
				}
				nextState.getState()[i][j] = nexPoint;
			}
		}
			
		curState =  nextState;

	}

	@Override
	public State getState() {
		return curState;
	}

}
