
package static_kyword;

public class stati {
    
    String name;
    int id;
    static String university="UU";
    
    stati(String n,int i){
        name=n;
        id=i;
    }
    
    void Display(){
        System.out.println("Name:"+ name);
        System.out.println("Id:"+ id);
        System.out.println("University name:" + university);
    }
    

    public static void main(String[] args) {
        stati s1 =new stati("Mishon Das",223308);
        s1.Display();
        stati s2 =new stati("Arnab Kumar",503487);
        s2.Display();
    }
    
}
