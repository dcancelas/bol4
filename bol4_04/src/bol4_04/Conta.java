package bol4_04;

public class Conta {
    private String nomCliente;
    private String numConta;
    private Double tipoInterese;
    private Double saldo;

    public Conta() {
        
    }
    public Conta(String nomCliente,String numConta,Double tipoInterese,Double saldo) {
        this.nomCliente=nomCliente;
        this.numConta=numConta;
        this.tipoInterese=tipoInterese;
        this.saldo=saldo;
    }
    public void setNom(String nomCliente) {
        this.nomCliente=nomCliente;
    }
    public String getNom() {
        return nomCliente;
    }
    public void setNum(String numConta) {
        this.numConta=numConta;
    }
    public String getNum() {
        return numConta;
    }
    public void setTipo(Double tipoInterese) {
        this.tipoInterese=tipoInterese;
    }
    public Double getTipo() {
        return tipoInterese;
    }
    public void setSaldo(Double saldo) {
        this.saldo=saldo;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void ingreso(Double cantIngreso) {
        if (cantIngreso<0) System.out.println("ERROR");
        if (cantIngreso>=0) {
            saldo=(saldo+cantIngreso);
            System.out.println("Realizouse o ingreso de: "+cantIngreso+"€");
        }
    }
    public void reintegro(Double cantReintegro) {
        if (cantReintegro<0) System.out.println("ERROR");
        if (cantReintegro>=0) {
            saldo=(saldo-cantReintegro);
            System.out.println("Realizouse o reintegro de: "+cantReintegro+"€");
        }
    }
    public void transferencia(Conta contaDestino,Double importe) {
        saldo=(saldo-importe);
        contaDestino.setSaldo((contaDestino.getSaldo())+importe);
        System.out.println("Realizouse a transferencia de "+importe+
        "€ a o número de conta "+(contaDestino.getNum()));
    }

}