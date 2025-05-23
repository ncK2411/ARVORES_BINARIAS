import java.util.Stack;

public class EmOrdemITERA {
    public void emOrdem(No no) {
        if (no == null) {
            return;
        }
        
        Stack<No> stack = new Stack<>();
        No atual = no;
        
        while (atual != null || !stack.isEmpty()) {
            while (atual != null) {
                stack.push(atual);
                atual = atual.esquerda;
            }
            
            atual = stack.pop();
            System.out.print(atual.valor + " ");
            atual = atual.direita;
        }
    }
}
