import java.util.Scanner;
public class Register {

	public static void main(String[] args) {

		int s1= 0,s2 = 0;

		String BX ="BX";
		String BR ="BR";
		String RE ="RE";
		String OR ="OR";
		String YL ="YL";
		String GR ="GR";
		String BL ="BL";
		String PU ="PU";
		String GE ="GE";
		String WH ="WH";
		String GO ="GO";
		String SI ="SI";
		String NO ="NO";
		 
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a Color1 : ");
				String color1 = input.nextLine();
			System.out.print("Enter a Color2 : ");
				String color2 = input.nextLine();
			System.out.print("Enter a Color3 : ");
				String color3 = input.nextLine();
			System.out.print("Enter a Color4 : ");
				String color4 = input.nextLine();
				System.out.print("\n");

				String str1 = color1.substring(0, 2);
				String str2 = color2.substring(0, 2);
				String str3 = color3.substring(0, 2);
				String str4 = color4.substring(0, 2);

//////////////////////////////////////       color1           /////////////////////////////////////////////// 

					if(str1.equals(BX)){
						
						int c1 = 0;
						s1=c1;
					}
					if(str1.equals(BR)){
						int c1 = 1;
						s1=c1;
					}
					if(str1.equals(RE)){
						int c1 = 2;
						s1=c1;
					}
					if(str1.equals(OR)){
						int c1 = 3;
						s1=c1;
					}
					if(str1.equals(YL)){
						int c1 = 4;
						s1=c1;
					}
					if(str1.equals(GR)){
						int c1 = 5;
						s1=c1;
					}
					if(str1.equals(BL)){
						int c1 = 6;
						s1=c1;
					}
					if(str1.equals(PU)){
						int c1 = 7;
						s1=c1;
					}
					if(str1.equals(GE)){
						int c1 = 8;
						s1=c1;
					}
					if(str1.equals(WH)){
						int c1 = 9;
						s1=c1;
					}
					if(str1.equals(GO)){
						System.out.print("Color : 10");
						
					}
					if(str1.equals(SI)){
						System.out.print("Color : 11");
						
					}
					if(str1.equals(NO)){
						System.out.print("Color : 12");
					}

//////////////////////////////////////       color2           /////////////////////////////////////////////// 

					if(str2.equals(BX)){
						int c2 = 0;
						s2=c2;
					}
					if(str2.equals(BR)){
						int c2 = 1;
						s2=c2;
					}
					if(str2.equals(RE)){
						int c2 = 2;
						s2=c2;
					}
					if(str2.equals(OR)){
						int c2 = 3;
						s2=c2;
					}
					if(str1.equals(YL)){
						int c2 = 4;
						s2=c2;
					}
					if(str2.equals(GR)){
						int c2 = 5;
						s2=c2;
					}
					if(str2.equals(BL)){
						int c2 = 6;
						s2=c2;
					}
					if(str2.equals(PU)){
						int c2 = 7;
						s2=c2;
					}
					if(str2.equals(GE)){
						int c2 = 8;
						s2=c2;
					}
					if(str2.equals(WH)){
						int c2 = 9;
						s2=c2;
					}
					if(str2.equals(GO)){
						
					}
					if(str2.equals(SI)){
						
					}
					if(str2.equals(NO)){
						
					}
		
//////////////////////////////////////       color3           /////////////////////////////////////////////// 

					if(str3.equals(BX)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print(" Ohm");
					}
					if(str3.equals(BR)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print("0 Ohm");
					}
					if(str3.equals(RE)){
						System.out.print(" = "+s1);
						System.out.print(".");
						System.out.print(s2);
						System.out.print(" K Ohm");
					}
					if(str3.equals(OR)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print(" K Ohm");
					}
					if(str3.equals(YL)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print("0 K Ohm");
					}
					if(str3.equals(GR)){
						System.out.print(" = "+s1);
						System.out.print(".");
						System.out.print(s2);
						System.out.print(" M Ohm");
					}
					if(str3.equals(BL)){
						System.out.print(" = "+s1);
						System.out.print(".");
						System.out.print(s2);
						System.out.print(" M Ohm");
					}
					if(str3.equals(PU)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print("0 M Ohm");
					}
					if(str3.equals(GE)){
						System.out.print(" = "+s1);
						System.out.print(".");
						System.out.print(s2);
						System.out.print(" G Ohm");
					}
					if(str3.equals(WH)){
						System.out.print(" = "+s1);
						System.out.print(s2);
						System.out.print(" G Ohm");
					}
					if(str3.equals(GO)){
						System.out.print(" = "+s1);
						System.out.print(".");
						System.out.print(s2);
						System.out.print(" Ohm");

					}
					if(str3.equals(SI)){
						System.out.print(" = .");
						System.out.print(s1);
						System.out.print(s2);
						System.out.print(" Ohm");
					}
					if(str3.equals(NO)){
						
					}

//////////////////////////////////////       color4           /////////////////////////////////////////////// 

					if(str4.equals(BX)){
						
					}
					if(str4.equals(BR)){
						System.out.print(" (+- 1%)");
					}
					if(str4.equals(RE)){
						System.out.print(" (+- 2%)");
					}
					if(str4.equals(OR)){
						System.out.print(" (+- 3%)");
					}
					if(str4.equals(GR)){
						System.out.print(" (+- 4%)");
					}
					if(str4.equals(BL)){
						
					}
					if(str4.equals(PU)){
						
					}
					if(str4.equals(GE)){
						
					}
					if(str4.equals(WH)){
						System.out.print(" (+- 5%)");
					}
					if(str4.equals(GO)){
						System.out.print(" (+- 10%)");
					}
					if(str4.equals(SI)){
						System.out.print(" (+- 20%)");
					}
					if(str4.equals(NO)){
						
					}
					System.out.print("\n");

	}
}
