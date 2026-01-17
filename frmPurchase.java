import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class frmPurchase extends JInternalFrame implements ActionListener
{
    JDesktopPane desktop = new JDesktopPane();

    JTextField txDate ,txBillNo;
    JLabel lbDate,lbBillNo;

    
    frmPurchase()
    {
        super("SALE",true,true,true,true);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension ss = kit.getScreenSize();

        setSize(ss.width,ss.height);
        setLayout(null);

        lbBillNo = new JLabel("Bill No");
        lbBillNo.setBounds(10,40,80,25);
        add(lbBillNo);

        txBillNo = new JTextField();
        txBillNo.setBounds(100,40,100,25);
        add(txBillNo);

        lbDate = new JLabel("Date");
        lbDate.setBounds(220,40,80,25);
        add(lbDate);

        txDate = new JTextField();
        txDate.setBounds(310,40,100,25);
        add(txDate);





        
    }
    public void actionPerformed(ActionEvent e)
    {

    }
}