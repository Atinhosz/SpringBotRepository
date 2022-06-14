package br.com.zup.exercicioConta;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpfDoFuncionario, double salario, int senha) {
        super(nome, cpfDoFuncionario, salario,senha);
    }


    public double getBonificacao() {
        return this.salario * 0.15;
    }


    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha){
            return false;
        }
        return true;
    }
}