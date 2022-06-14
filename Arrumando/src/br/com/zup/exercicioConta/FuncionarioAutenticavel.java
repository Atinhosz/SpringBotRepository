package br.com.zup.exercicioConta;

public class FuncionarioAutenticavel extends Funcionario{


    public FuncionarioAutenticavel(String nome, String cpfDoFuncionario, double salario, int senha) {
        super(nome, cpfDoFuncionario, salario, senha);
    }
    public boolean autentica(int senha){
        if(senha == senha){ return true; }
        return false;

}




















    }
