package interview.patterns.bridge;

class BookResource implements Resource {

    // Handler for real resource
    // private Book book;

    @Override
    public String getTitle() {
        return "Book title";
    }

}
