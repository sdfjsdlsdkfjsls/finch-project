import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class program {
	public static void main(String[] args) {
		Finch f = new Finch();
		//public void setMove(String direction, double distance, double speed)
		//f.setMove("F",100,100);
        JFrame frame = new JFrame("gui");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        
        JButton forwardBot = new JButton("Forward");
        forwardBot.addActionListener(e -> {
            System.out.println("forward");
            f.setMove("F",100,100);
        });
        
        JButton backwardsBot = new JButton("Backward");
        
        backwardsBot.addActionListener(e -> {
            System.out.println("backward");
            f.setMove("B",100,100);
        });
        
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            	int power = 50;
                if (e.getKeyCode() == KeyEvent.VK_W) {
                	f.setMotors(power,power);
                } 
                else if (e.getKeyCode() == KeyEvent.VK_S) {
                	f.setMotors(-power,-power);
                } 
                else if (e.getKeyCode() == KeyEvent.VK_A) {
                	f.setMotors(-power,power);
                }
                else if (e.getKeyCode() == KeyEvent.VK_D) {
                	f.setMotors(power,-power);
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            	if (e.getKeyCode() == KeyEvent.VK_W ||
            		e.getKeyCode() == KeyEvent.VK_S ||
            		e.getKeyCode() == KeyEvent.VK_A ||
            		e.getKeyCode() == KeyEvent.VK_D) {
                	f.stop();
                } 
            }
        });
        
        
        frame.add(backwardsBot);
        frame.add(forwardBot);
        frame.setFocusable(true);
        frame.requestFocus();
        frame.setVisible(true);

	}
	
}
