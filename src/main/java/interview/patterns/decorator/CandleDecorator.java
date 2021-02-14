package interview.patterns.decorator;

class CandleDecorator implements AddonDecorator {

    private final Postcard postcard;


    CandleDecorator(Postcard postcard) {
        this.postcard = postcard;
    }


    @Override
    public String draw() {
        return postcard.draw() + " with candle";
    }

}
