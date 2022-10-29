import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
//		GameFrame frame = new GamePanel(); //this is the traditional way to write an instance of a class
		this.add(new GamePanel());//this is shortcut method
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	

}
