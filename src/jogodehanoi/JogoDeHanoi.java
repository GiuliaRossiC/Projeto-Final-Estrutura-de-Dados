
package jogodehanoi;

import java.util.Arrays;
public class JogoDeHanoi {
    private Pilha [] torres;
    private int jogadas;
    
    public JogoDeHanoi(int[] discos){
        jogadas = 0;
        this.torres = new Pilha[3];
        
        this.torres[0] = new Pilha(discos);
        this.torres[1] = new Pilha(new int[] {0,0,0,0});
        this.torres[2] = new Pilha(new int[] {0,0,0,0});
    }
    public boolean fazerJogada(int numTorreOrigem, int numTorreDestino) throws PilhaException
    {
        if (numTorreOrigem < 0 || numTorreOrigem > 2){
            return false;
        }
        
        if(numTorreDestino < 0 || numTorreDestino >2){
            return false;
        }
        if (this.torres[numTorreOrigem].isEmpty()) {
            return false;
        }
        int topoOrigem = this.torres[numTorreOrigem].getTopo();

        if (this.torres[numTorreDestino].isEmpty()) {
            this.torres[numTorreOrigem].pop();
            this.torres[numTorreDestino].push(topoOrigem);
            this.jogadas++;
            return true;
        }
        int topoDestino =  this.torres[numTorreDestino].getTopo();
        if (topoOrigem < topoDestino) {
            this.torres[numTorreOrigem].pop();
            this.torres[numTorreDestino].push(topoOrigem);
            this.jogadas++;
            return true;
        }
        return false;
    }
        int GetTorreSize(int choice){
        return this.torres[choice].getSize();
    }
    
    boolean jogoCompletado() throws PilhaException{
        return this.torres[2].checkFull();
    }
    
    public void printTorre(){
        for(int i =0; i<3;i++){
            torres[i].printPilha();
        }
    }
}
