/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import survivalZombie.EditorView;
import survivalZombie.PrincipalView;

/**
 *
 * @author Jose Suresh
 */
public class Controller implements ActionListener {

    private static PrincipalView principal;
    private static EditorView editor;
    private int skin;
    private int vel;

    public Controller(EditorView editor) {
        skin = 1;
        vel = 10;
        this.editor = editor;
        editor.getStartBtn().addActionListener(this);
        editor.getExitBtn().addActionListener(this);
        editor.getSkinRadio1().addActionListener(this);
        editor.getSkinRadio2().addActionListener(this);
        editor.getVel1().addActionListener(this);
        editor.getVel2().addActionListener(this);
        editor.getVel3().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == editor.getStartBtn()) {
            principal = new PrincipalView(editor, skin, vel);
            editor.setVisible(false);
            principal.setVisible(true);
            Process p1 = new Process("playerMove", principal);
            p1.start();

            Process p2 = new Process("Zombie", principal);
            p2.start();

            Process p3 = new Process("Bullet", principal);
            p3.start();
        }
        if (arg0.getSource() == editor.getExitBtn()) {
            System.exit(0);
        }

        if (arg0.getSource() == editor.getSkinRadio1()) {
            editor.setGroupRadioSkin(false);
            skin = 1;
        }
        if (arg0.getSource() == editor.getSkinRadio2()) {
            editor.setGroupRadioSkin(true);
            skin = 6;
        }

        if (arg0.getSource() == editor.getVel1()) {
            editor.setGroupCheckBoxVel(2);
            editor.setGroupCheckBoxVel(3);
            vel = 5;
        }

        if (arg0.getSource() == editor.getVel2()) {
            editor.setGroupCheckBoxVel(1);
            editor.setGroupCheckBoxVel(3);
            vel = 10;
        }

        if (arg0.getSource() == editor.getVel3()) {
            editor.setGroupCheckBoxVel(2);
            editor.setGroupCheckBoxVel(1);
            vel = 15;
        }
    }

}
