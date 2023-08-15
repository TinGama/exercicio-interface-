class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); 
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
