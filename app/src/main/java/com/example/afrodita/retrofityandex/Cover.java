package com.example.afrodita.retrofityandex;

import java.io.Serializable;

/**
 * Created by Afrodita on 05.12.2017.
 */

public class Cover implements Serializable{

    String small;
    String big;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }
}
