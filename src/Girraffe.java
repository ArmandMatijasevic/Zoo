public class Girraffe extends Animal{
    public Girraffe(){
        numLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("I hum");
    }
    @Override
    public void jump() {
        System.out.println("I jump 1 foot");
    }
    @Override
    public void sayHi() {
        super.sayHi();
    }
}
