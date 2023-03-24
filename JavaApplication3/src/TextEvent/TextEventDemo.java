package TextEvent;
import java.awt.*;
import java.awt.event.*;

public class TextEventDemo extends Frame implements TextListener {
    TextField textField;

    public TextEventDemo() {
        setLayout(new FlowLayout());
        textField = new TextField(20);
        textField.addTextListener(this);
        add(textField);
        setTitle("Text Event Demo");
        setSize(300, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void textValueChanged(TextEvent e) {
        System.out.println("Text changed: " + textField.getText());
    }

    public static void main(String[] args) {
        new TextEventDemo();
    }
}

