public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
        Zebra a = new Zebra();
        a.sayHi();
        a.makeSound();
        a.jump();
        Girraffe b = new Girraffe();
        b.sayHi();
        b.makeSound();
        b.jump();
    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}