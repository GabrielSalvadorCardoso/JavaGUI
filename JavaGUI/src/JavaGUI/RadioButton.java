package JavaGUI;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class RadioButton extends JFrame{
	JRadioButton fem, masc, sim, nao;
	ButtonGroup g1 = new ButtonGroup();
	ButtonGroup g2 = new ButtonGroup();
	JLabel texto1 = new JLabel("Informe o seu sexo");
	JLabel texto2 = new JLabel("Confirma informacao?");
	Handler listener = new Handler();
	RadioButton(){
		super("Radio Buttons");
		setLayout(new FlowLayout());
		setSize(180,200);
		setVisible(true);
		
		fem = new JRadioButton("Feminino", false);
		masc = new JRadioButton("Masculino", false);
		sim = new JRadioButton("Sim", false);
		nao = new JRadioButton("Nao", false);
				
		g1.add(fem);
		g1.add(masc);
		g2.add(nao);
		g2.add(sim);
		
		fem.addItemListener(listener);
		masc.addItemListener(listener);
		sim.addItemListener(listener);
		nao.addItemListener(listener);
		
		add(texto1);
		add(fem);
		add(masc);
		add(texto2);
		add(sim);
		add(nao);
		
	}
	
	class Handler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if(fem.isSelected() && sim.isSelected()){
					JOptionPane.showMessageDialog(null, "Sexo definido como FEMININO");
			}
			if(masc.isSelected() && sim.isSelected()){
				JOptionPane.showMessageDialog(null, "Sexo definido como MASCULINO");
			}
			
		}
		
	}
	
}
