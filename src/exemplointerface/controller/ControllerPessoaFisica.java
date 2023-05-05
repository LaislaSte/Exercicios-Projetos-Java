/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.interfaces.CrudGeral;
import java.util.List;

import exemplointerface.model.bean.PessoaFisica;
import exemplointerface.model.dao.DaoPessoaFisica;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerPessoaFisica implements CrudGeral {
    
    DaoPessoaFisica daoPes;

    @Override
    public PessoaFisica inserir(PessoaFisica objt) {
        daoPes = new DaoPessoaFisica();
        PessoaFisica pf = daoPes.inserir(objt);
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
