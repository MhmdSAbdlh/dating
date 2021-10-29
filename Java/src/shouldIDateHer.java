import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class shouldIDateHer extends JFrame{

	static Font myFont = new Font("Tahoma",Font.BOLD,20);
	static Color darkC = new Color(129, 0, 0);
	static Color lightC = new Color(238, 235, 221);
	static Border border = new LineBorder(Color.white,2);
	
	shouldIDateHer(){

		//Frame and panel
		this.setTitle("Should I Date Her");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(darkC);
		this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("dating.png")).getImage());
		
		//label
		JLabel label = new JLabel("Your age: ");
		JLabel labelG = new JLabel("Her age:  ");
		JLabel credit = new JLabel("Created with Love by MhmdSAbdlh");
		credit.setHorizontalAlignment(0);
		credit.setBounds(0,210,600,30);
		credit.setForeground(Color.white);
		label.setFont(myFont);
		label.setBounds(150, 30, 200, 50);
		label.setForeground(lightC);
		labelG.setFont(myFont);
		labelG.setBounds(150, 100, 200, 50);
		labelG.setForeground(lightC);
		
		//TextField
		JTextField tf = new JTextField(2);
		JTextField tfG = new JTextField(2);
		tf.setBounds(265,40,50,30);
		textFieldStyle(tf);
		tfG.setBounds(265,110,50,30);
		textFieldStyle(tfG);
		
		//Button
		JButton btn1 = new JButton("Should I?");
		JButton btn2 = new JButton("Switch ages");
		btn1.setBounds(400,70,100,50);
		btnStyle(btn1);
		btn2.setBounds(200,170,100,30);
		btnStyle(btn2);
		btn1.addActionListener( e -> resultBtn(this, tf, tfG));
		btn2.addActionListener( e -> {	
				String temp = tf.getText();
				tf.setText(tfG.getText());
				tfG.setText(temp);
		});
		
		//Menu
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenuItem m2 = new JMenuItem("About");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("New");
		JMenuItem m12 = new JMenuItem("Exit");
		m1.add(m11);
		m1.add(m12);
		m11.addActionListener((event) -> { 
			tf.setText(null);
			tfG.setText(null);});
		m12.addActionListener((event) -> System.exit(0));
		m2.addActionListener((event) -> {JOptionPane.showMessageDialog(this,credit.getText());});
		
		//Add to Panel
		this.setJMenuBar(mb);
		this.add(label);
		this.add(tf);
		this.add(labelG);
		this.add(tfG);
		this.add(btn1);
		this.add(btn2);
		this.add(credit);
		
		//App Run
		this.getRootPane().setDefaultButton(btn1);
		this.setVisible(true);
	}

	//Check the input text if it is a number
	private static boolean isNumeric(String number) {
		try {
			Integer.parseInt(number);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

	//Result of clicking the button
	private static void resultBtn(JFrame frame, JTextField tf, JTextField tfG) {
		if(isNumeric(tf.getText())&&isNumeric(tfG.getText())) {
				int textInput = Integer.parseInt(tf.getText());
				int textInputG = Integer.parseInt(tfG.getText());
				if(textInput < 16 && textInputG <14)
					JOptionPane.showMessageDialog(frame,"You are "+textInput+" man,and she is only "+textInputG+" ,Dont think about it!");
					else
						if(textInput <16)
							JOptionPane.showMessageDialog(frame,"You are "+textInput+" man, you too young!");
						else
							if(textInputG <14)
								JOptionPane.showMessageDialog(frame,"She is only "+textInputG+" , Dont think about it!");
							else
								if(textInput>(textInputG/2+7) &&textInput<(textInputG*2-14))
									JOptionPane.showMessageDialog(frame,"Absolutly, DO IT!");
								else
									JOptionPane.showMessageDialog(frame,"Not the right one, there is a big difference of age");
				}
		else
				JOptionPane.showMessageDialog(frame,"You Need to enter an INTEGER NUMBER, Please ^_____^");
	}

	//Style of the buttons
	private static void btnStyle(JButton btn) {
		btn.setBorder(border);
		btn.setBackground(lightC);
		btn.setForeground(darkC);
		btn.setFocusable(false);
		btn.setHorizontalAlignment(0);
	}

	//Style of textField
	private static void textFieldStyle(JTextField tf) {
		tf.setBackground(darkC);
		tf.setForeground(lightC);
		tf.setFont(myFont);
		tf.setBorder(border);
		tf.setHorizontalAlignment(0);
	}

	public static void main(String[] args) {
				
		new shouldIDateHer();
	}
}