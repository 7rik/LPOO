package aulaEncapsulamento;

public class ex_01 {
        private double saldo;

        public void Depositar (double valor) {
            saldo += valor;
            DescontarTaxaOperacao();
        }
        public void Sacar(double valor){
            saldo -= valor;
            DescontarTaxaOperacao();
        }
        private void DescontarTaxaOperacao(){
            saldo = saldo - saldo * 0.1;
     }
    }

