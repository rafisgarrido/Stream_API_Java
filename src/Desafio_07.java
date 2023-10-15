/*Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio_07 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando Stream API
        Optional<Integer> segundoMaior = numeros.stream()
                .sorted((a, b) -> Integer.compare(b, a)) // Ordena a lista em ordem descrescente
                .skip(1) // Pula o primeiro elemento que seria o maior
                .findFirst();//Encontra o primeiro apos pular

        //Imprimir o valor
        System.out.println(segundoMaior);

    }
}
