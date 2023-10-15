/*Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_13 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando Stream API
        List<Integer> numerosFiltrados = numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10)
                .collect(Collectors.toList());

        //Imprimir resultado
        System.out.println(numerosFiltrados);
    }
}
