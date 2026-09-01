public class Pet {
    private String nome;
    private String especie;
    private int idade;
    private double valorServico;

    public Pet(String nome, String especie, int idade, double valorServico) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
        setValor(valorServico);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValor() {
        return this.valorServico;
    }

    public void setValor(double valorServico) {
        this.valorServico = valorServico;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Idade: " + getIdade());
        System.out.println("Valor do Serviço: " + getValor());
    }

    public double calcularValorComDesconto() {
        return getValor() * 0.90; 
    }

}