package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteLivro {
	public static String txt(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static int inteiro(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public static double real(String message) {
        return Double.parseDouble(JOptionPane.showInputDialog(message));
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
