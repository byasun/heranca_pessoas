public class Cliente extends Pessoas{
    public double valDivida;
    public int anoNasc;
    public Cliente(String nome, int idade, String sexo, double valDivida, int anoNasc) {
        super(nome, idade, sexo);
        this.valDivida = valDivida;
        this.anoNasc = anoNasc;
    }

    public double getValDivida() {
        return valDivida;
    }

    public void setValDivida(double valDivida) {
        this.valDivida = valDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "valDivida=" + valDivida +
                ", anoNasc=" + anoNasc +
                '}';
    }
}