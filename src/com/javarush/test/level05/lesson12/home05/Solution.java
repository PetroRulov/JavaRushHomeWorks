package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        int number = 0;
        while(!isExit){
            if(scan.hasNextInt()){
                number = scan.nextInt();
                sum += number;
            }else{
                isExit = scan.nextLine().equals("сумма");
            }
        }
        System.out.println(sum);
    }
}
