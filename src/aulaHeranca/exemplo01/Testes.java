package aulaHeranca.exemplo01;

public class Testes {
    public static void main(String[] args) {

        Memorando doc = new Memorando();

        doc.setAnoDocumento(2023);
        doc.setNumDocumento(234);
        doc.setDataDocumento("02/04/2023");
        doc.setAssunto("LPOO");
        doc.setDestinatario("Secretaria");
        doc.setSignatario("Coordenação");

        System.out.println("== MEMORANDO ==" + "\n");
        System.out.println("Assunto: " + doc.getAssunto() + "\n");
        System.out.println("Data: " + doc.getDataDocumento() + "\n");
        System.out.println("Ano do Documento: " + doc.getAnoDocumento() + "\n");
        System.out.println("Número do Documento: " + doc.getNumDocumento() + "\n");
        System.out.println("Destinatário: " + doc.getDestinatario() + "\n");
        System.out.println("Signatário: " + doc.getSignatario());
    }
}
