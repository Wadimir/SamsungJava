package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nameless", 1240);
        person = new Person.Builder().withColor(392).withHeight(176).withMax(63).withChildren(false).build();
        ApiService apiService = ApiService.getInstance();
        System.out.println(person.toString());
        System.out.println(apiService.toString());
    }
}
