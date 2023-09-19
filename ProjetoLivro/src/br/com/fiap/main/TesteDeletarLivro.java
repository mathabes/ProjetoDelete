package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteDeletarLivro {
	
	public static int inteiro(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LivroDAO dao = new LivroDAO();
		Livro objL = new Livro();
		objL.setCodigo(inteiro("Digite o código do livro a ser deletado"));
		System.out.println(dao.deletar(objL));

	}

}
