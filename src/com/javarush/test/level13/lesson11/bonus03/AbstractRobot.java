package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot
{
    protected static int hitCount;
    protected String name;

    public AbstractRobot(String name)
    {
        this.name = name;
    }

    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            attackedBodyPart =  BodyPart.CHEST;
        } else if (hitCount == 2)
        {
            attackedBodyPart =  BodyPart.ARM;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            attackedBodyPart =  BodyPart.HEAD;
        } else
        {
            hitCount = 0;
            attackedBodyPart =  BodyPart.LEG;
        }
        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            defencedBodyPart =  BodyPart.LEG;
        } else if (hitCount == 2)
        {
            defencedBodyPart =  BodyPart.HEAD;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            defencedBodyPart =  BodyPart.ARM;
        } else
        {
            hitCount = 0;
            defencedBodyPart =  BodyPart.CHEST;
        }
        return defencedBodyPart;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
