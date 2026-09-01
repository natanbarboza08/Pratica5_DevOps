public class Main {
    public static void main(String[] args) {
        Pet pet01 = new Pet("Thor", "Cachorro", 4, 80.00);
        Pet pet02 = new Pet("Paulinha", "Lagartixa", 1, 50.00);
        Pet pet03 = new Pet("Mabel", "Gato", 7, 10.00);

        System.out.println("==== PETSHOP DEVOPS ====");
        System.out.println("Informações do primeiro pet:");
        pet01.exibirInformacoes();
        System.out.println("Valor com desconto: " + pet01.calcularValorComDesconto());

        System.out.println("\nInformações do segundo pet:");
        pet02.exibirInformacoes();
        System.out.println("Valor com desconto: " + pet02.calcularValorComDesconto());

        System.out.println("\nInformações do terceiro pet");
        pet03.exibirInformacoes();
        System.out.println("Valor com desconto: " + pet03.calcularValorComDesconto());
    }
}