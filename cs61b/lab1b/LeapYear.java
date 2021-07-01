public class LeapYear{
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        boolean t = isLeapYear(i);
        if (t){
            System.out.println(i + " is a leap year.");
        }
        else {
            System.out.println(i + " is not a leap year.");
        }  
    }
    public static boolean isLeapYear(int year){
        if (year % 100 == 0){
            if (year % 400 == 0){
                 return true;
            }
            else{
                 return false;
            }
         }
         else{
            if (year % 4 == 0){
                  return true;
            }
            else{
                  return false;
            }
         }
     }
}
