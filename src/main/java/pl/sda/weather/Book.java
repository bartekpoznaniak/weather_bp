package pl.sda.weather;

public class Book {
   private String title;

    public String getTitle() {
        return title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    private int noOfPages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public Book(String title, int noOfPages) {
        this.title = title;
        this.noOfPages = noOfPages;
    }
}
