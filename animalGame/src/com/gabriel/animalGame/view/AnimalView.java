package com.gabriel.animalGame.view;

import java.awt.Component;

import javax.swing.JOptionPane;

public class AnimalView {
	public void inicio() {
		   Component frame = null;
	        JOptionPane.showMessageDialog(frame, "Pense em um animal.");
	}
	
	public void exitoMensagem() {
		JOptionPane.showMessageDialog(null, "Sabia que eu estava certo!");
	}
	public String desistirMensagem() {
		 return JOptionPane.showInputDialog(null, "Desisto! Qual é o animal?");
     
	}
	public static boolean query(String prompt) {
     String answer = null;
     Component frame = null;
     int n = JOptionPane.showConfirmDialog(
             frame,
             prompt,
             prompt,
             JOptionPane.YES_NO_OPTION);
     if (n == 0) {
         answer = "Y";
     }
     if (n == 1) {
         answer = "N";
     }
     return answer.startsWith("Y");
 }
}