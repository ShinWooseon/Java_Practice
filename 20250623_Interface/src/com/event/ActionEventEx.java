package com.event;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx extends Frame implements ActionListener {
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx() {
		super("액션 이벤트 !!");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new ActionEventEx();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String imsi = tf.getText();
			System.out.println("메시지 : "+ imsi);
			tf.setText("");
		}
	}

}
