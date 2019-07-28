import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
  public static void prime(int m)
  {
    int i,c,j;
    for(i=2;i<=m;i++)
    {
      c=0;
       for(j=1;j<=i;j++)
       {
          if(i%j==0)
            c++;
       }
      if(c==2)
      System.out.println(i);
    }
  }
}