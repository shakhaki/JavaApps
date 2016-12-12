/*
 * Justin Lee
 * IS 4415
 */
package xdemo;

/**
 *
 * @author Admin
 */
public class XDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int j;
        int i;
        for(i = 0; i<5; i++)
        {
            System.out.print("X");
            System.out.println();
            if(i == 4)
            {
                for(j = 5; j > 0; j--)
                {
                    System.out.print("X \n");
                }
            }
        }
        
    }
    
}
