/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;
import exemplointerface.model.bin.PessoaFisica;
import exemplointerface.interfaces.CrudPessoaJuridica;
import exemplointerface.model.bin.PessoaJuridica;
import exemplointerface.model.dao.DaoPessoaJuridica;
import java.util.List;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerPessoaJuridica implements CrudPessoaJuridica{
    DaoPessoaJuridica daoPeJ;
    PessoaJuridica pj;

    public PessoaJuridica inserir(PessoaJuridica objt) {
        daoPeJ = new DaoPessoaJuridica();
        PessoaJuridica pj = daoPeJ.inserir(objt);
        return pj;
    }

    //Exemplo de como fazer com Tipagem Object na Interface, não é recomendado por questões de manutenibilidade
    public List<Object> listar(Object objt) {
        pj = (PessoaJuridica) objt;
        daoPeJ.inserir(pj);
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object editar(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object excluir(Object objt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
