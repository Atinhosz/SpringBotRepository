package br.com.zup.exercicioConta;

public class Cliente implements Autenticavel{
    private String nome;
    private String endereco;
    private String cpfCliente;
    private int idade;
    private int senha;
    String agencia;

    public Cliente(String nome, String cpfCliente, int idade, int senha){
        this.nome = nome;
        this.cpfCliente = cpfCliente;
        this.idade = idade;
        this.senha = senha;
    }

    public void mudaCPF(String cpfCliente){
       if(this.idade <= 60) {
           validaCPF(cpfCliente);
       }
       this.cpfCliente = cpfCliente;
    }

    private void validaCPF(String cpfCliente){

    }


    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha){
            return false;
        }
        return true;
    }
}
