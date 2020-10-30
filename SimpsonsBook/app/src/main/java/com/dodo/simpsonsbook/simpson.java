package com.dodo.simpsonsbook;

import java.io.Serializable;

public class simpson implements Serializable {

    private String name;
    private String job;
    private int pictureInteger;

    public simpson(String name, String job, int pictureInteger) {
        this.name = name;
        this.job = job;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
