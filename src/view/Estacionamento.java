package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Estacionamento extends JPanel {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JLabel lblOcupado;
	private JButton btnOcupado;
	private JLabel lblDisponvel;
	private JButton btnDisponivel;
	private JLabel lblVoc;
	private JButton btnVoce;

	/**
	 * Create the panel.
	 */
	public Estacionamento() {
		setBackground(Color.WHITE);
		setLayout(null);
		add(getBtn1());
		add(getBtn2());
		add(getBtn3());
		add(getBtn4());
		add(getBtn5());
		add(getBtn6());
		add(getBtn7());
		add(getBtn8());
		add(getBtn9());
		add(getBtn10());
		add(getBtn11());
		add(getBtn12());
		add(getBtn13());
		add(getBtn14());
		add(getBtn15());
		add(getBtn16());
		add(getBtn17());
		add(getBtn18());
		add(getBtn19());
		add(getBtn20());
		add(getBtn21());
		add(getBtn22());
		add(getBtn23());
		add(getBtn24());
		add(getBtn25());
		add(getLblOcupado());
		add(getBtnOcupado());
		add(getLblDisponvel());
		add(getBtnDisponivel());
		add(getLblVoc());
		add(getBtnVoce());

	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btn1.setContentAreaFilled(false);
		    btn1.setOpaque(true);
			btn1.setBackground(Color.GREEN);
			btn1.setForeground(Color.BLACK);
			btn1.setBounds(179, 45, 59, 42);
			
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.setContentAreaFilled(false);
		    btn2.setOpaque(true);
			btn2.setBackground(Color.GREEN);
			btn2.setForeground(Color.BLACK);
			btn2.setBounds(268, 45, 59, 42);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.setContentAreaFilled(false);
		    btn3.setOpaque(true);
			btn3.setBackground(Color.GREEN);
			btn3.setForeground(Color.BLACK);
			btn3.setBounds(357, 45, 59, 42);
		}
		return btn3;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.setContentAreaFilled(false);
		    btn4.setOpaque(true);
			btn4.setBackground(Color.GREEN);
			btn4.setForeground(Color.BLACK);
			btn4.setBounds(446, 45, 59, 42);
		}
		return btn4;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.setContentAreaFilled(false);
		    btn5.setOpaque(true);
			btn5.setForeground(Color.BLACK);
			btn5.setBackground(Color.GREEN);
			btn5.setBounds(535, 45, 59, 42);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.setContentAreaFilled(false);
		    btn6.setOpaque(true);
			btn6.setBackground(Color.GREEN);
			btn6.setForeground(Color.BLACK);
			btn6.setBounds(179, 139, 59, 42);
		}
		return btn6;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.setContentAreaFilled(false);
		    btn7.setOpaque(true);
			btn7.setForeground(Color.BLACK);
			btn7.setBackground(Color.GREEN);
			btn7.setBounds(268, 139, 59, 42);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.setContentAreaFilled(false);
		    btn8.setOpaque(true);
			btn8.setForeground(Color.BLACK);
			btn8.setBackground(Color.GREEN);
			btn8.setBounds(357, 139, 59, 42);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.setContentAreaFilled(false);
		    btn9.setOpaque(true);
			btn9.setForeground(Color.BLACK);
			btn9.setBackground(Color.GREEN);
			btn9.setBounds(446, 139, 59, 42);
		}
		return btn9;
	}
	private JButton getBtn10() {
		if (btn10 == null) {
			btn10 = new JButton("10");
			btn10.setContentAreaFilled(false);
		    btn10.setOpaque(true);
			btn10.setForeground(Color.BLACK);
			btn10.setBackground(Color.GREEN);
			btn10.setBounds(535, 139, 59, 42);
		}
		return btn10;
	}
	private JButton getBtn11() {
		if (btn11 == null) {
			btn11 = new JButton("11");
			btn11.setContentAreaFilled(false);
		    btn11.setOpaque(true);
			btn11.setForeground(Color.BLACK);
			btn11.setBackground(Color.GREEN);
			btn11.setBounds(179, 233, 59, 42);
		}
		return btn11;
	}
	private JButton getBtn12() {
		if (btn12 == null) {
			btn12 = new JButton("12");
			btn12.setContentAreaFilled(false);
		    btn12.setOpaque(true);
			btn12.setForeground(Color.BLACK);
			btn12.setBackground(Color.GREEN);
			btn12.setBounds(268, 233, 59, 42);
		}
		return btn12;
	}
	private JButton getBtn13() {
		if (btn13 == null) {
			btn13 = new JButton("13");
			btn13.setContentAreaFilled(false);
		    btn13.setOpaque(true);
			btn13.setForeground(Color.BLACK);
			btn13.setBackground(Color.GREEN);
			btn13.setBounds(357, 233, 59, 42);
		}
		return btn13;
	}
	private JButton getBtn14() {
		if (btn14 == null) {
			btn14 = new JButton("14");
			btn14.setContentAreaFilled(false);
		    btn14.setOpaque(true);
			btn14.setForeground(Color.BLACK);
			btn14.setBackground(Color.GREEN);
			btn14.setBounds(446, 233, 59, 42);
		}
		return btn14;
	}
	private JButton getBtn15() {
		if (btn15 == null) {
			btn15 = new JButton("15");
			btn15.setContentAreaFilled(false);
		    btn15.setOpaque(true);
			btn15.setForeground(Color.BLACK);
			btn15.setBackground(Color.GREEN);
			btn15.setBounds(535, 233, 59, 42);
		}
		return btn15;
	}
	private JButton getBtn16() {
		if (btn16 == null) {
			btn16 = new JButton("16");
			btn16.setContentAreaFilled(false);
		    btn16.setOpaque(true);
			btn16.setForeground(Color.BLACK);
			btn16.setBackground(Color.GREEN);
			btn16.setBounds(179, 327, 59, 42);
		}
		return btn16;
	}
	private JButton getBtn17() {
		if (btn17 == null) {
			btn17 = new JButton("17");
			btn17.setContentAreaFilled(false);
		    btn17.setOpaque(true);
			btn17.setForeground(Color.BLACK);
			btn17.setBackground(Color.GREEN);
			btn17.setBounds(268, 327, 59, 42);
		}
		return btn17;
	}
	private JButton getBtn18() {
		if (btn18 == null) {
			btn18 = new JButton("18");
			btn18.setContentAreaFilled(false);
		    btn18.setOpaque(true);
			btn18.setForeground(Color.BLACK);
			btn18.setBackground(Color.GREEN);
			btn18.setBounds(357, 327, 59, 42);
		}
		return btn18;
	}
	private JButton getBtn19() {
		if (btn19 == null) {
			btn19 = new JButton("19");
			btn19.setContentAreaFilled(false);
		    btn19.setOpaque(true);
			btn19.setForeground(Color.BLACK);
			btn19.setBackground(Color.GREEN);
			btn19.setBounds(446, 327, 59, 42);
		}
		return btn19;
	}
	private JButton getBtn20() {
		if (btn20 == null) {
			btn20 = new JButton("20");
			btn20.setContentAreaFilled(false);
		    btn20.setOpaque(true);
			btn20.setForeground(Color.BLACK);
			btn20.setBackground(Color.GREEN);
			btn20.setBounds(535, 327, 59, 42);
		}
		return btn20;
	}
	private JButton getBtn21() {
		if (btn21 == null) {
			btn21 = new JButton("21");
			btn21.setContentAreaFilled(false);
		    btn21.setOpaque(true);
			btn21.setForeground(Color.BLACK);
			btn21.setBackground(Color.GREEN);
			btn21.setBounds(179, 421, 59, 42);
		}
		return btn21;
	}
	private JButton getBtn22() {
		if (btn22 == null) {
			btn22 = new JButton("22");
			btn22.setContentAreaFilled(false);
		    btn22.setOpaque(true);
			btn22.setForeground(Color.BLACK);
			btn22.setBackground(Color.GREEN);
			btn22.setBounds(268, 421, 59, 42);
		}
		return btn22;
	}
	private JButton getBtn23() {
		if (btn23 == null) {
			btn23 = new JButton("23");
			btn23.setContentAreaFilled(false);
		    btn23.setOpaque(true);
			btn23.setForeground(Color.BLACK);
			btn23.setBackground(Color.GREEN);
			btn23.setBounds(357, 421, 59, 42);
		}
		return btn23;
	}
	private JButton getBtn24() {
		if (btn24 == null) {
			btn24 = new JButton("24");
			btn24.setContentAreaFilled(false);
		    btn24.setOpaque(true);
			btn24.setForeground(Color.BLACK);
			btn24.setBackground(Color.GREEN);
			btn24.setBounds(446, 421, 59, 42);
		}
		return btn24;
	}
	private JButton getBtn25() {
		if (btn25 == null) {
			btn25 = new JButton("25");
			btn25.setContentAreaFilled(false);
		    btn25.setOpaque(true);
			btn25.setForeground(Color.BLACK);
			btn25.setBackground(Color.GREEN);
			btn25.setBounds(535, 421, 59, 42);
		}
		return btn25;
	}
	private JLabel getLblOcupado() {
		if (lblOcupado == null) {
			lblOcupado = new JLabel("Ocupado");
			lblOcupado.setFont(new Font("Dialog", Font.BOLD, 20));
			lblOcupado.setBounds(53, 187, 105, 42);
		}
		return lblOcupado;
	}
	private JButton getBtnOcupado() {
		if (btnOcupado == null) {
			btnOcupado = new JButton("\r\n");
			btnOcupado.setBackground(Color.RED);
			btnOcupado.setBounds(12, 202, 35, 14);
		}
		return btnOcupado;
	}
	private JLabel getLblDisponvel() {
		if (lblDisponvel == null) {
			lblDisponvel = new JLabel("Disponível");
			lblDisponvel.setFont(new Font("Dialog", Font.BOLD, 20));
			lblDisponvel.setBounds(53, 238, 108, 26);
		}
		return lblDisponvel;
	}
	private JButton getBtnDisponivel() {
		if (btnDisponivel == null) {
			btnDisponivel = new JButton("\r\n");
			btnDisponivel.setBackground(Color.GREEN);
			btnDisponivel.setBounds(12, 247, 35, 14);
		}
		return btnDisponivel;
	}
	private JLabel getLblVoc() {
		if (lblVoc == null) {
			lblVoc = new JLabel("Você");
			lblVoc.setFont(new Font("Dialog", Font.BOLD, 20));
			lblVoc.setBounds(56, 288, 55, 16);
		}
		return lblVoc;
	}
	private JButton getBtnVoce() {
		if (btnVoce == null) {
			btnVoce = new JButton("\r\n");
			btnVoce.setBackground(Color.BLUE);
			btnVoce.setBounds(12, 292, 35, 14);
		}
		return btnVoce;
	}
}
