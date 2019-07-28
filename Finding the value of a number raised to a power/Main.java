import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int base,exp,val=1;
      Scanner sc=new Scanner(System.in);
      base=sc.nextInt();
      exp=sc.nextInt();
      while(exp!=0)
      {
        val=val*base;
        exp--;
    }
      System.out.println(val);
}
}



