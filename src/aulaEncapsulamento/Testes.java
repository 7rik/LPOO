package aulaEncapsulamento;

public class Testes {
    public static void main(String[] args) {

        Memorando meuMemorando = new Memorando();

        meuMemorando.setAssunto("Estudo de LPOO");
        meuMemorando.setDestinatario("Secretaria");
        meuMemorando.setSignatario("Chefia");

        System.out.println("== MEMORANDO ==");
        System.out.println("Assunto: " + meuMemorando.getAssunto());
        System.out.println("Destinatário: " + meuMemorando.getDestinatario());
        System.out.println("Signatário: " + meuMemorando.getSignatario());

    }
}
