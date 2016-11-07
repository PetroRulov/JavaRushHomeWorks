package com.javarush.test.level14.lesson06.home01;

/**
 * Created by prulov on 07.11.2016.
 */
public class BelarusianHen extends Hen
{
    public BelarusianHen(){
        count = 35;
        country = Country.BELARUS;
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
