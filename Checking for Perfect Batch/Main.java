import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i, sum1=0,sum2=0,sum3=0;
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    for(i=0;i<3;i++)
      sum1=sum1+a[i];
    
      for(i=3;i<6;i++)
      sum2=sum2+a[i];
    if(n>6)
    {
      for(i=6;i<9;i++)
      sum3=sum3+a[i];
    }
    //System.out.println(sum2);
    if(sum1==sum2&&sum2==sum3)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
    
    
  }
}