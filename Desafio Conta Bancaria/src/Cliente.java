public class Cliente {
    private String nome;
    private String tipoDeConta;
    private double saldoInicial;

    public Cliente(String nome,  String tipoDeConta, double saldoInicial){
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.saldoInicial = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    

}
