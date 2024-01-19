package software.ulpgc.kata2;

import java.util.Objects;

public class Person {
    private final int id;
    private final double altura;
    private final double peso;

    public Person(int id, double altura, double peso) {
        this.id = id;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    @Override
    public boolean equals(Object o){
        return o != null && getClass() == o.getClass() && (this == o || equals((Person) o));
    }

    public boolean equals(Person person){
        return id== person.id && person.altura == altura && person.peso== peso;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, altura, peso);
    }

    @Override
    public String toString(){
        return "Person{"+
                "id = " + id +
                ", peso = " + peso +
                ", altura = "+ altura +
                "}";
    }
}
