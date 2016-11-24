package com.javarush.test.level10.examples;

import java.util.Scanner;

/**
 * Created by prulov on 23.11.2016.
 */
public class IntInBit
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the positive integer number not more than 2_147_483_647:");
        int real = 0;
        if(scan.hasNextInt()){
            real = scan.nextInt();
            if (real < 0 || real > Integer.MAX_VALUE) {
                System.out.println("!!!You input incorrect number!!! Read the clauses carefully, please!");
                return;
            }
            convertIntIntoBinary(real);
        }else{
            System.out.println("You didn't input the int number");
            return;
        }
    }

    public static void convertIntIntoBinary(int num) {

        String result = "";
        String res = "";
        int idx = num, z = 0;

        while (idx > 1) {
            //idx /= 2;
            z = num % 2;
            num = idx /= 2;
            res += String.valueOf(z);
        }

        res += String.valueOf(num);

        int i = res.length();
        while (i > 0) {
            i--;
            result += res.substring(i, i + 1);
        }
        checkBinary(result);
    }

    public static void checkBinary(String result) {

        if (result.length() < 8) {
            while (result.length() < 8) {
                result = "0" + result;
            }
        } else if (result.length() > 8 && result.length() < 16) {
            while (result.length() < 16) {
                result = "0" + result;
            }
        } else if (result.length() > 15 && result.length() < 24) {
            while (result.length() < 24) {
                result = "0" + result;
            }
        } else if (result.length() > 23 && result.length() < 32) {
            while (result.length() < 32) {
                result = "0" + result;
            }
        }
        System.out.println(result);
    }

}
