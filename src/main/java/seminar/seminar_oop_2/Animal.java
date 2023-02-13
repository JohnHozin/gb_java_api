package seminar.seminar_oop_2;

public abstract class Animal implements Sayable{
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return ", My nickname is " + nickname;
    }
}
