package entities;

public class PessoaFisica extends Contribuinte{
    private double gastosSaude;

    public PessoaFisica(){
        super();
    }
    public PessoaFisica(String nome, double renda, double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public  Double calcImposto(){
        double impostos = 0.0;
        if(getRenda() < 20000.00){
            impostos = getRenda()*15/100;
            if(getGastosSaude() > 0.0){
                impostos -= gastosSaude/2;
            }
        }else if(getRenda() > 20000.00){
            impostos = getRenda()*25/100;
            if(getGastosSaude() > 0.0){
                impostos -= gastosSaude/2;
            }
        }
        return impostos;
    }
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", calcImposto());
    }
}
