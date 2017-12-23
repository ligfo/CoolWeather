package com.jinglan.lilo.coolweather.gson;

/**
 * Created by lilo on 2017/12/23.
 */

public class AQI
{
    public AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
