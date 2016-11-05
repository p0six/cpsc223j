package com.mike.cpsc223j.lectures;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Lecture13 extends Applet implements ActionListener, AdjustmentListener, ItemListener {
	private static final long serialVersionUID = 1L;

	// check box created individually
	Checkbox 
		chBold = new Checkbox("Bold"),
		chItalic = new Checkbox("Italic");
	
	// radio button created as a group (since only one radio button can be selected)
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox 
		radioRed = new Checkbox("Red", cbg, true),
		radioGreen = new Checkbox("Green", cbg, false);
	
	Button
		btnChange = new Button("Change"),
		btnHello = new Button("Hello");
	
	TextField txtf = new TextField();
	
	// direction (0 = horiz, 1 = vert), beginning of bar, length of bar, minimum, maximum
	Scrollbar sb = new Scrollbar(0, 10, 10, 0, 200); // horiz/vert, v1, v2, v3, v4 
	// [      [  ]            ]
	// v3    v1  v2           v4
	
	// Choice boxes or dropdown menu -> select one
	Choice ch = new Choice(); 
	
	// list boxes -> select one or more
	List lst = new List(3); 
	
	
	public void init() {
		add(chBold);
		add(chItalic);
		add(radioRed);
		add(radioGreen);
		add(btnChange);
		add(sb);
		
		add(ch); ch.addItemListener(this);
		ch.add("one"); ch.add("two"); ch.add("three"); ch.remove("three");
		
		add(lst);
		lst.add("four"); lst.add("five"); lst.add("six");
		// can specify position using second argument to add method
		
		sb.addAdjustmentListener(this);
		
		btnChange.addActionListener(this);
		btnHello.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnChange) {
			if (chBold.getState() == true) { // check box is selected
				
			}
			if (radioRed.getState() == true) { // radio button is selected
				
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String itm = ch.getSelectedItem();
		
		// to remove a selection from the list.. 
		int n = ch.getSelectedIndex();
		ch.remove(n);
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == sb) {
			txtf.setText(Integer.toString(sb.getValue()));
		}
	}	
	
}