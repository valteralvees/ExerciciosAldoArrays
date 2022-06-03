package exerciciosaldoarrays1;
import java.util.Scanner;
import java.util.Arrays;
public class ExerciciosAldoArrays1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int[]idades = new int [5];
        for(int idade: idades){
            System.out.println("Digite a idade que você deseja inserir:");
            int i = 0;
            idades[i]= teclado.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(idades));
        
    }
    
}
