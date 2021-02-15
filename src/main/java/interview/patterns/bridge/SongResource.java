package interview.patterns.bridge;

class SongResource implements Resource {

    // Handler for real resource
    // private Song song;

    @Override
    public String getTitle() {
        return "Song title";
    }

}
