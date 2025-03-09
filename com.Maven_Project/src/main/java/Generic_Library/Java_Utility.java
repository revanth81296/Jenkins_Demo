package Generic_Library;

import java.util.Random;

public class Java_Utility {
	/**
	 * This Method is used to give a random number
	 * @return
	 */
	public int Get_Random_Number() {
		Random r = new Random();
		int result = r.nextInt();
		return result;
	}
}
