package com.pluralsight;

public class SetterGetter {
    //what prints out the setter getter
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("DAVE");
        person.setAge(56);

        System.out.println("Name is: " + person.getName());
        System.out.println("Age is: " + person.getAge());
    }
}
