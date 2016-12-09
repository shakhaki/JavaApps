/*
 * Justin Lee
 * IS 4415
 */
package filestatistics;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics {

    public static void main(String[] args) 
    {
        Path file = 
                    Paths.get("C:\\DemoFolder\\DemoText.txt");
        try
        {
            int count = file.getNameCount();
            System.out.println("Path is " + file.toString());
            System.out.println("File name is " + file.getFileName());
            System.out.println("Folder name is " + file.getName(count - 2));
            System.out.println("Folder name is " + file.getName(count - 1));
            BasicFileAttributes attr = 
                            Files.readAttributes(file, BasicFileAttributes.class);
            
            System.out.println("File size is " + attr.size());
            FileTime time = attr.creationTime();
            System.out.println("File creation time is " + time);
            
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
    
}
