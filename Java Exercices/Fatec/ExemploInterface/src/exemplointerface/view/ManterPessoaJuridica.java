/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.controller.ControllerPessoaJuridica;
import exemplointerface.interfaces.CrudView;
import exemplointerface.model.bin.PessoaJuridica;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterPessoaJuridica implements CrudView{

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog(null, "insira o nome");
        
        PessoaJuridica pj = new PessoaJuridica(nome);
        
        ControllerPessoaJuridica cpj = new ControllerPessoaJuridica();
        
        JOptionPane.showMessageDialog(null, cpj.inserir(pj));
        
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
