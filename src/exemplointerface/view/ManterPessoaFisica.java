/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.controller.ControllerPessoaFisica;
import exemplointerface.interfaces.CrudView;
import exemplointerface.model.bean.PessoaFisica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterPessoaFisica implements CrudView{

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir() {
        String nome = "meunomeéjulia";
        String cpf = "mycpf";
        
        PessoaFisica pf = new PessoaFisica(nome, cpf);
        
        ControllerPessoaFisica cpfs = new ControllerPessoaFisica();
        
        PessoaFisica bla =  cpfs.inserir(pf);
        
        System.out.println(bla);
    }

    @Override
    public void listar() {
        
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
