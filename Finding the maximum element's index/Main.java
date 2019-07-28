import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i,j=0,large=0;
     for(i=0;i<n;i++)
      a[i]=in.nextInt();
     for(i=0;i<n;i++)
     {
      if(large<a[i])
      {
        large=a[i];
       j=i;
  }
     }
    System.out.println(j);
    
    
  }
}