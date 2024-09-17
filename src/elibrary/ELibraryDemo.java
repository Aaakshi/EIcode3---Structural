package EIcode3.elibrary; 
 
public class ELibraryDemo { 
    public static void runDemo() { 
        Book book1 = new ProxyBook("The Great Gatsby", true); 
        book1.displayContent(); 
 
        Book book2 = new ProxyBook("1984", false); 
        book2.displayContent(); 
    } 
} 
