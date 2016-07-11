package JavaGUI;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Index extends JFrame{
	private JButton checkbox, textfield, radiobutton;
	private JLabel texto = new JLabel("Selecione um JComponent");
	private Handler listener = new Handler();
	
	Index(){
		super("JavaGUI");
		setLayout(new FlowLayout());
		
		checkbox = new JButton("CHECK BOX");
		textfield = new JButton("TEXT FIELD");
		radiobutton = new JButton("RADIO BUTTON");
		
		checkbox.addActionListener(listener);
		textfield.addActionListener(listener);
		radiobutton.addActionListener(listener);
		
		add(texto);
		add(checkbox);
		add(textfield);
		add(radiobutton);
	}
	
	class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource()==checkbox){
				new CheckBox();
			}
			if(evento.getSource()==textfield){
				new TextField();
			}
			if(evento.getSource()==radiobutton){
				new RadioButton();
			}
		}
		
	}
	
}
