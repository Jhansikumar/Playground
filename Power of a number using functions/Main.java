import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int result=power(n,m);
      System.out.println(result);
    }
  public static int power(int l,int m)
  { 
    int r=1;
    while(m!=0)
    {
      r=r*l;
      m--;
    }
    return r;
  }
}  