public class ExemplosDeConstrutores {

    static {
        System.out.println("Inicializando");
    }

    public ExemplosDeConstrutores() {
        System.out.println("Construtor padrão Criado");
    }

    private String nome;
    private int idade;

    public ExemplosDeConstrutores(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor parametrizado! Nome: " + nome + ", idade: " + idade + "!");
    }

    public ExemplosDeConstrutores(String nome) {
        this(nome, 0);
        System.out.println("Construtor sobrecarregado");
    }

    public ExemplosDeConstrutores(ExemplosDeConstrutores outro) {
        this.nome = outro.nome;
        this.idade = outro.idade;
        System.out.println("Construtor de cópia! Nome: " + nome + ", idade: " + idade + "!");
    }

    private ExemplosDeConstrutores(boolean flag) {
        System.out.println("Construtor privado chamado: flag = " + flag + "!");
    }

    public static ExemplosDeConstrutores criarInstancia() {
        return new ExemplosDeConstrutores(true);
    }

    public static void main(String[] args) {
        ExemplosDeConstrutores exemplo1 = new ExemplosDeConstrutores();
        ExemplosDeConstrutores exemplo2 = new ExemplosDeConstrutores("Paulinho", 30);
        ExemplosDeConstrutores exemplo3 = new ExemplosDeConstrutores("Laura");
        ExemplosDeConstrutores exemplo4 = new ExemplosDeConstrutores(exemplo2);
    }
}
