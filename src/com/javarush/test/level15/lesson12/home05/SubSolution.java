package com.javarush.test.level15.lesson12.home05;

import java.math.BigDecimal;

/**
 * Created by prulov on 27.12.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(Object pub1)
    {
        super(pub1);
    }

    public SubSolution(String pub2)
    {
        super(pub2);
    }

    public SubSolution(Integer pub3)
    {
        super(pub3);
    }

    SubSolution(BigDecimal def1)
    {
        super(def1);
    }

   SubSolution(Byte def2)
    {
        super(def2);
    }

    SubSolution(Short def3)
    {
        super(def3);
    }

    protected SubSolution(Character prot1)
    {
        super(prot1);
    }

    protected SubSolution(Double prot2)
    {
        super(prot2);
    }

    protected SubSolution(Exception prot3)
    {
        super(prot3);
    }

    private SubSolution(int priv1) {
        super(priv1);
    }

    private SubSolution(Boolean priv2) {
        super(priv2);
    }

    private SubSolution(Float priv3) {
        super(priv3);
    }
}
