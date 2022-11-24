public class Gerente extends Empregado{
    public String nomeGer;
    public double INSS = salario*0.11;
    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGer) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGer = nomeGer;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }

    public String getNomeGer() {
        return nomeGer;
    }

    public void setNomeGer(String nomeGer) {
        this.nomeGer = nomeGer;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nomeGer='" + nomeGer + '\'' +
                ", INSS=" + INSS +
                '}';
    }
}
