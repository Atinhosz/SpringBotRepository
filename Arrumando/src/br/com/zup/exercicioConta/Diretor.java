package br.com.zup.exercicioConta;

public class Diretor extends Funcionario implements Autenticavel{
    public Diretor(String nome, String cpfDoFuncionario, double salario,int senha) {
        super(nome, cpfDoFuncionario, salario,senha);
    }

    @Override //Metado do Funcionario
    public boolean autenticaSenha(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }}

    @Override //Metado do implements
    public boolean autentica(int senha) {
        if(this.senha != senha){
            return false;
        }
        return true;
    }
}
