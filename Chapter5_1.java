import java.util.Scanner;

public class Chapter5_1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter SSN number in form ddd-dd-dddd: ");
		String ssn = input.nextLine().trim();
		while(true) {
			if(ssn.length()!=11) {
				System.out.println("Error number must have 11 characters");
			}else if (ssn.charAt(3) != '-' || ssn.charAt(6)!='-') {
				System.out.println("Error : number must have the form ddd-dd-dddd");
			}else {
				break;
				
			}
			System.out.println("Please re-enter number: ");
			ssn = input.nextLine().trim();
		}
		int area = Integer.parseInt(ssn.substring(0,3));
		
		int [] areaNumbers = {111,222,333,444,555};
		String [] locations = {"Georgia", "California","Florida","New Mexico","texas"};
		for (int i = 0; i<areaNumbers.length;i++) {
			if(areaNumbers[i]>=area) {
				System.out.println("The location is "+ locations[i]);
				break;
			}
		}
	}
}
