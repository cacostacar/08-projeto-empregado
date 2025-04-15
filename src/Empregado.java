public abstract class Empregado {
    long matricula;
    String nome;


    public String getDados() {
        String aux = "";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }

    public abstract double calcularSalario();


    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}