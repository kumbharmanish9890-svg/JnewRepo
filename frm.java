//gitpackage manish-demo.JnewRepo;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
//import javax.swing.border.Border;
public class frm extends JFrame implements ActionListener
{
    JPanel LoginPanel;
    JTextField txUser ,txPass;
    JLabel lbUser,lbPass;
    JButton btnLogin;

    Image imgLogin,scaledLogin;
    JLabel lbLogin;
    ImageIcon iconLogin;

    public frm()
    {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();

        setSize(ss.width/2,ss.height/2);
        setLocation(ss.width/4,ss.height/4);
        setTitle("LOGIN");
        //setLayout(new GridBagLayout());
        setLayout(null);


		imgLogin = Toolkit.getDefaultToolkit().getImage("Login.jpg");
		scaledLogin = imgLogin.getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
		iconLogin = new ImageIcon(scaledLogin);
		lbLogin = new JLabel(iconLogin);
		lbLogin.setBounds(0,0,1920,1080);
    	add(lbLogin);
    	lbLogin.setLayout(null);

    	int Pw = 350;
    	int Ph = 230;

    	int Fw = getWidth();
    	int Fh = getHeight();

    	int x = (Fw - Pw)/2;
    	int y = (Fh-  Ph)/2;

        LoginPanel = new JPanel();
      	LoginPanel.setBounds(x,y,Pw,Ph);
        //LoginPanel.setPreferredSize(new Dimension(350,230));
        lbLogin.add(LoginPanel);
        LoginPanel.setLayout(null);
        LoginPanel.setBorder(BorderFactory.createTitledBorder("LOGIN"));

        lbUser = new JLabel("Username");
        lbUser.setBounds(20,20,120,25);
        LoginPanel.add(lbUser);

       txUser = new JTextField();
        txUser.setBounds(150,20,120,25);
        LoginPanel.add(txUser);

        lbPass = new JLabel("Password");
        lbPass.setBounds(20,70,120,25);
        LoginPanel.add(lbPass);

        txPass = new JTextField();
        txPass.setBounds(150,70,120,25);
        LoginPanel.add(txPass);

        btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(120,180,100,25);
        LoginPanel.add(btnLogin);
        btnLogin.addActionListener(this);


    }
    public  void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnLogin)
        {
            MDI obj = new MDI();
            obj.show();
        }
    }
}
