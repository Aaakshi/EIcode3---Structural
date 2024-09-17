package EIcode3.elibrary; 
 
public class ProxyBook implements Book { 
    private RealBook realBook; 
    private String title; 
    private boolean hasAccess; 
 
    public ProxyBook(String title, boolean hasAccess) { 
        this.title = title; 
        this.hasAccess = hasAccess; 
    } 
 
    @Override 
    public void displayContent() { 
        if (hasAccess) { 
            if (realBook == null) { 
                realBook = new RealBook(title); 
            } 
            realBook.displayContent(); 
        } else { 
            System.out.println("Access denied to view book: " + title); 
        } 
    } 
} 
