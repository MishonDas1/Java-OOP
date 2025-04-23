
package Constructor_Overloading;

public class Teacher {
    String name,gender;
    int age;
    
    Teacher(){
        System.out.println("No Information Found");
    }
    
    Teacher(String n,String g){
        name=n;
        gender =g;
    }
    Teacher(String n,String g,int a){
        name =n;
        gender=g;
        age=a;
    }
    
    void DisplayInformation(){
        System.out.println("Teacher name is: " + name);
        System.out.println("Teacher Gender is: " + gender);
        System.out.println("Teacher Age is: " + age);
        System.out.println("\n");
        
    }
    

    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        
        Teacher Teacher2 = new Teacher("Mishon Kumar","Male");
        Teacher2.DisplayInformation();
        
        Teacher Teacher3 = new Teacher("Arnab Kumar","Male",27);
        Teacher3.DisplayInformation();
        
    }
    
}
