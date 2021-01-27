package com.gabriel.animalGame.main;

import javax.swing.JOptionPane;

import com.gabriel.animalGame.controller.AnimalController;
import com.gabriel.animalGame.dao.AnimalDao;
import com.gabriel.animalGame.model.AnimalNode;
import com.gabriel.animalGame.view.AnimalView;

public class Main {
	public static void main(String[] args) {
		//estanciando as classes
		AnimalNode<String> raiz;
		AnimalView msg = new AnimalView();
		//iniciando o projeto
		msg.inicio();
		//adicionando os atributos na arvore
		raiz = AnimalDao.inicioArvore();
		do {
			AnimalController.play(raiz);
		} while (msg.query("Vamos jogar novamente?"));

		JOptionPane.showMessageDialog(null, " Game criador por Gabriel de Souza");
		raiz.imprimir(1);
		System.exit(0);
	}
}
