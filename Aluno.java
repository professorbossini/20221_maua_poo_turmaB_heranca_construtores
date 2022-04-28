//Aluno É-UM Pessoa
public class Aluno extends Pessoa{

    private double nota;
    // public Aluno(){
    //     super (null, 0);
    // }

    public Aluno (String nome, int idade, double nota){
        super(nome, idade);
        this.nota = nota;
    }   
}
