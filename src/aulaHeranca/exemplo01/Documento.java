package aulaHeranca.exemplo01;

public class Documento {
    private int numeroDePaginas, numDocumento, anoDocumento;
    private String dataDocumento;

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    protected void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumDocumento() {
        return numDocumento;
    }
    public void setNumDocumento(int numDocumento){
        this.numDocumento = numDocumento;
    }

    public int getAnoDocumento() {
        return anoDocumento;
    }
    public void setAnoDocumento(int anoDocumento){
        this.anoDocumento = anoDocumento;
    }
    public String getDataDocumento(){
        return dataDocumento;
    }
    public void setDataDocumento(String dataDocumento) {
        this.dataDocumento = dataDocumento;
    }
}
