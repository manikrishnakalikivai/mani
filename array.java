import java.util.Scanner;

class Ar

{

        public static void main (String [] args )

        {

        

           int a[][] = new int [2][2];

           Scanner obj = new Scanner(System.in);

              System.out.println("enter values");

              for( int i=0;i<=1;i++)

              {

                 for( int j=0;j<=1;j++)

                 {
                 
                   
                    a[i][j] =obj. nextInt();
 

                 }

              }

              

               for(int i=0;i<=1;i++)

               {

                   for(int j=0;j<=1;j++)

                   {

                        System.out.print(a[i][j]);

                        

                    }
                }
  
              

               System.out.println(a[1][1]);
          }
}

    

        

                     

          