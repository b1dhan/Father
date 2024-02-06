package models;

public class Father extends GrandFather{
    String caste;

    public Father(String caste) {
        this.caste = caste;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayBye(){
        System.out.println("Bye!");
    }
}
