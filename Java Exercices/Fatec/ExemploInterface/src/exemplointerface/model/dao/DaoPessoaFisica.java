/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.model.dao;

import exemplointerface.interfaces.CrudGeral;
import exemplointerface.model.bin.PessoaFisica;
import java.util.List;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoPessoaFisica implements CrudGeral {

    public PessoaFisica inserir(PessoaFisica objt) {
        PessoaFisica pf = new PessoaFisica(objt.getNome(), objt.getCpf());
        return  pf;
    }

    @Override
    public List<Object> listar(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object editar(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object excluir(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
