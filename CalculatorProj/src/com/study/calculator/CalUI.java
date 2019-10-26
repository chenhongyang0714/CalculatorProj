package com.study.calculator;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalUI extends JDialog {
	private JTextField txtResult;  // �ı���
	private int number1 = 0;
	private int number2 = 0;
	private String lastOption = "";  // ��¼�ϴ�����������
	
	public CalUI() {
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  // ʵ���˳�
			}
		});
		mnOption.add(mntmExit);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Arial", Font.PLAIN, 14));
		txtResult.setEditable(false);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{39, 39, 39, 0, 0};
		gbl_panel_1.rowHeights = new int[]{23, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setBackground(Color.WHITE);
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 1;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum1 = new GridBagConstraints();
		gbc_btnNum1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum1.gridx = 0;
		gbc_btnNum1.gridy = 0;
		panel_1.add(btnNum1, gbc_btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBackground(Color.WHITE);
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 2;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum2 = new GridBagConstraints();
		gbc_btnNum2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum2.gridx = 1;
		gbc_btnNum2.gridy = 0;
		panel_1.add(btnNum2, gbc_btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBackground(Color.WHITE);
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 3;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum3 = new GridBagConstraints();
		gbc_btnNum3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum3.gridx = 2;
		gbc_btnNum3.gridy = 0;
		panel_1.add(btnNum3, gbc_btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBackground(Color.WHITE);
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 4;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum4 = new GridBagConstraints();
		gbc_btnNum4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum4.gridx = 0;
		gbc_btnNum4.gridy = 1;
		panel_1.add(btnNum4, gbc_btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setBackground(Color.WHITE);
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 5;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum5 = new GridBagConstraints();
		gbc_btnNum5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum5.gridx = 1;
		gbc_btnNum5.gridy = 1;
		panel_1.add(btnNum5, gbc_btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setBackground(Color.WHITE);
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 6;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum6 = new GridBagConstraints();
		gbc_btnNum6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum6.gridx = 2;
		gbc_btnNum6.gridy = 1;
		panel_1.add(btnNum6, gbc_btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setBackground(Color.WHITE);
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 7;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum7 = new GridBagConstraints();
		gbc_btnNum7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum7.gridx = 0;
		gbc_btnNum7.gridy = 2;
		panel_1.add(btnNum7, gbc_btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBackground(Color.WHITE);
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 8;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum8 = new GridBagConstraints();
		gbc_btnNum8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum8.gridx = 1;
		gbc_btnNum8.gridy = 2;
		panel_1.add(btnNum8, gbc_btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBackground(Color.WHITE);
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 9;
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnNum9 = new GridBagConstraints();
		gbc_btnNum9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNum9.gridx = 2;
		gbc_btnNum9.gridy = 2;
		panel_1.add(btnNum9, gbc_btnNum9);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBackground(Color.WHITE);
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number2 * 10 + 0;
				txtResult.setText(String.valueOf(number2));
			}
		});

		GridBagConstraints gbc_btnNum0 = new GridBagConstraints();
		gbc_btnNum0.insets = new Insets(0, 0, 0, 5);
		gbc_btnNum0.gridx = 1;
		gbc_btnNum0.gridy = 3;
		panel_1.add(btnNum0, gbc_btnNum0);
		
		// +
		JButton btnOpPlus = new JButton("+");
		btnOpPlus.setBackground(Color.WHITE);
		btnOpPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				number2 = 0;
				lastOption = "+";
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnOpPlus = new GridBagConstraints();
		gbc_btnOpPlus.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpPlus.gridx = 3;
		gbc_btnOpPlus.gridy = 0;
		panel_1.add(btnOpPlus, gbc_btnOpPlus);
		
		
		// -
		JButton btnOpMinus = new JButton("-");
		btnOpMinus.setBackground(Color.WHITE);
		btnOpMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				number2 = 0;
				lastOption = "-";
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnOpMinus = new GridBagConstraints();
		gbc_btnOpMinus.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpMinus.gridx = 3;
		gbc_btnOpMinus.gridy = 1;
		panel_1.add(btnOpMinus, gbc_btnOpMinus);
		
		// *
		JButton btnOpMultiple = new JButton("*");
		btnOpMultiple.setBackground(Color.WHITE);
		btnOpMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				number2 = 0;
				lastOption = "*";
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnOpMultiple = new GridBagConstraints();
		gbc_btnOpMultiple.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpMultiple.gridx = 3;
		gbc_btnOpMultiple.gridy = 2;
		panel_1.add(btnOpMultiple, gbc_btnOpMultiple);
		
		// /
		JButton btnOpDivide = new JButton("/");
		btnOpDivide.setBackground(Color.WHITE);
		btnOpDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				number2 = 0;
				lastOption = "/";
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_btnOpDivide = new GridBagConstraints();
		gbc_btnOpDivide.gridx = 3;
		gbc_btnOpDivide.gridy = 3;
		panel_1.add(btnOpDivide, gbc_btnOpDivide);
		
		// =
		JButton btnOpEqual = new JButton("=");
		btnOpEqual.setBackground(Color.WHITE);
		btnOpEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				number2 = 0;
				txtResult.setText(String.valueOf(number1));
			}
		});
		btnOpEqual.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				calculate();
				number2 = 0;
				txtResult.setText(String.valueOf(number1));
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
			}
		});
		GridBagConstraints gbc_btnOpEqual = new GridBagConstraints();
		gbc_btnOpEqual.insets = new Insets(0, 0, 0, 5);
		gbc_btnOpEqual.gridx = 2;
		gbc_btnOpEqual.gridy = 3;
		panel_1.add(btnOpEqual, gbc_btnOpEqual);
		
		// C
		JButton Clean = new JButton("C");
		Clean.setBackground(Color.WHITE);
		Clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = 0;
				number2 = 0;
				lastOption = "";
				txtResult.setText(String.valueOf(number2));
			}
		});
		GridBagConstraints gbc_Clean = new GridBagConstraints();
		gbc_Clean.insets = new Insets(0, 0, 0, 5);
		gbc_Clean.gridx = 0;
		gbc_Clean.gridy = 3;
		panel_1.add(Clean, gbc_Clean);

		// ���߳�
		new Thread(()->{
			System.out.println("���Ƕ��߳�");
			// ����Ӧ��
			List<JButton> list = new ArrayList<>();  // ����һ�����ڴ�Ű�ť�ļ���
			Component [] items = panel_1.getComponents();  // ȡ��������������
			for(Component c : items) {
				if(c instanceof JButton) {
					list.add((JButton)c);  // ������еİ�ť��ŵ�list�б���
				}
			}
			txtResult.addKeyListener(new KeyListener() {  // �����¼�����
				public void keyTyped(KeyEvent e) {
				}
				public void keyReleased(KeyEvent e) {  // �����ͷ�
					char ch = e.getKeyChar();  // ��ȡ�����ַ�
					for(JButton jButton : list) {
						String jBStringText = jButton.getText();
						if(jBStringText.equalsIgnoreCase(String .valueOf(ch))) {
							jButton.setBackground(Color.WHITE);
						}
					}
				}
				public void keyPressed(KeyEvent e) {  // ����������
					char ch = e.getKeyChar();  // ��ȡ�����ַ�
					if(ch <=57 && ch >=48) {  // 0~9
						number2 = number2 * 10 + (ch-48);
						txtResult.setText(String.valueOf(number2));
					}
					if(ch == '+') {  // +
						calculate();
						number2 = 0;
						lastOption = "+";
						txtResult.setText(String.valueOf(number2));
					} else if(ch == '-') {
						calculate();
						number2 = 0;
						lastOption = "-";
						txtResult.setText(String.valueOf(number2));
					} else if(ch == '*') {
						calculate();
						number2 = 0;
						lastOption = "*";
						txtResult.setText(String.valueOf(number2));
					} else if(ch == '/') {
						calculate();
						number2 = 0;
						lastOption = "/";
						txtResult.setText(String.valueOf(number2));
					} else if(ch == '=') {
						calculate();
						number2 = 0;
						txtResult.setText(String.valueOf(number1));
					}
					for(JButton jButton : list) {
						String jBStringText = jButton.getText();
						if(jBStringText.equalsIgnoreCase(String .valueOf(ch))) {
							jButton.setBackground(Color.YELLOW);
						}
					}
				}
			});			
		}) .start();
		
	}

	/**
	    *  ��number1��ֵ�����������
	  * 1. ��û�н��й��������(��ʱnumber1Ϊ0)-->ֱ�Ӱ�number2��ֵ��number1
	  * 2.���й��������(��ʱnumber1��Ϊ0)-->ͨ���������number1��ֵ
	  */
	public void calculate() {
//		System.out.println(lastOption);
//		System.out.println("number2" + number2);
		if(lastOption.equals("")) {
			number1 = number2;
		} else if(lastOption.equals("+")) {
			number1 += number2;
		} else if(lastOption.equals("-")) {
			number1 -= number2;
		} else if(lastOption.equals("*")) {
			number1 *= number2;
		} else if(lastOption.equals("/")) {
			number1 /= number2;
		} 
//		System.out.println("number1" + number1);
	}
}
