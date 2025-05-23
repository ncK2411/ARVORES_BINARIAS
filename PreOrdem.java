public class PreOrdem {
   public void preOrdem(No no) {
      if (no != null) {
         System.out.print(no.valor + " ");
         preOrdem(no.esquerda);
         preOrdem(no.direita);
      }
   }
}