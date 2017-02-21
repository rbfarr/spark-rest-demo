package com.codefellows.app;

import com.google.gson.Gson;

import java.util.ArrayList;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Location barn = new Barn();
        Location pasture = new Pasture();
        Location house = new House();

        ArrayList<Unicorn> unicorns = new ArrayList<Unicorn>();

        Unicorn unicornA = new Unicorn("Sprinkles", barn);
        Unicorn unicornB = new Unicorn("Rainbow", pasture);
        Unicorn unicornC = new Unicorn("Jackson", house);

        System.out.println(unicornA);

        unicorns.add(unicornA);
        unicorns.add(unicornB);
        unicorns.add(unicornC);

        get("/unicorns", (req, res) -> new Gson().toJson(unicorns));

        put("/unicorn/:name/:location", (req, res) -> {
            for (Unicorn unicorn : unicorns) {
                if (unicorn.getName() == req.params(":name")) {
                    unicorn.getLocation().setName(req.params(":location"));
                }
            }

            return 204;
        });
    }
}
