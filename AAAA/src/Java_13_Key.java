
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Java_13_Key  {

	

	  public static void main(String[] args) throws Exception {


	    JFrame f = new JFrame();
	    
	    URL url32 = new URL("https://github.com/SuWeizhe1124/-image/blob/main/LOGO-removebg-preview%20(1).png?raw=true");
	    final List<Image> icons = new ArrayList<Image>();	    
	      String imagePath = "LOGO-removebg-preview.png";
         File imageFile = new File(imagePath);
	     icons.add(ImageIO.read(imageFile));	    
	      f.setIconImages(icons); 

	    f.setSize(200, 100);
	    f.setVisible(true);
	  }
	  
}