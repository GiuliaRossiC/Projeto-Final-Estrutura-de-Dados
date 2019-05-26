import jogodehanoi.JogoDeHanoi;
import jogodehanoi.Pilha;
import jogodehanoi.PilhaException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class PilhaTeste {
    
    private Pilha zero;
    private Pilha um;
    private Pilha dois;
    private JogoDeHanoi torre1, torre0, torre2;
    private JogoDeHanoi numTorreDestino, numTorreOrigem;

 
        @Before
        public void setup(){
        int tamanho = 4;
        int arr[] = {1,2,3,4};
        int brr[] = {0,0,0,0};
        this.zero = new Pilha(brr);
        this.um = new Pilha(brr);
        this.dois = new Pilha(brr);
    }
        
        @Test
        public void testInserirUmDiscoPilhaZero(){
        boolean inseriu = zero.push(4);
        Assert.assertFalse(zero.isEmpty());
      
    }
    
        @Test
        public void testInserirUmDiscoPilhaUm(){
        boolean inseriu = um.push(4);
        assertFalse(um.isEmpty());
        assertTrue(inseriu);     
}
        @Test
        public void testInserirUmDiscoPilhaDois(){
        boolean inseriu = dois.push(4);
        assertFalse(dois.isEmpty());
        assertTrue(inseriu);       
}
        
        @Test
        public void testInserirPilhaUmCheia(){
        for (int i = 0; i < 4; i++) {
            um.push(i);
        }
        boolean inseriu = um.push(4);
        assertFalse(inseriu);
    }
        
        @Test
        public void testInserirPilhaZeroCheia(){
        for (int i = 0; i < 4; i++) {
            zero.push(i);
        }
        boolean inseriu = zero.push(4);
        assertFalse(inseriu);
    }
        
        @Test
        public void testInserirPilhaDoisCheia(){
        for (int i = 0; i < 4; i++) {
            dois.push(i);
        }
        boolean inseriu = dois.push(4);
        assertFalse(inseriu);
    }
        
       @Test
       public void testProximoDiscoMaior(){
       
       }
       
       
       @Test
       public void testQuatidadeDeJogadas(){
           
       }      
       
        @Test
        public void testRemoverUmDiscoPilhaZero() throws PilhaException{
        zero.push(1);
        int disco = zero.pop();
        Assert.assertEquals(1, disco);
        Assert.assertTrue(zero.isEmpty());
        }
        
        @Test
        public void testRemoverUmDiscoPilhaUm() throws PilhaException{
        um.push(1);
        int disco = um.pop();
        Assert.assertEquals(1, disco);
        Assert.assertTrue(um.isEmpty());
        }
        
        @Test
        public void testRemoverUmDiscoPilhaDois() throws PilhaException{
        dois.push(1);
        int disco = dois.pop();
        Assert.assertEquals(1, disco);
        Assert.assertTrue(dois.isEmpty());
        }
        
        @Test
       public void testTerminoDoJogo(){
           
       }      
        
       @Test
       public void testInserirPilhaZeroDiscos(){
       zero.push(1);
       zero.push(2);
       zero.push(3);
       zero.push(4);
       Assert.assertFalse(zero.isEmpty());
       Assert.assertTrue(zero.checkFull());
       }
}