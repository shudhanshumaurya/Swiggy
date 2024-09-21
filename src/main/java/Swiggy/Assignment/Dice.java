package Swiggy.Assignment;

import java.util.Random;

public class Dice {
	private int sides;
	private Random random = new Random();

    public Dice(Integer sides)
    {
    	this.sides = sides;
    }
    
    public int roll()
    {
    	return this.random.nextInt(this.sides)+1;
    }
    
	public Integer getSides() {
		return sides;
	}

	public void setSides(Integer sides) {
		this.sides = sides;
	}

	
	

}
