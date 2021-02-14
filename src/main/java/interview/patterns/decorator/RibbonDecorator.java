package interview.patterns.decorator;

class RibbonDecorator implements AddonDecorator {

    private final Postcard postcard;


    RibbonDecorator(Postcard postcard) {
        this.postcard = postcard;
    }


    @Override
    public String draw() {
        return postcard.draw() + " with ribbon";
    }

}
