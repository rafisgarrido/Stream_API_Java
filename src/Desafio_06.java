/*Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


public class Desafio_06 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API
   Optional<Integer> numerosFiltrados = numeros.stream()
                .filter(numero -> numero > 10)
                .findAny();

        //Imprimindo os valores caso haja
        System.out.println(numerosFiltrados);
    }
}
