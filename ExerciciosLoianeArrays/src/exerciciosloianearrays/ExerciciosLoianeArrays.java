
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
        
        //#5---------------------------------------------------------------------------------------
        double [] alugueis = new double[15];
        double [] alugueisPosAumento = new double[15];
        
        for (int i=0; i<alugueis.length; i++){
            alugueis[i]= aleatorio.nextInt(5500);
            alugueisPosAumento[i]= alugueis[i]* i; 
        }
        System.out.println("==============ALUGUEIS ATUAL===================");
        System.out.println(Arrays.toString(alugueis));
        System.out.println("==============================");
        
        System.out.println("===========ALUGUEIS PÓS AUMENTO================");
        System.out.println(Arrays.toString(alugueisPosAumento));
        System.out.println("=============================================");
        
        //#6--------------------------------------------------------------------------------------
        double [] valorUnitarioGrupoA = new double[10];
        double [] valorUnitarioGrupoB = new double[10];
        double [] gruposSomados = new double[10];
        
        for (int i=0; i<valorUnitarioGrupoA.length; i++){
            valorUnitarioGrupoA[i] = aleatorio.nextInt(45);
            valorUnitarioGrupoB[i]= aleatorio.nextInt(65);
            gruposSomados[i] = valorUnitarioGrupoA[i] + valorUnitarioGrupoB[i];
        }
        System.out.println("==============VALOR UNITARIO GRUPO A===================");
        System.out.println(Arrays.toString(valorUnitarioGrupoA));
        System.out.println("==============================");
        
        System.out.println("===========VALOR UNITARIO GRUPO B================");
        System.out.println(Arrays.toString(valorUnitarioGrupoB));
        System.out.println("=============================================");
        
        System.out.println("=========== UNIAO DOS GRUPOS================");
        System.out.println(Arrays.toString(gruposSomados));
        System.out.println("=============================================");
        
        //#7------------------------------------------------------------------------------------
        double [] valoresFiados= new double[10];
        double [] totaisPagos = new double[10];
        double [] valorDivida = new double[10];
        
        for(int i=0; i<valoresFiados.length;i++){
            valoresFiados[i]= aleatorio.nextInt(250);
            totaisPagos[i] = aleatorio.nextInt(200);
            valorDivida[i]= valoresFiados[i]-totaisPagos[i];
            
        }
        System.out.println("==============VALORES FIADOS===================");
        System.out.println(Arrays.toString(valoresFiados));
        System.out.println("==============================");
        
        System.out.println("===========VALORES PAGOS================");
        System.out.println(Arrays.toString(totaisPagos));
        System.out.println("=============================================");
        
        System.out.println("===========SITUAÇÕES DE DIVIDA================");
        System.out.println(Arrays.toString(valorDivida));
        System.out.println("=============================================");
        
        //#8----------------------------------------------------------------------------------------
        int [] mensalidadesJunho= new int[10];
        int [] mensalidadesJulho= new int[10];
        int [] totalComJuros= new int[10];
        
        for (int i=0; i<mensalidadesJunho.length;i++){
            mensalidadesJunho[i] = aleatorio.nextInt(5750);
            mensalidadesJulho[i]= aleatorio.nextInt(5750);
            totalComJuros[i]= mensalidadesJunho[i]*mensalidadesJulho[i];
        }
        System.out.println("==============VALORES JUNHO===================");
        System.out.println(Arrays.toString(mensalidadesJunho));
        System.out.println("==============================");
        
        System.out.println("===========VALORES JULHO================");
        System.out.println(Arrays.toString(mensalidadesJulho));
        System.out.println("=============================================");
        
        System.out.println("===========TOTAL DIVIDAS================");
        System.out.println(Arrays.toString(totalComJuros));
        System.out.println("=============================================");
            
        
        
        
    }
    
}
