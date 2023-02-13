package seminar.seminar_oop_2;

public abstract class Herbivores extends Animal{
    public Herbivores(String nickname) {
        super(nickname);
    }
    @Override
    public String feed(){
        return "grass";
    }
}
