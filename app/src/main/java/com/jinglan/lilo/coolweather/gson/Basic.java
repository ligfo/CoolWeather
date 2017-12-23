package com.jinglan.lilo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lilo on 2017/12/23.
 */

public class Basic
{
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updatetime;
    }
}
