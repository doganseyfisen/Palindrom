import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	static boolean isPalindrom(int number) {
		int mainNumber = number, reverseNumber = 0, lastNumber;
		while(mainNumber != 0) {
			lastNumber = mainNumber % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			mainNumber /= 10;
		}
		
		if(number == reverseNumber) {
			System.out.println(number + " is Palindrom.");
		}else {
			System.out.println(number + " is not Palindrom.");
		}
		
		return true;
	}

	
    public static void main(String[] args){
  		  Scanner input = new Scanner(System.in);
  		  System.out.print("Enter a number: ");
  		  int number = input.nextInt();
  		  isPalindrom(number);
    }
}
