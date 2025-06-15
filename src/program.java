import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class program {
	public static void main(String[] args) {
		boolean isEnabled = true;
		Finch f = new Finch();
		//public void setMove(String direction, double distance, double speed)
		//f.setMove("F",100,100);
        JFrame frame = new JFrame("gui");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());

//      static JFrame text = new JFrame("textfield");;
//      
//      JButton forwardBot = new JButton("Forward");
//      forwardBot.addActionListener(e -> {
//          System.out.println("forward");
//          f.setMove("F",100,100);
//      });
//      
//      JButton backwardsBot = new JButton("Backward");
//      
//      backwardsBot.addActionListener(e -> {
//          System.out.println("backward");
//          f.setMove("B",100,100);
//      });
        
        frame.addKeyListener(new KeyAdapter() {
    		boolean sprintToggle = true;
            	@Override
            	public void keyPressed(KeyEvent e) {
			int left = 0;
			int right = 0;
		        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				sprintToggle = !sprintToggle;
		        }
                        if (e.getKeyCode() == KeyEvent.VK_W) {
                	    	left = 25;
			    	right = 25;
                    	} else if (e.getKeyCode() == KeyEvent.VK_S) {
                       	     	left = 25;
			    	right = 25;
                    	} else if (e.getKeyCode() == KeyEvent.VK_A) {
                           	 left = -25;
			    	right = 25;
                    	} else if (e.getKeyCode() == KeyEvent.VK_D) {
                            	left = 25;
			    	right = -25;
                    	}
		    	if (sprintToggle) {
		    		f.setMotors(3*left,3*right);
		    	}
		    	else {
				f.setMotors(left,right);
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
