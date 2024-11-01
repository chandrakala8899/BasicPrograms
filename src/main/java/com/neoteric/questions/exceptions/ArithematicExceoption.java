package com.neoteric.questions.exceptions;

public class ArithematicExceoption  extends RuntimeException{
    String message;

    @Override
    public String getMessage() {

        return message;
    }

    public ArithematicExceoption(String message) {

        this.message = message;
    }


}


