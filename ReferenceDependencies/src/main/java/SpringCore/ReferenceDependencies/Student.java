package SpringCore.ReferenceDependencies;

public class Student {
	
	

	//private MathCheat mathCheat;
	
	
	/*
	 * public void setMathCheat(MathCheat mathCheat) { this.mathCheat = mathCheat; }
	 */
	
	
	private Cheating cheat;
		
	public void setCheat(Cheating cheat) {
		this.cheat = cheat;
	}

	public void cheat()
	{
	    cheat.cheat();
	}
	
	

}
