package com.jinglan.lilo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lilo on 2017/12/23.
 */

public class Suggestion
{
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort
    {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash
    {
        @SerializedName("txt")
        public String info;
    }

    public class Sport
    {
        @SerializedName("txt")
        public String info;
    }
}
