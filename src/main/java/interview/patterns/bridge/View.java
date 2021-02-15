package interview.patterns.bridge;

abstract class View {

    protected final Resource resource;


    protected View(Resource resource) {
        this.resource = resource;
    }

    abstract String show();

}
