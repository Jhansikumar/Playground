import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int res=greatest(n1,n2,n3);
      System.out.println(res);
	}
  public static int greatest(int m1,int m2,int m3)
  { int result;
   if(m1>m2&&m1>m3)
      result=m1;
    else
      if(m2>m3)
        result=m2;
    else
      result=m3;
    return result;
  }
}