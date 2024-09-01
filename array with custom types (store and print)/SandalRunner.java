package com.saqib;

import com.saqib.data.SandalData;
import com.saqib.store.SandalStore;

public class SandalRunner {

    public static void main(String[] args) {


        SandalData info1 = new SandalData("LV",9999.57,79);
        SandalData info2 = new SandalData("Keto",230.83,345);
        SandalStore sandalStore = new SandalStore();
        sandalStore.storedoube(434.33);
        sandalStore.storedoube(453);

        sandalStore.store(info1);
        sandalStore.store(info2);
        sandalStore.customDetails();
    }
}
