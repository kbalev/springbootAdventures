package alexandria;

public class Magazine {

    private String title;
    private int issue;
    private int pages;

    public Magazine(String title, int issue, int pages){
        this.title = title;
        this.issue = issue;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
