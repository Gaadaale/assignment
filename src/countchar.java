//The Author: Osman Ismail
import java.util.ArrayList;
import java.util.Scanner;


public class countchar {


    private  int row;
    private int sign;
    private  int  stopp;


   // public countchar() {

   // }


    public int getRow() {
        return  row;
    }

    public int getNumberSign()
    {
        return  sign;
    }

    public int getStop()
    {
        return  stopp;
    }
  private void assertEquals(String expected, int actual) {
         }

    public static void CountMethod() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("skriv nåt");
        String text = sc.nextLine();

        while (!text.equals("stop")) {
            list.add(text);
            text = sc.nextLine();
        }
        int sumChars = 0;
        for (String s : list){
            sumChars += s.length();
        }
        System.out.println("Number of row is: " + list.size());
        System.out.println("Number of sign is: " + sumChars );
    }


}





