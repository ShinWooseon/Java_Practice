package com.event;

import java.awt.Frame;
import java.awt.event.*;

public class WindowEventEx extends Frame {

	public WindowEventEx() {
		super("익명클래스 이벤트");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(500, 500);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new WindowEventEx();
		/*　예외의 최상위는 exception이다.
		 */
		
		
	}

	
}
