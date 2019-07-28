import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[ ]=new int[n];
      int i,count=0,count1=0;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
       int s1=in.nextInt();
      int s2=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==s1)
        {
           System.out.println(i);
           count++;
        }
         if(a[i]==s2)
         {
      System.out.println(i);
      count1++;
         }
      }      
        if(count==0)
       System.out.println("-1");
      if(count1==0)
         System.out.println("-1");
    }
}