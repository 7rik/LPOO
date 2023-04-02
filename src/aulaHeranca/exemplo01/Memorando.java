package aulaHeranca.exemplo01;

public class Memorando extends Documento {
    private String assunto, destinatario, signatario;

    public String getAssunto(){
        return assunto;
    }
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
    public String getDestinatario(){
        return destinatario;
    }
    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }
    public String getSignatario(){
        return signatario;
    }
    public void setSignatario(String signatario){
        this.signatario = signatario;
    }
}
