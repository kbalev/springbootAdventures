package alexandria;

public class Book extends Physical {

    private String title;
    private String author;
    private String content;
    private int pages;

    public Book(String title){
        this(title, "Author Unknown", "Content to be added.", 0);
    }

    public Book(String title, String content){
        this(title, "Author Unknown", content,  content.length()/3000);
    }


    public Book(String title, String author, String content, int pages){
        super(false);
        this.title = title;
        this.author = author;
        this.content = content;
        this.pages = pages;

    }

    public String getTitle() { return title; }

    public String getAuthor() {
        return author;
    }

    public String getContent() {return content; }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "{" +
                "\"name\":\""+ title +
                "\"author\":\""+ author +
                "\"content\":\""+ content +
                "\"pages\":\""+ pages +
                "\"}";

    }
}
