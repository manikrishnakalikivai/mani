import java.util.*;

class Fact

{

    public static void main (String args [] )

     {

      int a;

      int num =1;

      Scanner f = new Scanner (System.in);
     
      System.out.println("enter a number");

       a = f.nextInt();

      for (int i=1;i<=a;i++)

       {

          num = num *((a-i)+1);

       }

        System.out.println(num);
     

       }

}

      

        

