package EIcode3.main; 
import EIcode3.elibrary.ELibraryDemo; 
import EIcode3.shapes.ShapeDemo; 
 
public class Main { 
    public static void main(String[] args) { 
        System.out.println("E-Library System (Proxy Pattern) Demo:"); 
        ELibraryDemo.runDemo(); 
 
        System.out.println("\\nDrawing Shapes (Composite Pattern) Demo:"); 
        ShapeDemo.runDemo(); 
    } 
} 
