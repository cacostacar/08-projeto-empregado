import java.text.DecimalFormat;

//extends (continuação da classe Empregado)
public class EmpregadoComissionado extends Empregado {

    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        //this.matricula = matricula; (quando usar super, já é um método e isso chama o construtor da super classe)
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas R$ " + df.format(totalDeVendas) + "\n";
        aux += "Comissão " + df.format(comissao) + "%\n";
        return aux;
    }

    //retornar o valor 1
    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }
}
