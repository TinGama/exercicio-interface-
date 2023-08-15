interface Pet {
    void play();
    void beFriendly();
}

class Cat extends Animal implements Pet {
    private String name;
}