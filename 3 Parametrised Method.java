package com.mycompany.java_oop;

public class Teacher {
    String name,gender;
    String phone;
    int age;
    
    void SetInformation(String n,String g, String p,int a){
        name =n;
        gender=g;
        phone=p;
        age=a;
    }
    
    void Display(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone Number : " +phone);
        System.out.println("Age : " + age);
        System.out.println("\n");
        
    }
    

    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.SetInformation("Mishon Das","Male","01311134",20);
        Teacher1.Display();
        
        Teacher Teacher2 = new Teacher();
        Teacher2.SetInformation("Mishon Das","Male","01311134",20);
      
        Teacher2.Display();
       
    }
    
}
