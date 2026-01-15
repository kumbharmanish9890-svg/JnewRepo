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
    public frm()
    {
        setSize(700,500);
        setTitle("LOGIN");
        setLayout(null);

        LoginPanel = new JPanel();
        LoginPanel.setBounds(100,50,500,400);
        LoginPanel.setBorder(BorderFactory.createTitledBorder("LOGIN"));
        add(LoginPanel);
        setLayout(null);

        lbUser = new JLabel("Username");
        lbUser.setBounds(20,20,120,25);
        LoginPanel.add(lbUser);

     /*   txUser = new JTextField();
        txUser.setBounds(150,20,120,25);
        LoginPanel.add(txUser);

        lbPass = new JLabel("Password");
        lbPass.setBounds(20,70,120,25);
        LoginPanel.add(lbPass);

        txPass = new JTextField();
        txPass.setBounds(150,70,120,25);
        LoginPanel.add(txPass);
		*/
        btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(150,300,100,25);
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
