import javax.swing.JFrame;


public class HelloWorld extends JFrame{ 
        
    public HelloWorld() {

    super("Our first Swing program");

}

public static void main(String[] args){ 

    HelloWorld gui = new HelloWorld();
    gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); 
    gui.setSize(800, 600);

    gui.setVisible(true);

}

}