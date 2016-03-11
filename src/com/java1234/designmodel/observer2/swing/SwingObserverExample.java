package com.java1234.designmodel.observer2.swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	JFrame jFrame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		jFrame = new JFrame();
		JButton jButton = new JButton("should i do it ?");
		jButton.addActionListener(new AngelListener());
		jButton.addActionListener(new DevilListener());
		jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
		jFrame.setVisible(true);
	}

	class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("do not do it ,you might regret it");
		}

	}

	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("come on ,do it!");
		}

	}
}
