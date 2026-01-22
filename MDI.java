import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MDI extends JFrame implements ActionListener
{
    JMenuBar mbr = new JMenuBar();
    JMenu mnuBill;
    JDesktopPane desktop = new JDesktopPane();
    JMenuItem mnuItmBill1;

     MDI()
    {
        Toolkit kit = Toolkit.getDefaultToolkit() ;
        Dimension ss = kit.getScreenSize();

        setSize(ss.width,ss.height);
        setLayout(null);

        setJMenuBar(mbr);

        mnuBill = new JMenu("Bills");
        mbr.add(mnuBill);
        //mnuBill.addActionListener(this);

        mnuItmBill1 = new JMenuItem("ShortBill");
        mnuBill.add(mnuItmBill1);
        mnuItmBill1.addActionListener(this);

        desktop = new JDesktopPane();
        desktop.setBounds(0,30,ss.width,ss.height);
        add(desktop);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == mnuItmBill1)
        {
            frmPurchase obj = new frmPurchase();
            obj.show();

            //hide.this;
        }

    }

}
