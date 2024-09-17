package EIcode3.elibrary; 
 
public class RealBook implements Book { 
    private String title; 
 
    public RealBook(String title) { 
        this.title = title; 
        loadFromDisk(); 
    } 
 
    private void loadFromDisk() { 
        System.out.println("Loading book: " + title); 
    } 
 
    @Override 
    public void displayContent() { 
        System.out.println("Displaying content of " + title); 
    } 
} 
