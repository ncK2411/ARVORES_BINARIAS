public class Contador {
    public int ContarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + ContarNos(no.esquerda) + ContarNos(no.direita);
    }
}