package com.javarush.test.samples.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by prulov on 27.12.2016.
 */
public class PlanetsSolution
{
    public static Planet thePlanet;

    static
    {
        try
        {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String planet = reader.readLine();

        if ("sun".equals(planet))
        {
            thePlanet = Sun.getInstance();
        } else
        {
            thePlanet = "moon".equals(planet) ? Moon.getInstance() : Earth.getInstance();
        }
    }
}
