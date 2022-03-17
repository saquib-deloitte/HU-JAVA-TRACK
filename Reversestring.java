

import java.util.Scanner;

class Reversestring {
    public static void main (String[] args) {

        String  nstr="";

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  ");
        String  str= sc.nextLine();
        char ch;

        System.out.print("Original word: "+str);


        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }

        System.out.println("\nsaquib" +
                "Reversed word: "+ nstr);
    }
}

