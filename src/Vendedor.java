public class Vendedor extends Empregado{
    public int numVenda;
    public double valVenda;
    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valVenda, int numVenda) {
        super(nome, idade, sexo, salario, matricula);
        this.numVenda = numVenda;
        this.valVenda = valVenda;
    }
    public int getNumVenda() {
        return numVenda;
    }
    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }
    public double getValVenda() {
        return valVenda;
    }
    public void setValVenda(double valVenda) {
        this.valVenda = valVenda;
    }
    @Override
    public String toString() {
        return "Vendedor{" +
                "numVenda=" + numVenda +
                ", valVenda=" + valVenda +
                '}';
    }

}