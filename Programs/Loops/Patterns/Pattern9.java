   //         * (1,1)(1,2)(1,3)(1,4)(1,5*)
   //       * * (2,1)(2,2)(2,3)(2,4*)(2,5*)
   //     * * * (3,1)(3,2)(3,3*)(3,4*)(3,5*)
   //   * * * * (4,1)(4,2*)(4,**)(4,4*)(4,5*)
   // * * * * * (5,1*)(5,2*)(5,3*)(5,4*)(5,5*)
import java.util.Scanner;
class Pattern9 
{
   public static void main(String[] args) 
   {
      Scanner ip=new Scanner(System.in);
      System.out.print("Enter number:");
      int n=ip.nextInt();
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j+i>n)
            {
               System.out.print("*"+" ");
            }
            else
            {
               System.out.print(" "+" ");
            }
         }
         System.out.println();
      }   
   }
}