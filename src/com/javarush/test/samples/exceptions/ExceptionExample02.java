package com.javarush.test.samples.exceptions;

/**
 * Created by prulov on 26.09.2016.
 */
public class ExceptionExample02
{
    public static void main(String[] args)
    {
        try{
            int value = f();
            System.out.println(value);
        }
        catch(MyRuntException e){
            System.out.println("ERROR!" + "" + e.getLogin() +"-"+ e.getPassword());
        }
    }

    private static int f()
    {
        return g() / 2;
    }

    private static int g()
    {
        if(System.currentTimeMillis() % 2 == 0){
            return 0;
        }else{
            throw new MyRuntException("Petro", "123quartet");
        }
    }

    static class MyRuntException extends RuntimeException
    {
        String login;
        String password;

        public MyRuntException(String login, String password)
        {
            this.login = login;
            this.password = password;
        }

        public String getLogin()
        {
            return login;
        }

        public String getPassword()
        {
            return password;
        }
    }
}
