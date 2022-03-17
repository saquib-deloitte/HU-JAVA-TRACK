
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Anagrams {


    static boolean arethey(char[] str1, char[] str2)
    {

        int n1 = str1.length;
        int n2 = str2.length;


        if (n1 != n2)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }


    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  ");
        String  strr1= sc.nextLine();
        String  strr2= sc.nextLine();



        char[] str1 = new char[strr1.length()];
        for (int i = 0; i < strr1.length(); i++) {
            str1[i] = strr1.charAt(i);
        }
        char[] str2 = new char[strr2.length()];
        for (int i = 0; i < strr2.length(); i++) {
            str2[i] = strr2.charAt(i);
        }





        if (arethey(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}

