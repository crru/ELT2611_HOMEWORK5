import java.util.Scanner;
public class Resister {
	public static void main(String[] args) {
		
		String s;
		double  r=0,r1=0,r2=0,r3=0,r4=0,r5=0,r6=0;
		
		System.out.print("\n\t\t\t\t\t       Regigtor 4-Band-Code");

		Scanner keyboard = new Scanner(System.in);
		System.out.print("\n\t\t\t\t\t\tEnter Color 1 : ");
		s = keyboard.nextLine();
		
		switch(s) {
		case "BX": r=0;break;
		case "BR": r=1;break;
		case "RE": r=2;break;
		case "OR": r=3;break;
		case "YE": r=4;break;
		case "GR": r=5;break;
		case "BL": r=6;break;
		case "PU": r=7;break;
		case "GE": r=8;break;
		case "WH": r=9;break;
		default : System.out.println("\n\t\t\t\t\t       ---------------------");
		          System.out.println("\t\t\t\t\t\tCan not Enter GO,SI");
		          System.out.println("\t\t\t\t\t       ---------------------\n");
		}
		
		System.out.print("\t\t\t\t\t\tEnter Color 2 : ");
		s = keyboard.nextLine();
		switch(s) {
		case "BX": r1=0;break;
		case "BR": r1=1;break;
		case "RE": r1=2;break;
		case "OR": r1=3;break;
		case "YE": r1=4;break;
		case "GR": r1=5;break;
		case "BL": r1=6;break;
		case "PU": r1=7;break;
		case "GE": r1=8;break;
		case "WH": r1=9;break;
		default : System.out.println("\n\t\t\t\t\t       ---------------------");
		          System.out.println("\t\t\t\t\t\tCan not Enter GO,SI");
		          System.out.println("\t\t\t\t\t       ---------------------\n");
		}
		
		r2=r1+r*10;
		r5=r2+r4;
		
		System.out.print("\t\t\t\t\t\tEnter Color 3 : ");
		s = keyboard.nextLine();
		
		switch(s) {
		case "BX": r4=1;break;
		case "BR": r4=10;break;
		case "RE": r4=Math.pow(10,2);break;
		case "OR": r4=Math.pow(10,3);break;
		case "YE": r4=Math.pow(10,4);break;
		case "GR": r4=Math.pow(10,5);break;
		case "BL": r4=Math.pow(10,6);break;
		case "PU": r4=Math.pow(10,7);break;
		case "GO": r4=0.1;break;
		case "SI": r4=0.01;break;
		default : System.out.println("\n\t\t\t\t\t   ---------------------------");
		          System.out.println("\t\t\t\t\t    Can not Enter GE,WH,GO,SI");
		          System.out.println("\t\t\t\t\t   ---------------------------\n");
		}
		
		r6=r5*r4;
		
		System.out.print("\t\t\t\t\t\tEnter Color 4 : ");
		s = keyboard.nextLine();
		
		switch(s) {
		case "BR": r3=1;break;
		case "RE": r3=2;break;
		case "GR": r3=0.5;break;
		case "BL": r3=0.25;break;
		case "PU": r3=0.10;break;
		case "GE": r3=0.05;break;
		case "GO": r3=5;break;
		case "SI": r3=10;break;
		case "NO": r3=20;break;
		default : System.out.println("\n\t\t\t\t\t  ------------------------------");
		          System.out.println("\t\t\t\t           Can not Enter OR,YE,WH,GO,SI");
		          System.out.println("\t\t\t\t\t  ------------------------------");
		}
		System.out.println("\n\n\t\t\t\t\t------------------------------------");
		System.out.println("\t\t\t\t\tThe Resistance is "+r6+" Ohm "+" +-"+r3);
		System.out.println("\t\t\t\t\t------------------------------------");
		
	}
}
