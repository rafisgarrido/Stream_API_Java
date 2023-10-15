/*Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio_09 {
    public static void main(String[] args) {
    //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando Stream API
        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        //Imprimindo os valores
        System.out.println(numerosDistintos);
    }
}
