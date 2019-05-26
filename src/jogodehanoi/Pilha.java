/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodehanoi;

/**
 *
 * @author 55219
 */
public class Pilha {
    private int[] dados;
    private int topo;
    
   public Pilha(int tam[]){
        dados = tam;
        
        if (isEmpty()){
            topo = -1;
        }
        else{
            topo = tam.length-1;
        }
   }
    
    public boolean isEmpty() {
        for(int i =0; i<dados.length;i++){
            if (dados[i] > 0){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean push(int valor) {
        if (topo == dados.length-1){
            return false;
        }
        if (isEmpty()){
            dados[0] = valor;
            topo ++;
            return true;
        }
        topo++;
        dados[topo] = valor;
        
        return true;
    }
        public int getTopo(){
        if (isEmpty()){
            return 0;
        }
        return dados[topo];
        }
    
    public int pop() throws PilhaException{
        if(isEmpty())
            return 0;
        
        int aux = dados[topo];
        dados[topo] = 0;
        topo--;
        return aux;
    }
    
    public int getSize(){
        return topo;
    }
    
        public void printPilha(){
       for (int i=0;i<dados.length;i++){
           System.out.printf("%s ", dados[i]);
       }
       System.out.print("\n");
    }
    
    public boolean checkFull(){
        for(int i = 0;i<dados.length;i++){
            if(dados[i] <= 0){
                return false;
            }
        }
        return true;
    }
}