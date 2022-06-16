
package exerciciosloianearrays;
//Imports
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


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
        
        //#15-------------------------------------------------------------------------------
        int [] vetorPercentual = new int[10];
        int qtdNumPares=0;
        int qtdNumImpares=0;
        
        for(int i=0;i<vetorPercentual.length;i++){
            vetorPercentual[i]=aleatorio.nextInt(60);
            if(vetorPercentual[i]%2==0){
                qtdNumPares= qtdNumPares+1;
            
            }else if(vetorPercentual[i]%2==1){
                qtdNumImpares = qtdNumImpares+1;
            }
        }
        System.out.println("O número de valores IMPARES equivale a "+qtdNumImpares+"0% do total de elementos do conjunto. Já os números pares equivalem a "+qtdNumPares+"0% do total de 10 elementos.");
        
        //#16------------------------------------------------------------------------------
        int [] qtdAlunosNasSalas= new int[10];
        double menor15=0;
        double igual15=0;
        double qtdMaior15=0;
        double maior15=0;
        for(int i =0; i<qtdAlunosNasSalas.length;i++){
            qtdAlunosNasSalas[i]= aleatorio.nextInt(250);
            if(qtdAlunosNasSalas[i]<15){
                menor15 = menor15+qtdAlunosNasSalas[i];
            }else if(qtdAlunosNasSalas[i]>15){
                qtdMaior15= qtdMaior15+ 1;
                maior15= maior15+qtdAlunosNasSalas[i];
            } else if(qtdAlunosNasSalas[i]==15){
                igual15= igual15+1;
            }
        }
        double mediaMaior15 =maior15/qtdMaior15;
        System.out.println("==================================");
        System.out.println(Arrays.toString(qtdAlunosNasSalas));
        System.out.println("==================================");
        System.out.println("A soma dos elementos inferiores a 15 é de "+menor15+". A quantidade de elementos iguais a 15 nesse vetor é de "+igual15+". Já a média dos "+qtdMaior15+" elementos maiores que 15 é "+mediaMaior15);
        
        //#17-----------------------------------------------------------------------------
        int[] idadesGalera= new int[10];
        int superior35=0;
        for(int i=0; i<idadesGalera.length;i++){
            idadesGalera[i]= aleatorio.nextInt(85);
            if(idadesGalera[i]>35){
                superior35= superior35 +1;
            }
        }
        System.out.println("O número de pessoas maiores que 35 anos é de "+superior35);
        
        //#18-----------------------------------------------------------------------------
        int [] idadesPessoal = new int[10];
        int testeMaior=0;
        int testeMenor=100;
        int guardaMaior=0;
        int guardaMenor=0;
        int posicaoMaior=0;
        int posicaoMenor=0;
        for (int i=0; i<idadesPessoal.length; i++){
            idadesPessoal[i] = aleatorio.nextInt(85);
            int guardaValor= idadesPessoal[i];
            if(idadesPessoal[i]> guardaMaior){
                guardaMaior= idadesPessoal[i];
                posicaoMaior=i;
            } else if(idadesPessoal[i]<testeMenor){
                testeMenor= idadesPessoal[i];
                posicaoMenor=i;
            }
        }
        System.out.println("==================================");
        System.out.println(Arrays.toString(idadesPessoal));
        System.out.println("==================================");
        System.out.println("A maior das idades do conjunto é a de "+guardaMaior+" anos, que está na posição "+posicaoMaior+". Já a menor idade é a de "+testeMenor+" anos, que está localizada na posição "+posicaoMenor+" do conjunto.");
        
        //#19------------------------------------------------------------------------------
        /*
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        float [] result = new float[10];
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<nota1.length;i++){
            System.out.println("Digite a 1a nota do aluno "+(i+1));
            nota1[i]= teclado.nextFloat();
            System.out.println("Digite a 2a nota do aluno "+(i+1));
            nota2[i]= teclado.nextFloat();
            result[i]= (nota1[i]+nota2[i])/2;
        }
        for (int i=0; i<nota1.length;i++){
            if (result[i]<7){
                System.out.println("Aluno "+(i+1)+" REPROVADO, pois obteve média "+ result[i]);
            } else {
                System.out.println("Aluno "+(i+1)+" APROVADO, pois obteve média "+ result[i]);
            }
        }
        */
        //#20 e #21-----------------------------------------------------------------------------
        double [] dolares = new double[20];
        double real = 4.87;
        for (int i=0; i<dolares.length;i++){
            dolares[i]= i * real;
            System.out.println("US$"+(i)+" dólar(es) equivale a R$"+ dolares[i]+ " reais.");
        }
        
        //#22-----------------------------------------------------------------------------
        int [] numerais = new int[10];
        int conta0=0;
        int conta1=0;
        
        for (int i=0; i<numerais.length;i++){
            numerais[i]= aleatorio.nextInt(2);
            if(numerais[i]==0){
                conta0=conta0+1;
            } else if(numerais[i]==1){
                conta1=conta1+1;
            }
        }
        System.out.println(Arrays.toString(numerais));
        System.out.println("O array acima tem o percentual de "+conta0+"0% de números 0 e "+conta1+"0% de números 1");
        
        //#23-----------------------------------------------------------------------------
        int [] soPares= new int[10];
        for (int i=0; i<soPares.length;i++){
            soPares[i]= aleatorio.nextInt(11);
            if(soPares[i]%2==1){
                System.out.println("NÚMERO ÍMPAR DETECTADO...");
                break;
            }
            
        }
        System.out.println(Arrays.toString(soPares));
        System.out.println("LOOP ENCERRADO");
        
        //#24----------------------------------------------------------------------------
        int [] numPalindromos = new int[11];
        for (int i=0; i<numPalindromos.length;i++){
            numPalindromos[i]= aleatorio.nextInt(10);
            
        }
        if(numPalindromos[0]==numPalindromos[10]){
                System.out.println("PRIMEIRA DUPLA IGUAL");
            } else if(numPalindromos[1]==numPalindromos[9]){
                System.out.println("SEGUNDA DUPLA IGUAL");
            }else if(numPalindromos[2]==numPalindromos[8]){
                System.out.println("TERCEIRA DUPLA IGUAL");
            }else if(numPalindromos[3]==numPalindromos[7]){
                System.out.println("QUARTA DUPLA IGUAL");
            }else if(numPalindromos[4]==numPalindromos[6]){
                System.out.println("QUINTA DUPLA IGUAL");
                System.out.println("NÚMERO PALÍNDROMO");
            }
        System.out.println(Arrays.toString(numPalindromos));
        
        //#25--------------------------------------------------------------------------
        int [] vetorA = new int[10];
        int[] vetorB = new int[10];
        for (int i=0; i<vetorA.length;i++){
            vetorA[i]=aleatorio.nextInt(10);
            if(vetorA[i]%2==0){
                vetorB[i]=1;
            }else if(vetorA[i]%2==1){
                vetorB[i]=0;
            }
        }
        System.out.println("======================25=========================");
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
        
        //#26-------------------------------------------------------------------------
        int [] arrayA = new int[10];
        int [] arrayB = new int[10];
        
        float [] arrayC = new float[10];
        
        for (int i=0; i<arrayA.length; i++){
            arrayA[i]= aleatorio.nextInt(15);
            arrayB[i]= aleatorio.nextInt(15);
            if(arrayA[i]<arrayB[i]){
                arrayC[i]= -1;
            } else if(arrayA[i]>arrayB[i]){
                arrayC[i]= 1;
            } else if(arrayA[i]==arrayB[i]){
                arrayC[i]=0;
            }
        }
        System.out.println("=====================26================");
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
        System.out.println("============================================");
        
        //#27------------------------------------------------------------------------
        int [] array1 = new int[10];
        char [] letras = new char[10];
        
        for (int i=0; i<array1.length;i++){
            array1[i]= aleatorio.nextInt(15);
            if(array1[i]<7){
                letras[i]= 'a';
            } else if(array1[i]==7){
                letras[i]='b';
            } else if(array1[i]>7 && array1[i]<10){
                letras[i]='c';
            } else if(array1[i]==10){
                letras[i]='d';
            } else if(array1[i]>10){
                letras[i]='e';
            }
        }
        System.out.println("========================27====================");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(letras));
        System.out.println("==============================================");
        
        //#28---------------------------------------------------------------
        int [] vetorzinhoA = new int[10];
        int [] vetorzinhoB = new int[10];
        int teste1=0;
        
        for (int i=0; i<vetorzinhoA.length;i++){
            vetorzinhoA[i]= aleatorio.nextInt(14);
            System.out.println("!!!!!!!!!!!!!!!!!!!");
            int j=10;
            j--;
            System.out.println(j);
            
            
        }
        
        System.out.println("===================28==================");
        System.out.println(Arrays.toString(vetorzinhoA));
        System.out.println(Arrays.toString(vetorzinhoB));
        System.out.println("=======================================");
        
        //#29--------------------------------------------------------------
        int [] valoresA1 = new int [10];
        int [] valoresB1 = new int [10];
        int [] juncaoAB = new int[20];
        for(int i =0; i< valoresA1.length;i++){
            valoresA1[i] = aleatorio.nextInt(10);
            valoresB1[i] = aleatorio.nextInt(10);
        }
        
        for (int i=0; i<juncaoAB.length;i++){
            if(i<10){
                juncaoAB[i]= valoresA1[i];   
            }else if(i>9){
                juncaoAB[i] = valoresB1[i]; 
            } 
              
        }
        
        System.out.println("=================29=======================");
        System.out.println(Arrays.toString(valoresA1));
        System.out.println(Arrays.toString(valoresB1));
        System.out.println(Arrays.toString(juncaoAB));
        System.out.println("==========================================");
        
        
    }
    
}
