import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
public class SwingDemo {
   public static void main(final String args[]) {
      JFrame jframe = new JFrame();
      jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel jpanel= new JPanel();
      jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.PAGE_AXIS));
      JButton btn = new JButton("Change label");
      JButton btnExit = new JButton("Exit");
      JLabel label = new JLabel("label");
      ActionListener actionListener = new ActionListener() {
         public void actionPerformed(ActionEvent event) {
               String str = event.getActionCommand();
               label.setText(str);
               jpanel.add(btnExit);
         }
      };

      ActionListener actionListenerExit = new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            System.exit(1);
         }
      };      


      btn.setActionCommand("FirstButton");
      btn.addActionListener(actionListener);  
      
      btnExit.addActionListener(actionListenerExit);
         
      jpanel.add(label);
      jpanel.add(btn);

      jframe.add(jpanel);
      jframe.setSize(600, 480);
      jframe.setVisible(true);

   }
}