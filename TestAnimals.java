public class TestAnimals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Spider("insetus");
        animals[1] = new Cat("UilsKas");
        animals[2] = new Fish("tudo que seja degerativo");

        for (Animal animal : animals) {
            animal.walk();
            animal.eat();

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                pet.play();
            }

            System.out.println();
        }
    }
}