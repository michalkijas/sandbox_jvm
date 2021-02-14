package interview.patterns.decorator;

class BirthdayPostcard implements Postcard {

    @Override
    public String draw() {
        return "Birthday card";
    }

}
