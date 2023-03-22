package ru.aston.zabalotcki;

public class Greetings {

    public static String gritting(int number) {
        String response = "Привет";
        String defaultResponse = "Your number less then 7";
        if (number > 7) {
            return response;
        } else {
            return defaultResponse;
        }
    }

    public static String grittingVyacheslav(String name){
        String response = "Привет, Вячеслав";
        String defaultResponse = "Нет такого имени";
        if (name.equals("Вячеслав")){
            return response;
        } else {
            return defaultResponse;
        }
    }
}
