package com.xworkz.cap.internal;

public class Television {

    private String quality;


    public Television(String quality)
    {
        this.quality = quality;
    }
    public String getQuality()
    {
        return quality;
    }
    public void setQuality(String quality)
    {
        this.quality = quality;
        System.out.println("new quality: "+quality);
    }
}
