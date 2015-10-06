import java.util.Scanner;

 public class democ{

  		public static void main(String[] args) {
  			double sum = 0;
       
   		Scanner scan = new Scanner(System.in);


  			System.out.print("you are key Corol 1 ::: "); 
        double c1 = scan.nextInt();

  			System.out.print("you are key Corol 2 ::: ");
         double c2 = scan.nextInt();
  				sum = (c1 += c2);

  			System.out.print("you are key Corol 3 ::: ");
         double p1 = scan.nextInt(); 
  			 	sum = (sum * p1 );

  			System.out.print("you are key Error value Corol silver&gold ");
  			System.out.println("silver [1] :: Gold[2] :: brown[3]");
      
      
      double f1 = scan.nextInt();

				 if ( f1 < 5 && f1 > 9 ) {
           
            Math.pow(10,f1);
               System.out.printf("sum = %10.10f", sum ); System.out.println("Ohm");
               System.out.println();
               System.out.println("Error value []"); 
               System.out.printf("f1 = %4.4f", f1 );
         } else{
  		
          System.out.println("ohhh");

       }
               
          			
  		}
 }
