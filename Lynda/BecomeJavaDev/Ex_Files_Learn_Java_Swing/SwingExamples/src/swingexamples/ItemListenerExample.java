/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexamples;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Producer
 */
public class ItemListenerExample extends JPanel {
   
    JFrame frame;
    JPanel panel;
    JCheckBox checkBox1, checkBox2, checkBox3;
    
    public ItemListenerExample(){
        frame = new JFrame("Item Listener Example");
        frame.setSize(400,400);
        panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        checkBox1 = new JCheckBox();
        checkBox1.setText("Check Box 1");
        checkBox2 = new JCheckBox();
        checkBox2.setText("Check Box 2");
        checkBox3 = new JCheckBox();
        checkBox3.setText("Check Box 3");
      
        
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        
        frame.setContentPane(panel);
    }
    public static void main(String ars[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemListenerExample().setVisible(true);
            }
        });
    }

  
    
}
