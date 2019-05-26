
package jogodehanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMainJogo {
    
    public static void main(String[] args) throws PilhaException, IOException {
        
        System.out.println("======================= Jogo de Hanoi ===========================");
        System.out.println("Seu objetivo é deslocar todos os discos para a ultima pilha.");
        System.out.println("Considere que cada pilha é uma torre e que os números representam o tamanho do disco");
        System.out.println("Regras: Você pode mover apenas um disco de cada vez sendo que o maior disco nunca pode ficar em cima de um disco menor");

        int TAM = 4;
        int[] qtd_discos = new int[TAM];
        for(int i = 0; i < TAM; i++){
            qtd_discos[i] = TAM-i;
        }
        
        JogoDeHanoi jogo = new JogoDeHanoi(qtd_discos);
        
        // objetivo: passar todos os discos para a 3º torre    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (!jogo.jogoCompletado()){
            
            jogo.printTorre();
            System.out.println("\nPara jogar na primeira pilha digite 0");
            System.out.println("para jogar na segunda pilha digite 1");
            System.out.println("para jogar na terceira pilha digite 2");
            System.out.println("\nFaça sua jogada no formato (origem destino) utilizando números:");
            
            String  lines = br.readLine();    

            String[] strs = lines.trim().split("\\s+");
            int[] jogadas = new int[2];
        
            for (int i = 0; i < strs.length; i++) {
                jogadas[i] = Integer.parseInt(strs[i]);
            }
            System.out.printf("Fazendo jogada de %s para %s:\n", jogadas[0], jogadas[1]);
            
            boolean result = jogo.fazerJogada(jogadas[0], jogadas[1]);
            
            if (result){
                System.out.println("\nJogada feita com sucesso!\n");
            }
            else{
                System.out.println("\nJogada ilegal.\n");
            }
            
        }
        
    }
}
