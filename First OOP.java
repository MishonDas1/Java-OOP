package com.mycompany.java_oop;

public class Teacher {
    String name,gender;
    String phone;
    int age;
    


    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.name="Mishon Kumar";
        Teacher1.gender="Male";
        Teacher1.phone="013111349" ;
        Teacher1.age=20;
        System.out.println("Name : " + Teacher1.name);
        System.out.println("Gender : " + Teacher1.gender);
        System.out.println("Phone NUmber : " + Teacher1.phone);
        System.out.println("Age : " + Teacher1.age);
        
        Teacher Teacher2 = new Teacher();
        Teacher2.name="Arnab Kumar";
        Teacher2.gender="Male";
        Teacher2.phone="013111349" ;
        Teacher2.age=20;
        System.out.println("Name : " + Teacher2.name);
        System.out.println("Gender : " + Teacher2.gender);
        System.out.println("Phone Number : " + Teacher2.phone);
        System.out.println("Age : " + Teacher2.age);
    }
    
}
