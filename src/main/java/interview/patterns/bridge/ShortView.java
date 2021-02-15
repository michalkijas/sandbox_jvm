package interview.patterns.bridge;

class ShortView extends View {

    protected ShortView(Resource resource) {
        super(resource);
    }


    @Override
    String show() {
        return "Short view: " + resource.getTitle();
    }

}
