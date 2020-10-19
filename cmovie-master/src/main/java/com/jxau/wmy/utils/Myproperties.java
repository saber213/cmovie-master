package com.jxau.wmy.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Myproperties {

    @Value(value = "${filepath}")
    private String filepath;

    public Myproperties() {
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "Myproperties{" +
                "filepath='" + filepath + '\'' +
                '}';
    }
}
