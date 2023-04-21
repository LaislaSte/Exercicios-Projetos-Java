/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.model.bin;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(int id) {
        super(id);
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String cnpj, int id, String nome) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg+"PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }


}
