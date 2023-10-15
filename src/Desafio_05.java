/*Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio_05 {
    public static void main(String[] args) {
        //Lista de numeros inteiros criado
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API
        OptionalDouble numerosEspecificos = numeros.stream()
                .filter(numero -> numero > 5) //Filtra os numeros maiores que 5
                .mapToDouble(Integer::doubleValue)// converte para um DoubleStream
                .average();//calcula a media

        //Imprimir os resultados
        System.out.println(numerosEspecificos);
    }
}
/*O uso de OptionalDouble é apropriado porque a média dos números maiores que 5 pode não estar disponível se não houver números que atendam à condição.
Usar Optional permite que você lide com isso de maneira mais segura, evitando exceções de ponto flutuante ou outros problemas caso a média não possa ser calculada.*/