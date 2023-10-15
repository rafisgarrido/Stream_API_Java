
/*Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Desafio_02 {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API para a soma dos numeros pares
        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == -0)//Filtra os numeros pares
                .mapToInt(Integer :: intValue)//Converte para um IntStream
                .sum(); //Soma os numeros
        System.out.println(somaPares);
        }

    }

