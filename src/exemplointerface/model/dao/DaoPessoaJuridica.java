/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.model.dao;

import exemplointerface.interfaces.CrudGeral;
import exemplointerface.model.bean.PessoaJuridica;

import java.util.List;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoPessoaJuridica {

    public PessoaJuridica inserir(PessoaJuridica objt) {
        PessoaJuridica pj = new PessoaJuridica(objt.getNome());
        return pj;
    }

    
    public List<Object> listar(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object editar(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object excluir(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
