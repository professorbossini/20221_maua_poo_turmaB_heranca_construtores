public class Pessoa{
    String nome;
    private int idade;

    // //esse é o construtor padrão da classe Pessoa
    // //observe que a sua lista de parâmetros é vazia
    // public Pessoa(){
    //     super();
    //     System.out.println("Construindo uma pessoa...");
    // }
    public Pessoa(String nome, int idade){
        this(idade);
        this.nome = nome;
    }

    public Pessoa(int idade){
        super();
        if (idade >= 18)
            this.idade = idade;
    }

    public String toString(){
        return String.format(
            "Nome: %s, idade: %d",
            nome,
            idade
        );
    }

}