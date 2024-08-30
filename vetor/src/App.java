import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    // Declarando um array Unidimessionado
        int[] meu_array = new int[5];

        // Iniciando os Valores por acesso rapido
     
        //  Na posição 0 estou guardando o elemento 10
        meu_array[0] = 10;
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;

        // recuperar os elementos da array por acesso rapido
      int element0 = meu_array[0];
      int element1 = meu_array[1];  
    
     System.out.println(element0);
     System.out.println(element1);
     for(int i = 0; i < meu_array.length; i++) {
        System.out.println("Elemento "+ i + " " + meu_array[1]);
     }
        // Array (ou vetor) do tipo texto
        String[] lista_aluno = new String[10];



        lista_aluno[0]="João";
        lista_aluno[1]="Vanessa";
        lista_aluno[2]="Davi";
        lista_aluno[3]="Lucas";
        lista_aluno[4]="Igor";

        String[] lista_cidades = {"Poá", "Itaim Paulista", "Suzano","itu"};

        System.out.println(lista_cidades[2]);

        for (int i = 0; i<lista_aluno.length;i++){
            System.out.println("Elemento "+i+ ":"+lista_aluno[i]);
        }

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        int[] copia = array.clone();
        String[] copia_cidade = lista_cidades;

        System.out.println("Copia "+ Arrays.toString(copia));
        System.out.println("Copia "+ Arrays.toString(copia_cidade));
 
        int[] copia_sel = Arrays.copyOf(copia, element1);

        System.out.println("copia "+ Arrays.toString(copia_sel));
        int[] nova_array = {5,6,4,2,3,1,0};
        Arrays.sort(nova_array);
        
        System.out.println("Ordenada em: "+ Arrays.toString(nova_array));

        int[] array_vazia = new int[5];
        Arrays.fill(array_vazia, 10);

        System.out.println(":"+ Arrays.toString(array_vazia));
        
        // Verificarser as Arrays são iguais
        boolean resp = Arrays.equals(lista_cidades,copia_cidade);

        System.out.println("São Iguais: "+resp);
        
        if(Arrays.equals(lista_cidades,copia_cidade)){
            System.out.println("elas são Iguais");
        }else{
            System.out.println("Elas São Diferentes");

        }

        int posição = Arrays.binarySearch(lista_cidades, "itu");
        System.out.println("esta na possição: "+posição);
    }  
   
   

}