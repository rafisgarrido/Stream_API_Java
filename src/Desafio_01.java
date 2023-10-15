import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
/* Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console. */

public class Desafio_01 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API para ordenar a lista em ordem crescente
        List<Integer> numerosOrdenados = numeros.stream()
                .distinct() //Remove duplicatas, caso seja necessario
                .sorted() //Ordena em ordem crescente
                .collect(Collectors.toList());

        //Exibe a lista ordenada no console
        numerosOrdenados.forEach(System.out::println);

    }
}
