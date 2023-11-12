package software.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() throws HeadlessException {
        setTitle("Histogram Chart");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
