import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fitts {
	static JButton button;
	static JButton button2;
	static TextField tf;
    static  long start;
    static long end;
   static int location = 200;
   static int width=20;
	public static void main (String []args) {
		JFrame frame = new JFrame();//creates frame
		frame.setTitle("title is here");
		
	    tf=new TextField(); 
		tf.setBounds(200,50, 150,40);
		
		
		
		button =new JButton("click");
		button.setBounds(100, 200, width, width);
		button.addActionListener(e ->  {start = System.currentTimeMillis();
       });
		
		button2 =new JButton("click");
		button2.setBounds(140,200,width,width);
		button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	end =System.currentTimeMillis();
     	       String n=String.valueOf(end-start + " ms");
     	    	 tf.setText(n);
                button2.setLocation(location,200);
                location += 80; //This will change where it draws next time
                width+=10;
                button.setSize(width, width);
        		button2.setSize(width, width);
            }
        });
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
		frame.setResizable(false);//prevent frame being resized
		frame.setLayout(null);
		frame.setSize(1000,1000);  //sets x and y dimensions
		frame.setVisible(true);//make frame visible
		frame.add(button); 
		frame.add(button2); 
		frame.add(tf);
	}

	
	
			
	}
