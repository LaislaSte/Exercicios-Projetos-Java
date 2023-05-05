/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exemplointerface.interfaces;

import java.util.List;

import exemplointerface.model.bean.PessoaFisica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public interface CrudGeral {
    //usa o objeto como tipagem pois não sabe ainda o que vai ser passado, por isso geral
    
    public PessoaFisica inserir(PessoaFisica objt);
    public List<Object> listar(Object objt);
    public Object editar(Object objt);
    public Object excluir(Object objt);
    
}
