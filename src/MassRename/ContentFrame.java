package MassRename;

import javax.swing.*;

public class ContentFrame extends JFrame{
	
	public ContentFrame(){
		super("MassRename");
		
		init(800,600);
	}
	
	private void init(int w, int h){
		setSize(w, h);
		setLocationRelativeTo(null);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
