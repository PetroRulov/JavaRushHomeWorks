package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{
    public RussianHen(){
        count = 30;
        country = Country.RUSSIA;
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        if(this != null){
            return count;
        }
        return 0;
    }

    @Override
    String getDescription()
    {
        if(this != null){
            return super.getDescription() + " Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
        }
        return "-1";
    }
}
