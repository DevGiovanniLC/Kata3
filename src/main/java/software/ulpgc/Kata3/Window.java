package software.ulpgc.Kata3;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() throws HeadlessException {
        setTitle("Histogram Chart");
        centerScreen();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public void centerScreen(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screen.height;
        int width = screen.width;
        setSize(width/2, height/2);

        setLocationRelativeTo(null);
    }
}
