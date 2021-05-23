import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello World");
        JFrame locJFrame = new JFrame();
        JButton locJbutton = new JButton("Puseh me");
        
        

                
        locJFrame.add(locJbutton);
        locJFrame.setVisible(true);   
        System.out.println("End");

    }
}