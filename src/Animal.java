public abstract class Animal {
    private int numLegs =2;
    public abstract void makeSound();
    public abstract void jump();
    public void move(){

    }

    public int getNumLegs(){
        return numLegs;
    }
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void sayHi(){
        System.out.println("Hi");
    }
}
