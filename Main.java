//Bradley Dufour
//2016-01-13
import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int nCase = scan.nextInt();
      for(int i = 0; i < nCase; i++)
      {
         boolean good = true;
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
               if(password.charAt(j) >= 97 && password.charAt(j) <= 122)
                  nLower++;
               else if(password.charAt(j) >= 48 && password.charAt(j) <= 57)
                  number = true;
               else if(password.charAt(j) >= 65 && password.charAt(j) <= 90)
                  nUpper++;
               else if("!@#$%^&*.,;/?".indexOf(password.charAt(j)) > -1)
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
                  String newPass = password.toLowerCase();
                  String alphaNumPass1 = "";
                  String alphaNumPass2 = "";
                  for(int j = 0; j < newPass.length(); j++)
                  {
                     if("!@#$%^&*.,;/?".indexOf(newPass.charAt(j)) < 0)
                     {
                        alphaNumPass1 = alphaNumPass1 + newPass.charAt(j);
                        alphaNumPass2 = newPass.charAt(j) + alphaNumPass2;
                     }
                  }
                  if(alphaNumPass1.equals(alphaNumPass2))
                     good = false;
                  
                  if(good)
                  {
                     int letter = 0;
                     String illegal = "password";
                     for(int j = 0; j < alphaNumPass1.length(); j++)
                     {
                        if(alphaNumPass1.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "password";
                     for(int j = 0; j < alphaNumPass2.length(); j++)
                     {
                        if(alphaNumPass2.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "virginia";
                     for(int j = 0; j < alphaNumPass1.length(); j++)
                     {
                        if(alphaNumPass1.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "virginia";
                     for(int j = 0; j < alphaNumPass2.length(); j++)
                     {
                        if(alphaNumPass2.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "cavalier";
                     for(int j = 0; j < alphaNumPass1.length(); j++)
                     {
                        if(alphaNumPass1.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "cavalier";
                     for(int j = 0; j < alphaNumPass2.length(); j++)
                     {
                        if(alphaNumPass2.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "code";
                     for(int j = 0; j < alphaNumPass1.length(); j++)
                     {
                        if(alphaNumPass1.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                     letter = 0;
                     illegal = "code";
                     for(int j = 0; j < alphaNumPass2.length(); j++)
                     {
                        if(alphaNumPass2.charAt(j) == illegal.charAt(letter))
                        {
                           letter++;
                           if(letter >= illegal.length())
                           {
                              good = false;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if(good)
            System.out.println("Valid Password");
         else
            System.out.println("Invalid Password");
      }
      System.exit(0);
   }
}
