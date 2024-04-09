package com.student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input;

        Console console=new Console();

        do input = console.Start(); while (input>0);

        console=null;

    }
}
