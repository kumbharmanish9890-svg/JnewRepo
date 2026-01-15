import java.awt.*;
import javax.swing.*;
public class MDI extends JFrame {

    MDI()
    {
        Toolkit kit = Toolkit.getDefaultToolkit() ;
        Dimension ss = kit.getScreenSize();
        
        setSize(ss.width,ss.height);
    }
    
}
