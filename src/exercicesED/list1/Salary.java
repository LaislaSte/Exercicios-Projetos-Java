package exercicesED.list1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Salary extends JFrame {
    //JFrame screen = new JFrame("Calculadoras");

    public Salary(){
        super("Exemplo Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        Calculator calculator = new Calculator();
        CalcSalary calcSalary = new CalcSalary();

        JLabel title = new JLabel("Selecione o que deja calcular");
        title.setBounds(100,30,400,30);
        title.setFont(new Font("Montserrat", Font.BOLD, 24));
        title.setForeground(new Color(0xEC3370));

        JButton btnSum = new JButton("Somar");
        JButton btnSub = new JButton("Subtrair");
        JButton btnMul = new JButton("Multiplicar");
        JButton btnDiv = new JButton("Dividir");
        btnSum.setBounds(80,150,100,30);
        btnSub.setBounds(80,190,100,30);
        btnDiv.setBounds(80,230,100,30);
        btnMul.setBounds(80,270,100,30);

        btnSum.addActionListener((ActionEvent e) -> {
            Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número para somar"));
            Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º número para somar"));
            JOptionPane.showMessageDialog(null, "Resultado: "+calculator.sum(num1, num2));
        });
        btnSub.addActionListener((ActionEvent e) -> {
            Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número para subtrair"));
            Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º número para subtrair"));
            JOptionPane.showMessageDialog(null, "Resultado: "+calculator.sub(num1, num2));
        });
        btnMul.addActionListener((ActionEvent e) -> {
            Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número para multiplicar"));
            Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º número para multiplicar"));
            JOptionPane.showMessageDialog(null, "Resultado: "+calculator.mult(num1, num2));
        });
        btnDiv.addActionListener((ActionEvent e) -> {
            Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número para dividir"));
            Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º número para dividir"));
            JOptionPane.showMessageDialog(null, "Resultado: "+calculator.div(num1, num2));
        });

        JButton btnShowLiquidSalary = new JButton("Salário Liquido");
        btnShowLiquidSalary.setBounds(80,100,200,30);
        btnShowLiquidSalary.addActionListener((ActionEvent e) ->{
            Double salary = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário bruto"));
            JOptionPane.showMessageDialog(null, "O salario liquido fica: "+calcSalary.calculateTaxes(salary));
        });

        JButton btnShowSalary = new JButton("Reajuste de Salário");
        btnShowSalary.setBounds(300,100,200,30);
        btnShowSalary.addActionListener((ActionEvent e) ->{
            Double salary = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário bruto"));
            Double percentage = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem de mudança"));
            JOptionPane.showMessageDialog(null, "O salario liquido fica: "+calcSalary.calculateChane(salary, percentage));
        });

        JButton btnShowFat = new JButton("Fatorial");
        btnShowFat.setBounds(300,150,200,30);
        btnShowFat.addActionListener((ActionEvent e) ->{
            Integer num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            JOptionPane.showMessageDialog(null, "O fatorial de "+ num+" ficará: " + calculator.fat(num));
        });

        tela.add(title);
        tela.add(btnSub); tela.add(btnSum); tela.add(btnDiv); tela.add(btnMul);
        tela.add(btnShowSalary);
        tela.add(btnShowFat); tela.add(btnShowLiquidSalary);
        setSize(600, 450);
        setVisible(true);
    }


    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Selecione o que deseja calcular");
        Salary teste = new Salary();
        teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}