import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
     Scanner sc=new Scanner(System.in);
    int i,j;
    
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
      for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
     for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}