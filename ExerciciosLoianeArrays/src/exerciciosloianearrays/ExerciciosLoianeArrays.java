
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
        
        //#9----------------------------------------------------------------------------
        double [] impostoAPagarRuaA= new double[10];
        double [] impostoAPagarRuaB=new double[10];
        double[] valorPromocionalUnitario= new double[10];
        
        for (int i=0; i<impostoAPagarRuaA.length;i++){
            impostoAPagarRuaA[i]= aleatorio.nextInt(450);
            impostoAPagarRuaB[i]= aleatorio.nextInt(580);
            valorPromocionalUnitario[i] = impostoAPagarRuaA[i]/impostoAPagarRuaB[i];
            
        }
        System.out.println("==============IMPOSTOS A PAGAR RUA A===================");
        System.out.println(Arrays.toString(impostoAPagarRuaA));
        System.out.println("==============================");
        
        System.out.println("===========IMPOSTOS A PAGAR RUA B================");
        System.out.println(Arrays.toString(impostoAPagarRuaB));
        System.out.println("=============================================");
        
        System.out.println("===========VALOR PROMOCIONAL POR RESIDENCIA até DIA 15================");
        System.out.println(Arrays.toString(valorPromocionalUnitario));
        System.out.println("=============================================");
        
        //#10------------------------------------------------------------------------------
        int [] valoresA= new int [10];
        int[] restoPorDois= new int [10];
        
        for (int i=0;i<valoresA.length;i++){
            valoresA[i]= aleatorio.nextInt(200);
            restoPorDois[i] = valoresA[i]%2;
        }
        System.out.println("==============VALORES A===================");
        System.out.println(Arrays.toString(valoresA));
        System.out.println("==============================");
        
        System.out.println("===========RESTO DA DIVISÃO POR 2================");
        System.out.println(Arrays.toString(restoPorDois));
        System.out.println("=============================================");
        
        //#11-----------------------------------------------------------------------------
        int [] valores = new int [10];
        int qtdPares=0;
        for (int i=0; i<valores.length;i++){
            valores[i]= aleatorio.nextInt(50);
        }
        for (int valor: valores){
            if(valor%2==0){
                qtdPares= qtdPares +1;
            }
        }
        System.out.println("A quantidade de números pares no conjunto"+Arrays.toString(valores)+" é de "+qtdPares+" valores.");
        
        //#12-----------------------------------------------------------------------------
        int [] valoresASomar = new int[10];
        int somaDeValores=0;
        
        for(int i =0; i<valoresASomar.length;i++){
            valoresASomar[i]=aleatorio.nextInt(350);
            somaDeValores= somaDeValores + valoresASomar[i];
        }
        System.out.println("A soma dos números no conjunto"+Arrays.toString(valoresASomar)+" é de "+somaDeValores+".");
        
        //#13-----------------------------------------------------------------------------
        int [] valoresMultiplosDeCinco = new int [10];
        int qtdMultiplos=0;
        
        for(int i =0; i<valoresMultiplosDeCinco.length; i++){
            valoresMultiplosDeCinco[i]= aleatorio.nextInt(150);
            if (valoresMultiplosDeCinco[i]%5==0){
                qtdMultiplos= qtdMultiplos + valoresMultiplosDeCinco[i];
            }
        }
        System.out.println("A soma dos números múltiplos de 5 no conjunto"+Arrays.toString(valoresMultiplosDeCinco)+" é de "+qtdMultiplos+".");

        //#14-----------------------------------------------------------------------------
        int [] valoresImpares = new int [10];
        int qtdImpares=0;
        int somatoriaImpares= 0;
        double mediaImpares=0;
        
        for (int i=0; i<valoresImpares.length;i++){
            valoresImpares[i]=aleatorio.nextInt(450);
            if(valoresImpares[i]%2==1){
                qtdImpares= qtdImpares + 1;
                somatoriaImpares= somatoriaImpares +valoresImpares[i];
            }
        }
        mediaImpares = somatoriaImpares/qtdImpares;
        
        System.out.println("A média entre os "+qtdImpares+ " números ímpares do conjunto "+Arrays.toString(valoresImpares)+" é de "+mediaImpares+". A somatória entre eles é de "+somatoriaImpares);
    }
    
}
