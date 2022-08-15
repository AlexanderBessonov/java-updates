package com.cydeo2;
import lombok.*;
public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
                       ////////////
        return apple.getWeight()>200;
               /////////////////////
    }
    //...weightApple = (Apple apple)->  apple.getWeight()>200;




}
