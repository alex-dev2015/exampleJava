package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Alex", "Carla", "Davison" };
        Integer[] numeros = {1,2,3,4,5,6};

        printNamesFiltered(nomes);
        printDoubleList(numeros);
        printNumbersPairs(numeros);
        printNumbersOdd(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Gerente de Projetos");
        profissoes.add("Gerente Administrativo");
        profissoes.add("Desenvolvedor backend");
        profissoes.add("Desenvolvedor frontend");
        profissoes.add("Desenvolvedor fullstack");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Desenvolvedor"))
                .forEach(System.out::println);

    }

    public static void printNamesFiltered(String... nomes){
        String namesPrint = Stream.of(nomes)
                .filter(nome -> nome.equals("Alex"))
                .collect(Collectors.joining());

        System.out.println(namesPrint);
    }

    public static void printDoubleList(Integer... numeros){
        for (Integer numero: numeros){
            System.out.println("Números em dobro com for: " + numero * 2);
        }

        Stream.of(numeros).map(numero -> numero * 2)
                          .forEach(System.out::println);
    }

    public static void printNumbersPairs(Integer... numeros){
        for (Integer numero: numeros){
            if (numero % 2 == 0){
                System.out.println("Numeros pares: " + numero);
            }
        }
    }

    public static void printNumbersOdd(Integer... numeros){
        for (Integer numero: numeros){
            if (numero % 2 != 0){
                System.out.println("Números ímpares: " + numero);
            }
        }
    }
}
