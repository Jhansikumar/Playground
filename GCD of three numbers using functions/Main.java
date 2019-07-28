import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here\
       // Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int res=gcd(n1,n2,n3);
      System.out.println(res);
	}
  public static int gcd(int m1,int m2,int m3)
  {
    int min=0;
    int gcd;
    if(m1<m2&&m1<m3)
      min=m1;
    else
      if(m2<m3)
        min=m2;
    else
      min=m3;
   // System.out.println(min);
    
   //if(min%m1==0 && min%m2==0 && min%m3==0)
    {
      gcd=min;
    min--;
    }
    return gcd;
  }
    
}