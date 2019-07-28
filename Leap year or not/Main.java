import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int ye=in.nextInt();
		// Type your code here
      if(ye%4==0)
      {
        if(ye%100==0)
        {
          if(ye%400==0)
           System.out.println("Leap year");
          else
            System.out.println("Non Leap year");
       }
        else
        
     System.out.println("Non Leap year");
      }
        else
     System.out.println(" Leap year");
    
}
}