import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
    int   sum=sum1(n);
      System.out.println(sum);
	}
  public static int sum1(int m)
  {
    int i,s1=0;
    for(i=1;i<=m;i++)
    {
      s1=s1+i;
    }
  return s1;
  }
}
