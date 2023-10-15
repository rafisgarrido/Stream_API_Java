/* Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;

public class Desafio_03 {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API para verificar se os numeros sao positivos
     numeros.stream()
                .filter(numero -> numero > 0)//Filtra os numeros positivos
                .forEach(System.out :: println);//Percorrer todo o array e imprimir apenas os que atendem a condiçao

    }

}
