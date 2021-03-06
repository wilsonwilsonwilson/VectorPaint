package fr.iutinfo.interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	private JMenuItem nouveau, ouvrir, sauver, nouvelOnglet, fermerOnglet, quitter, copier, couper, coller;
	

	public MenuBar() {
		// Listener g�n�rique qui affiche l'action du menu utilis�
		ActionListener afficherMenuListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("El�ment de menu [" + event.getActionCommand() + "] utilis�.");
			}
		};
		
		// Cr�ation du menu Fichier
		JMenu fichierMenu = new JMenu("Fichier");
		nouveau = new JMenuItem("Nouveau");
		nouveau.addActionListener(afficherMenuListener);
		nouveau.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		fichierMenu.add(nouveau);
		ouvrir = new JMenuItem("Ouvrir");
		ouvrir.addActionListener(afficherMenuListener);
		fichierMenu.add(ouvrir);
		sauver = new JMenuItem("Sauver");
		sauver.addActionListener(afficherMenuListener);
		sauver.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		fichierMenu.add(sauver);
		nouvelOnglet = new JMenuItem("Nouvel Onglet");
		nouvelOnglet.addActionListener(afficherMenuListener);
		nouvelOnglet.setAccelerator(KeyStroke.getKeyStroke('T', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		fichierMenu.add(nouvelOnglet);
		fermerOnglet = new JMenuItem("Fermer Onglet");
		fermerOnglet.addActionListener(afficherMenuListener);
		fermerOnglet.setAccelerator(KeyStroke.getKeyStroke('W', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		fichierMenu.add(fermerOnglet);
		quitter = new JMenuItem("Quitter");
		quitter.addActionListener(afficherMenuListener);
		quitter.setAccelerator(KeyStroke.getKeyStroke('Q', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		fichierMenu.add(quitter);

		// Cr�ation du menu Editer
		JMenu editerMenu = new JMenu("Editer");
		copier = new JMenuItem("Copier");
		copier.addActionListener(afficherMenuListener);
		copier.setAccelerator(KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		editerMenu.add(copier);
		couper= new JMenuItem("Couper");
		couper.addActionListener(afficherMenuListener);
		couper.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		editerMenu.add(couper);
		coller = new JMenuItem("Coller");
		coller.addActionListener(afficherMenuListener);
		coller.setAccelerator(KeyStroke.getKeyStroke('V', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));
		editerMenu.add(coller);

		// ajout des menus � la barre de menus
		add(fichierMenu);
		add(editerMenu);
	}
	
	public void addActionListener(ActionListener al){
		nouveau.addActionListener(al);
		ouvrir.addActionListener(al);
		sauver.addActionListener(al);
		nouvelOnglet.addActionListener(al);
		fermerOnglet.addActionListener(al);
		quitter.addActionListener(al);
		copier.addActionListener(al);
		couper.addActionListener(al);
		coller.addActionListener(al);
	}
}