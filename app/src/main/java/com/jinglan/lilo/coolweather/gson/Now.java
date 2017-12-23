package com.jinglan.lilo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lilo on 2017/12/23.
 */

public class Now
{
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
