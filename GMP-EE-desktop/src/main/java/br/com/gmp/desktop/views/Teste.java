/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.desktop.views;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author kaciano
 */
public class Teste {

    public Teste() {
        JFrame frame = new JFrame();
        AbstractAction acao = new AbstractAction() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Executei a acao");
            }
        };
        AbstractAction acaoB = new AbstractAction() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Executei a acaoB");
            }
        };
        frame.getRootPane().getActionMap().put("acao", acao);
        frame.getRootPane().getActionMap().put("acaoB", acaoB);
        frame.getRootPane().getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "acao");
        frame.getRootPane().getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "teste");
        frame.setSize(100, 100);
        JDialog dialog = new JDialog(frame, true);
        dialog.setSize(400, 400);
        frame.show(true);
        dialog.show(true);
        
    }
    public static void main(String[] args) {
        Teste t = new Teste();
    }
}
