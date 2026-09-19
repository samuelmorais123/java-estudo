public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome,salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.1; // 10% de bônus para desenvolvedores
    }
}
