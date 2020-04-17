package senai;

import javax.swing.JOptionPane;

public class Desafio04 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
		String sexo = JOptionPane.showInputDialog("Digite o seu sexo: 'Masculino' ou 'Feminino'");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua altura:"));

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso ideal");
		}
		else if (imc < 24.9) {
			JOptionPane.showMessageDialog(null, "Parabéns - você está em seu peso normal!");
		} 
		else if (imc < 29.9) {
			JOptionPane.showMessageDialog(null, "Você está acima de seu peso (sobrepeso)");
		}
		else if (imc < 34.9) {
			JOptionPane.showMessageDialog(null, "Obesidade grau I");
		}
		else if (imc < 39.9) {
			JOptionPane.showMessageDialog(null, "Obesidade grau II");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Obesidade grau III");
		}

	}

}
