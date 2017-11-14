/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import javax.swing.*;
/**
 *
 * @author Producer
 */
public class HelloWorld extends JFrame{
    JButton btn;
    JLabel lbl;
    JPanel panel;
    public HelloWorld(){
        btn = new JButton();
        lbl = new JLabel();
        btn.setText("Click Me!");
        setTitle("Hello World from Swing");
        panel = new JPanel();
        btn.setToolTipText("Click the button");
        
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        panel.add(btn);
        panel.add(lbl);
        add(panel);
        
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae) {
                btnMouseClicked(ae);
            }
        });
    }
    private void btnMouseClicked(java.awt.event.MouseEvent ae) {
        lbl.setText("Hello World");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloWorld();
            }
        });
    }
    
}
