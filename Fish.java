
class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super(0); 
        this.name = name;
    }

    public Fish() {
        this(""); 
    }

    @Override
    void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    void walk() {
        System.out.println("Fish cannot walk.");
    }

    @Override
    public void play() {
        System.out.println("Fish is playing.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Fish is being friendly.");
    }
}
