import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class frmPurchase extends JFrame implements ActionListener
{
    //JDesktopPane desktop = new JDesktopPane();

    JTextField txDate ,txBillNo,txTotal,txMob,txProductNo;
    JLabel lbDate,lbBillNo,lbMob,lbProductNo,lbTotal;
    JPanel infoPanel, amtPanel;




    frmPurchase()
    {
      //  super("SALE",true,true,true,true);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension ss = kit.getScreenSize();

        setSize(ss.width,ss.height);
        setTitle("Purchase");
        setLayout(null);

      	infoPanel = new JPanel();
      	infoPanel.setBounds(0,50,ss.width,ss.height);
      	infoPanel.setBorder(BorderFactory.createLineBorder(Color.black));
      	add(infoPanel);
      	infoPanel.setLayout(null);

        lbBillNo = new JLabel("Bill No");
        lbBillNo.setBounds(10,40,80,25);
        infoPanel.add(lbBillNo);

        txBillNo = new JTextField();
        txBillNo.setBounds(80,40,100,25);
        infoPanel.add(txBillNo);

        lbDate = new JLabel("Date");
        lbDate.setBounds(240,40,80,25);
        infoPanel.add(lbDate);

        txDate = new JTextField();
        txDate.setBounds(290,40,100,25);
        infoPanel.add(txDate);

		amtPanel = new JPanel();
		amtPanel.setBounds(10,110,390,80);
		amtPanel.setBorder(BorderFactory.createTitledBorder("AMOUNT"));
		infoPanel.add(amtPanel);
		amtPanel.setLayout(null);


		lbTotal = new JLabel("Total");
		lbTotal.setBounds(10,10,50,25);
		amtPanel.add(lbTotal);

		Font txTotalFont = new Font("Arial",Font.BOLD,30);
		txTotal = new JTextField("0",20);
		txTotal.setHorizontalAlignment(JTextField.CENTER);
		txTotal.setBounds(60,20,250,30);
		txTotal.setFont(txTotalFont);
		txTotal.setForeground(Color.white);
		txTotal.setBackground(Color.blue);
		amtPanel.add(txTotal);

		lbMob = new JLabel("Mobile No .");
		lbMob.setBounds(420,130,80,25);
		infoPanel.add(lbMob);

		txMob = new JTextField();
		txMob.setBounds(520,130,100,25);
		txMob.setBackground(Color.yellow);
		infoPanel.add(txMob);

		lbProductNo = new JLabel("Product No.");
		lbProductNo.setBounds(10,220,70,30);
		infoPanel.add(lbProductNo);

		txProductNo = new JTextField();
		txProductNo.setBounds(100,220,220,30);
		infoPanel.add(txProductNo);





    }
    public void actionPerformed(ActionEvent e)
    {

    }
}