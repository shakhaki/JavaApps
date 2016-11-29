/*
 * Justin Lee
 * IS 4415
 */
package arrayapp;
import java.util.ArrayList;
public class ArrayApp {

    public static void main(String[] args) 
    {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("John");
        obj.add("Sarah");
        obj.add("Brown");
        obj.add("Steve");
        
        
        System.out.println("Currently the array list has the following elements" + obj);
        obj.add(0, "Rahul");
        obj.add(1, "Justin");
        System.out.println("Second elements: " +obj);
        obj.remove(1);
        System.out.println("Third elements: " + obj);
    }
    
}
