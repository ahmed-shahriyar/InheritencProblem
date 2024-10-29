public class Book extends LibraryItem{
    String publisher;
    int pages;
    void displayinformation2 () {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ItemID : "+itemID);
        System.out.println("Pages : "+pages);
        System.out.println("Publisher : "+publisher);
    }
}
