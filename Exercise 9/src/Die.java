import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Die
{
    int value;
    
    int num3;
    int num4;
    int num5;
    
    Die(int val)
    {
    	this.value = val;
    }
    
	
	
	public int rollDie()
	{
		Random rnd = new Random();
		
		value = rnd.nextInt(3) + 3;
		
		if (value == 3)
		{
			num3++;
		}
		else if (value == 4)
		{
			num4++;
		}
		else
		{
			num5++;
		}
		
		
		return value;
	}
	
	
	public int getNum3()
	{
		return num3;
	}
	
	public int getNum4()
	{
		return num4;
	}
	
	public int getNum5()
	{
		return num5;
	}
	
	
}
