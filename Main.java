//TODO: <name>
//TODO: <date>
//Practice 2011 - 03: Password Validation

public class  {
  public static void main(String[] args) {
    //Bradley Dufour
//2016-01-13
import java.util.Scanner;

public class BradleySolution
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      boolean good = true;
      int nCase = scan.nextInt();
      for(int i = 0; i < nCase; i++)
      {
         String password = scan.next(); scan.nextLine();
         if(password.length() < 9 || password.length() > 20)
            good = false;
         if(good)
         {
            int nLower = 0;
            int nUpper = 0;
            boolean number = false;
            int nSpecial = 0;
            for(int j = 0; j < password.length(); j++)
            {
               if(password.charAt(j) >= 97 || password.charAt(j) <= 122)
                  nLower++;
               if(password.charAt(j) >= 48 || password.charAt(j) <= 57)
                  number = true;
               if(password.charAt(j) >= 65 || password.charAt(j) <= 90)
                  nUpper++;
               if("!@#$%^&*.,;/?".indexOf(password.charAt(j)) > 0)
                  nSpecial++;
            }
            if(nLower < 2 || nUpper < 2 || !number || nSpecial < 2)
               good = false;
            if(good)
            {
               char first;
               char second;
               char third;
               for(int j = 0; j < password.length() - 2; j++)
               {
                  first = password.charAt(j);
                  second = password.charAt(j+1);
                  third = password.charAt(j+2);
                  if(first == second && first == third)
                     good = false;
               }
               if(good)
               {
                  
               }
            }
         }      
      }
   }
}
    System.exit(0);
  }
}
