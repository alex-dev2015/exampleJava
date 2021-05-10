package exemplos;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = () -> new Pessoa();

        System.out.println(supplier.get());
    }
}

class Pessoa {
    private String  name;
    private Integer age;

    public Pessoa(){
        name = "Alex";
        age  = 33;
    }

    @Override
    public String toString(){
        return String.format("name : %s, age: %d", name, age);
    }
}
