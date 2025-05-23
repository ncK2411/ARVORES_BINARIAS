import java.util.LinkedList;
import java.util.Queue;

public class BuscaEmNivel {
    public void buscaEmNivel(No no) {
        if (no == null) {
            return;
        }
        Queue<No> fila = new LinkedList<>();
        fila.add(no);
        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }
            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }
    }
    
}
