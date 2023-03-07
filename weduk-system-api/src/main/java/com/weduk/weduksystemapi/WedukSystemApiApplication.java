package com.weduk.weduksystemapi;

import com.weduk.weduksystemapi.model.Funcionario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class WedukSystemApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WedukSystemApiApplication.class, args);
		Funcionario f = new Funcionario(01, "Fernanda", "Prof", 200.000);
		JOptionPane.showMessageDialog(null, f.toString());
		f.setCargo("Adm");
		f.mudarSalario();

		JOptionPane.showMessageDialog(null, f.getSalario());

	}

}
