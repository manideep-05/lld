package librarymanagement;

class Book {
    private String title;
    private String author;
    private String bookNumber;
    private boolean isAvailable;

    public Book(String title, String author, String bookNumber) {
        this.title = title;
        this.author = author;
        this.bookNumber = bookNumber;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", bookNumber=" + bookNumber + ", isAvailable="
                + isAvailable + "]";
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}