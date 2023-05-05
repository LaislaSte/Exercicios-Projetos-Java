/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;

    public PessoaFisica(int id) {
        super(id);
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String cpf, int id, String nome) {
        super(id, nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + "nome="+super.getNome()+ '}';
    }
    
    
    
    
    
    
}
