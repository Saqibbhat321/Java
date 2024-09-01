package com.saqib.store;

import com.saqib.data.SandalData;

public class SandalStore {

    SandalData[] sandalData = new SandalData[2];


    double[] dudu = new double[2];
    int index;

    public void store(SandalData data)
    {
        sandalData[index] = data;
        index++;
    }

    public void storedoube(double dodo)
    {
        this.dudu[this.index]= dodo;
        index++;
    }
    public void customDetails()
    {
        for(double def:dudu)
        {
            System.out.println(def);
        }
        for(SandalData ref: sandalData)
        {
            if(ref!=null)
            {
                ref.viewDetails();
            }
            else
                System.out.println("Null Pointer Exception");
        }
    }
}
