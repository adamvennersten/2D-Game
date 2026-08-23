import javax.swing.JFrame;



public class Main {
    
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        
        Gamepanel gamePanel = new Gamepanel();
        window.add(gamePanel);
        window.pack();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure Game");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
         
    }
}
