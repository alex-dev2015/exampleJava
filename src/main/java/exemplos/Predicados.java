package exemplos;

import java.util.function.Predicate;
import java.util.function.Consumer;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("alex"));

    }
}
