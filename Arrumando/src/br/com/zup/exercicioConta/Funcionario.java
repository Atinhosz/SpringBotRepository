package br.com.zup.exercicioConta;

public class Funcionario implements Autenticavel {
    protected String nome;
    protected  String cpfDoFuncionario;
    protected  double salario;
    protected  int senha;
    //protected  int numeroDeFuncionariosGerenciados;

    @Override //Metado do Implements
    public boolean autentica(int senha) {
        if(this.senha != senha){
            return false;
        }
        return true;
    }

    public boolean autenticaSenha(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }}

    public Funcionario(String nome, String cpfDoFuncionario, double salario, int senha){
        this.nome = nome;
        this.cpfDoFuncionario = cpfDoFuncionario;
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }



    void setNomeFuncionario(String nome){
        this.nome = nome;
    }

    String setCpfFuncionario(String cpfFuncionario){
        this.cpfDoFuncionario = cpfFuncionario;
        return cpfFuncionario;
    }

    public double setSalario(double salario){
        this.salario = salario;
        return salario;
    }

    public String getNome(){
       return this.nome;
    }



}
