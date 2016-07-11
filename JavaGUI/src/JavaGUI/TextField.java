package JavaGUI;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class TextField extends JFrame{
	JTextField user;
	JPasswordField pass;
	JLabel usuario = new JLabel("Usuario: ");
	JLabel senha = new JLabel("Senha: "); 
	JButton enviar, limpar;
	Handler listener = new Handler();
	
	TextField(){
		super("Text Field");
		setLayout(new FlowLayout());
		setSize(300,150);
		setVisible(true);
		
		user = new JTextField(20);
		user.setEditable(true);
		pass = new JPasswordField(20);
		pass.setEditable(true);
		
		enviar = new JButton("ENVIAR");
		limpar = new JButton("LIMPAR");
		enviar.addActionListener(listener);
		limpar.addActionListener(listener);
		
		add(usuario);
		add(user);
		add(senha);
		add(pass);
		add(enviar);
		add(limpar);
	}
	
	class Handler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource()==enviar){
				if(user.getText().equals("gabriel00") && pass.getText().equals("1234")){
					JOptionPane.showMessageDialog(null, "Acesso Concedido");
				}
				else{
					JOptionPane.showMessageDialog(null, "Usuario e/ou senha errado(s)");
				}
			}
			if(evento.getSource()==limpar){
				user.setText("");
				pass.setText("");
			}
		}
		
	}
	
}
