import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.*/
public class Desafio_04 {
    public static void main(String[] args) {
        //Lista de numeros inteiros fornecidas
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Usando a Stream API para verificar se os numeros sao impares
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

     /*O método forEach não retorna um valor ou uma lista; ele é usado para executar uma ação em cada elemento da stream, mas não deve ser usado no final da sequência encadeada da Stream API quando você deseja coletar os resultados. */
        numerosPares.forEach(System.out::println);
   }
}
