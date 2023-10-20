package br.com.carstore.model;

public class Car {
    private String name;
    private String id;

    public Car(String name){
        this.name = name;
    }
    public Car(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getId() {
        return id;
    }

}
