package JavaGUI;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class CheckBox extends JFrame{
	private JCheckBox java, phyton, c;
	private JLabel mensagem = new JLabel("Selecione a(s) linguagem(ns) que deseja aprender");
	JLabel texto = new JLabel();
	Handler listener = new Handler();
	CheckBox(){
		super("Check Boxes");
		setLayout(new FlowLayout());
		setSize(300,200);
		setVisible(true);
		
		java = new JCheckBox("JAVA");
		c = new JCheckBox("C/C++");
		phyton = new JCheckBox("Phyton");
		
		java.addItemListener(listener);
		phyton.addItemListener(listener);
		c.addItemListener(listener);
		
		add(mensagem);
		add(java);
		add(phyton);
		add(c);
		add(texto);
	}
	
	class Handler implements ItemListener{
		String ling;
		@Override
		public void itemStateChanged(ItemEvent evento) {
			ling="";
			if(java.isSelected()){
				ling += "JAVA ";
			}
			if(phyton.isSelected()){
				ling += "Phyton ";
			}
			if(c.isSelected()){
				ling += "C/C++ ";
			}
			texto.setText("Linguagens selecionadas: "+ling);
		}
		
	}
	
}
