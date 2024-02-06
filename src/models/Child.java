package models;

public class Child extends  Father{
    String name;

    public Child(String name, String caste) {
        super("Bahun");
        this.name = name;
    }

    public void saySomething(){
        System.out.println("My name is Ram "+ this.caste);
    }
}
