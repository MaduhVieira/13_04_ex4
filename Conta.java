public class Conta {

    private String numero;
    private Double saldo;
    private int count = 0;

    public Conta (String n, Double s){//igual passar paramentros em c
        setNumero(n);
        setSaldo(s);
        this.count++;
        System.out.println("Objetos criados: "+ count);
    }
    public Conta(){
        this.count++;
        System.out.println("Objetos criados: "+ count);
    }

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }


    void credito(Double ValorCred){
        saldo += ValorCred;
       
    }
    void debito(Double ValorDeb){
        saldo -= ValorDeb;
 
    }

    public void mostraDados(){
        System.out.println("\nNumero da conta: " + numero);
        System.out.println("\nSaldo: "+ saldo);
    }


}
