package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {

            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {

            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
