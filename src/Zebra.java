public class Zebra extends Animal{

    public Zebra(){
        numLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("I neigh");
    }
    @Override
    public void jump() {
        System.out.println("I jump 2 feet");
    }

    @Override
    public void sayHi() {
        super.sayHi();
    }
}