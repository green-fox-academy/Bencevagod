package com.greenfox.color;

import org.springframework.stereotype.Service;

@Service()
public class ColorBlue implements MyColor{
    @Override
    public void printColor() {
        System.out.println("Blue");
    }
}
