package interview.patterns.decorator;

class BalloonDecorator implements AddonDecorator {

    private final Postcard postcard;


    BalloonDecorator(Postcard postcard) {
        this.postcard = postcard;
    }


    @Override
    public String draw() {
        return postcard.draw() + " with balloon";
    }

}
