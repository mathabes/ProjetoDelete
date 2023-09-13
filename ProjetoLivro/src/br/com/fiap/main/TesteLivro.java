package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteLivro {
	public static String txt(String message) {
        return JOptionPane.showInputDialog(message);
    }

    // Método estático para receber uma entrada de int usando JOptionPane
    public static int inteiro(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }

    // Método estático para receber uma entrada de double usando JOptionPane
    public static double real(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Double.parseDouble(input);
    }

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LivroDAO dao = new LivroDAO();
		Livro objL = new Livro();
		
		objL.setCodigo(inteiro("Codigo"));
		objL.setTitulo(txt("Título do livro"));
		objL.setAutor(txt("Autor do livro"));
		objL.setValor(real("Valor do livro"));
		System.out.println(dao.inserir(objL));

	}

}
