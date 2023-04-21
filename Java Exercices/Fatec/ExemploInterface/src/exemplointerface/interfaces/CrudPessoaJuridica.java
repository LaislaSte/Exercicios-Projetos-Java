/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exemplointerface.interfaces;

import exemplointerface.model.bin.PessoaJuridica;
import java.util.List;

/**
 *
 * @author FATEC ZONA LESTE
 */
public interface CrudPessoaJuridica {
    public PessoaJuridica inserir(PessoaJuridica objt);
    public List<Object> listar(Object objt);
    public Object editar(Object objt);
    public Object excluir(Object objt);
    
}
