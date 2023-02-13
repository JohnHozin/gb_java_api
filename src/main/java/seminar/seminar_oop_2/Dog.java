package seminar.seminar_oop_2;


public class Dog extends Predator implements Runnable {
    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I am Dog" + super.toString() + " and my speed is " + speedOfRun();
    }

    @Override
    public String say(){
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }
}
