package entities;

public class PessoaJuridica extends Contribuinte {
    private int funcionarios;

    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public  Double calcImposto(){
        double impostos;
        if(getFuncionarios() > 10){
            impostos = getRenda()*14/100;
        }else{
            impostos = getRenda()*16/100;
        }
        return impostos;
    }
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", calcImposto());
    }
}
