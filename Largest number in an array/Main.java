import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[ ]=new int[n];
      int i,large=0;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(large<a[i])
        {
          large=a[i];
        }
      } 
      System.out.println(large);
    }
}