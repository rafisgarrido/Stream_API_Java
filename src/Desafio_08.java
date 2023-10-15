/*Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;

public class Desafio_08 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API
        Integer somaList = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        //Imprimindo o resultado
        System.out.println(somaList);
    }
}
