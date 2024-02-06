import models.Child;
import models.Father;
import models.GrandFather;

public class Main {
    public static void main(String[] args) {
        Father dad = new Father("Chhetri");
        GrandFather grandpa = new GrandFather();
        Child kid = new Child("Ram","Rai");

        kid.saySomething();
    }
}
