package countText;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountText extends Frame implements ActionListener{

	TextArea ta1;
	Label textCount;
	Label wordCount;
	Button count;

	CountText(){
		Frame f1 = new Frame();
		textCount = new Label("Enter and click Count");
		textCount.setBounds(50, 50, 190, 20);
		wordCount = new Label();
		wordCount.setBounds(300, 50, 200, 20);
		ta1 = new TextArea();
		ta1.setBounds(50, 100, 500, 400);
		count = new Button("Count");
		count.setBounds(200, 550, 50, 20);
		
		count.addActionListener(this);
		
		f1.add(textCount);
		f1.add(wordCount);
		f1.add(ta1);
		f1.add(count);
		f1.setLayout(null);
		
		f1.setSize(600,700);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountText();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = ta1.getText();
		
		textCount.setText("Number Of Letter : "+s1.length());
		wordCount.setText("Number of words : "+(s1.split("\\s")).length);
	}
	

}
