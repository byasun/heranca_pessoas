class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Lucas", 25, "masculino", 1212, "39171", 70, 2);
        Cliente c1 = new Cliente("Letica", 21, "feminino", 100, 2001);
        Gerente g1 = new Gerente("Claudio", 50, "masculino", 5000, "51040678", "vendas");
        System.out.println("\n");
        System.out.println("A cliente "+c1.getNome()+", de "+c1.getIdade()+" anos de idade, nascido em "+c1.getAnoNasc()+", do sexo "+c1.getSexo()+", deve "+c1.getValDivida()+".");
        System.out.println("\n");
        System.out.println("O vendedor "+v1.getNome()+", de "+v1.getIdade()+"anos de idade, sob a matricula "+v1.getMatricula()+", do sexo "+v1.getSexo()+", fez "+v1.getNumVenda()+" vendas, no valor total de "+v1.getValVenda()+" reais.");
        System.out.println("\n");
        System.out.println("O gerente"+g1.getNome()+" do setor de "+g1.getNomeGer()+" sob a matriclula "+g1.getMatricula()+" de "+g1.getIdade()+" anos de idade, do sexo "+g1.getSexo()+", recebe "+g1.getSalario()+" e o INSS dele é "+g1.getINSS());
    }
}