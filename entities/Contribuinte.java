package entities;

public abstract class Contribuinte {
    private String nome;
    private double renda;

    public Contribuinte(){

    }
    public Contribuinte(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    public abstract Double calcImposto();
}
