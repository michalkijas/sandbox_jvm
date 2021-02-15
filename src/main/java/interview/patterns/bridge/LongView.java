package interview.patterns.bridge;

class LongView extends View {

    protected LongView(Resource resource) {
        super(resource);
    }

    @Override
    String show() {
        return "Long view: " + resource.getTitle();
    }

}
