import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
    int   square=square1(n);
      System.out.println(square);
	}
public static int square1(int m)
{
  int s=m*m;
  return s;
}
}