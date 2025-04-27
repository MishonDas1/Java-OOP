
package Static_Method;


public class Static_Method {
    void Display1(){
        System.out.println("I am static Method");
    }
     static void Display2(){
        System.out.println("I am non static Method");
    }
    
    

    public static void main(String[] args) {
        Static_Method s1 = new Static_Method();
        s1.Display1();
        
        Static_Method.Display2();
    }
}
