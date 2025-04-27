
package Static_Variable;

public class Student {
    static int count=0;
    
    
    Student(){
        count++;
    }
    void Display(){
        System.out.println("Total student: " + count);
    
}

    public static void main(String[] args) {
        Student s1=new Student();
        s1.Display();
        
        Student s2=new Student();
        s2.Display();
        
         Student s3=new Student();
        s3.Display();
    }
    
}
