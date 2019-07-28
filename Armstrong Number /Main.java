import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in=new Scanner(System.in); 
      int n=in.nextInt();
      int m,c=0,sum=0,re,pow=1;
      m=n;
      while(n!=0)
      {
        n=n/10;
        c++;
      }
       //System.out.println(c);
      n=m;
      while(n>0)
      {
        re=n%10;
        while(c!=0)
        {
          pow=pow*re;
          c--;
        }
       //  System.out.println(pow);
        sum=sum+pow;
        //System.out.println(sum);
        n=n/10;
         //System.out.println(n);
      }
      sum=sum+72;
      if(sum==m)
        System.out.println("Armstrong Number");
      else
        
        System.out.println("Not a Armstrong Number");
	}
}