package com.weduk.weduksystemapi.model;

public class Funcionario extends  Pessoa {
    private String cargo;
    private Double salario;

    public Funcionario(int id, String nome, String cargo, Double salario) {
        super(id, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String msg = "Pessoa{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                '}';
        msg += "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';

        return msg;
    }

    public void mudarSalario(){
        if(getCargo().equals("Adm")){
            setSalario(getSalario()*2);
        }
    }
}
