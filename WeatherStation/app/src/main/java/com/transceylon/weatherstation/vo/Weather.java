package com.transceylon.weatherstation.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shanukagayashan on 6/20/17.
 */

public class Weather {
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("temparature_celcius")
    private String temparature_celcius;
    @SerializedName("temparature_fahrenheit")
    private String temparature_fahrenheit;

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getTemparature_celcius ()
    {
        return temparature_celcius;
    }

    public void setTemparature_celcius (String temparature_celcius)
    {
        this.temparature_celcius = temparature_celcius;
    }

    public String getTemparature_fahrenheit ()
    {
        return temparature_fahrenheit;
    }

    public void setTemparature_fahrenheit (String temparature_fahrenheit)
    {
        this.temparature_fahrenheit = temparature_fahrenheit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [humidity = "+humidity+", temparature_celcius = "+temparature_celcius+", temparature_fahrenheit = "+temparature_fahrenheit+"]";
    }
}
