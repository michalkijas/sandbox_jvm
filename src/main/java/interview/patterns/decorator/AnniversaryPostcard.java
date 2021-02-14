package interview.patterns.decorator;

class AnniversaryPostcard implements Postcard {

    @Override
    public String draw() {
        return "Anniversary card";
    }

}
