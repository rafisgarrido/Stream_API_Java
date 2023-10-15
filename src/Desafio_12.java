/*Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;

public class Desafio_12 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
       //Usando a Stream API
        Integer produtoLista = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        //Imprimir resultado
        System.out.println(produtoLista);
    }
}
