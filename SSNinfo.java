import java.util.Scanner;

public class SSNinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		String location;
		if(area==0) {
			location = null;
		}else if (area <= 3) {
			location = "New Hampshire" ;
		}else if (area <= 7) {
			location = "Maine" ;
		}else if (area <= 9) {
			location = "Vermont" ;
		}else if (area <= 34) {
			location = "Massachisetts" ;
		}else if (area <= 39) {
			location = "New Hampshire2" ;
		}else if (area <= 49) {
			location = "New Hampshire3" ;
		}else if (area <= 134) {
			location = "New Hampshire4" ;
		}else if (area <= 158) {
			location = "New Hampshire5" ;
		}else if (area <= 211) {
			location = "New Hampshire6" ;
		}else if (area <= 220) {
			location = "New Hampshire7" ;
		}else if (area <= 222) {
			location = "New Hampshire8" ;
		}else if (area <= 231) {
			location = "New Hampshire9" ;
		}else if (area <= 236) {
			location = "New Hampshire10" ;
		}else if (area <= 246) {
			location = "New Hampshire11" ;
		}else if (area <= 251) {
			location = "New Hampshire12" ;
		}else if (area <= 260) {
			location = "New Hampshire13" ;
		}else if (area <= 267) {
			location = "New Hampshire14" ;
		}else if (area <= 302) {
			location = "New Hampshire15" ;
		}else if (area <= 312) {
			location = "New Hampshire16" ;
		}else if (area <= 317) {
			location = "New Hampshire17" ;
		}else if (area <= 361) {
			location = "New Hampshire18" ;
		}else if (area <= 386) {
			location = "New Hampshire19" ;
		}else if (area <= 399) {
			location = "New Hampshire20" ;
		}else if (area <= 407) {
			location = "New Hampshire21" ;
		}else if (area <= 415) {
			location = "New Hampshire22" ;
		}else if (area <= 424) {
			location = "New Hampshire23" ;
		}else if (area <= 428) {
			location = "New Hampshire24" ;
		}else if (area <= 432) {
			location = "New Hampshire25" ;
		}else if (area <= 439) {
			location = "New Hampshire26" ;
		}else if (area <= 448) {
			location = "New Hampshire27" ;
		}else if (area <= 467) {
			location = "New Hampshire28" ;
		}else if (area <= 477) {
			location = "New Hampshire29" ;
		}else if (area <= 485) {
			location = "New Hampshire30" ;
		}else if (area <= 500) {
			location = "New Hampshire31" ;
		}else if (area <= 502) {
			location = "New Hampshire32" ;
		}else if (area <= 504) {
			location = "New Hampshire33" ;
		}else if (area <= 508) {
			location = "New Hampshire34" ;
		}else if (area <= 515) {
			location = "New Hampshire35" ;
		}else if (area <= 517) {
			location = "New Hampshire36" ;
		}else if (area <= 519) {
			location = "New Hampshire37" ;
		}else if (area <= 520) {
			location = "New Hampshire38" ;
		}else if (area <= 524) {
			location = "New Hampshire39" ;
		}else if (area <= 525) {
			location = "New Hampshire40" ;
		}else if (area <= 527) {
			location = "New Hampshire41" ;
		}else if (area <= 529) {
			location = "New Hampshire42" ;
		}else if (area <= 530) {
			location = "New Hampshire43" ;
		}else if (area <= 539) {
			location = "New Hampshire44" ;
		}else if (area <= 544) {
			location = "New Hampshire45" ;
		}else if (area <= 573) {
			location = "New Hampshire46" ;
		}else if (area <= 574) {
			location = "New Hampshire47" ;
		}else if (area <= 576) {
			location = "New Hampshire48" ;
		}else if (area <= 579) {
			location = "New Hampshire49" ;
		}else if (area <= 580) {
			location = "New Hampshire50" ;
		}else if (area <= 584) {
			location = "New Hampshire51" ;
		}else if (area <= 585) {
			location = "New Hampshire52" ;
		}else if (area <= 586) {
			location = "New Hampshire53" ;
		}else if (area <= 588) {
			location = "New Hampshire54" ;
		}else if (area <= 595) {
			location = "New Hampshire55" ;
		}else if (area <= 599) {
			location = "New Hampshire56" ;
		}else if (area <= 601) {
			location = "New Hampshire57" ;
		}else if (area <= 626) {
			location = "New Hampshire58" ;
		}else if (area <= 645) {
			location = "New Hampshire59" ;
		}else if (area <= 647) {
			location = "New Hampshire60" ;
		}else if (area <= 649) {
			location = "New Hampshire61" ;
		}else if (area <= 653) {
			location = "New Hampshire62" ;
		}else if (area <= 658) {
			location = "New Hampshire63" ;
		}else if (area <= 665) {
			location = "New Hampshire64" ;
		}else if (area <= 675) {
			location = "New Hampshire65" ;
		}else if (area <= 679) {
			location = "New Hampshire" ;
		}else if (area <= 680) {
			location = "New Hampshire" ;
		}else {
			location = null;
		}
		if(location != null) {
			System.out.println("Number was issued in "+ location);
		}else {
			System.out.println("Number is invalid");
		}
	}

}
