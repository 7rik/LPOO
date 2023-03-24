package aulaEncapsulamento;

public class Memorando {
    private String assunto, destinatario, signatario;

    public Memorando(){

    }

    public Memorando(String assunto, String destinatario, String signatario){
        this.assunto = assunto;
        this.destinatario = destinatario;
        this.signatario = signatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String novoAssunto) {
        assunto = novoAssunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String novoDestinatario) {
       destinatario = novoDestinatario;
    }

    public String getSignatario() {
        return signatario;
    }

    public void setSignatario(String novoSignatario) {
        signatario = novoSignatario;
    }
}

