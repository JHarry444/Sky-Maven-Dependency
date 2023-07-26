package com.qa.demo;

public class Runner {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!");
        sb.append(" ");
        sb.append( new Person("Barry"));
        System.out.println(sb);
    }
}
