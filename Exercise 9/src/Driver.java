
public class Driver {

	public static void main(String[] args)
	{
		
		
		
		
		
		Die[] dieObj = new Die[5];
		for (int k = 0; k < 5; k++)
		{
			dieObj[k] = new Die(6);
		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 100000; j++) {
				dieObj[i].rollDie();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(
					"In 100,000 rolls, you rolled 3 of a kind " + dieObj[i].getNum3() + " times," + " 4 of a kind "
							+ dieObj[i].getNum4() + " times, and 5 of a kind " + dieObj[i].getNum5() + " times.");

		}
		 
		 
		
		
		

	}

}
