package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("", "",0);
    }
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
    Book(String title, String author){
        this(title, author, 0);
    }

    void displayInfo(){
        System.out.println("책 제목: "+ title + " 책 저자: "+ author + " 페이지: "+ page);
    }
}
