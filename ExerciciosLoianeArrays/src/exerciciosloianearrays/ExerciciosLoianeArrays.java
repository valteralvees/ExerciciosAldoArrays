
package exerciciosloianearrays;
//Imports
import java.util.Arrays;
import java.util.Random;


public class ExerciciosLoianeArrays {
    public static void main(String[] args) {
        
        //#1------------------------------------------------------------------------------------------
        System.out.println("#1");
        // TODO code application logic here
        int [] idades = {15,17,18,19,24};
        int [] copiaIdades= new int[5];
        
        for(int i=0; i<5;i++){
            copiaIdades[i] = idades[i];
        }
        System.out.println("==============IDADES================");
        System.out.println(Arrays.toString(idades));
        System.out.println("=====================================");
        
        System.out.println("=========CÓPIA IDADES================");
        System.out.println(Arrays.toString(copiaIdades));
        System.out.println("=====================================");
        
        //#2-------------------------------------------------------------------------------------------
        System.out.println("#2");
        int [] depositos = {256,878,9754,2676,232,123,45655,2323};
        int [] depositosMultiplicados = new int[8];
        for (int i=0;i<depositos.length; i++){
            depositosMultiplicados[i] = depositos[i]*2;
        }
        System.out.println("==============DEPÓSITOS================");
        System.out.println(Arrays.toString(depositos));
        System.out.println("=====================================");
        
        System.out.println("===========DEPOSITOS x2================");
        System.out.println(Arrays.toString(depositosMultiplicados));
        System.out.println("=====================================");
        
        //#3------------------------------------------------------------------------------------------
        Random aleatorio = new Random();
        System.out.println("#3");
        int [] saques = new int[14];
        int [] saquesAoQuadrado = new int[14];
        
        for (int i=0; i<saques.length;i++){
            saques[i]= aleatorio.nextInt(2000);
            saquesAoQuadrado[i]= saques[i]* saques[i];
        }
        System.out.println("==============SAQUES===================");
        System.out.println(Arrays.toString(saques));
        System.out.println("==============================");
        
        System.out.println("===========SAQUES AO QUADRADO================");
        System.out.println(Arrays.toString(saquesAoQuadrado));
        System.out.println("=============================================");
        
        //#4-----------------------------------------------------------------------------------------
        double [] cobrancas = new double[15];
        double [] cobrancasRaiz = new double[15];
        
        for (int i=0; i<cobrancas.length; i++){
            cobrancas[i]= aleatorio.nextInt(3500);
            cobrancasRaiz[i]= (double)Math.sqrt(cobrancas[i]);
        }
        System.out.println("==============COBRANCAS===================");
        System.out.println(Arrays.toString(cobrancas));
        System.out.println("==============================");
        
        System.out.println("===========RAIZ QUADRADA DAS COBRANCAS================");
        System.out.println(Arrays.toString(cobrancasRaiz));
        System.out.println("=============================================");
    }
    
}
