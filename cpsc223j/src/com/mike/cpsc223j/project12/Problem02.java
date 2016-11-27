package com.mike.cpsc223j.project12;

/*
 * Name			Michael Romero
 * Project No.	No.12 part 2
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet is an exam application that tests users addition skills.
 * 
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.ImageIcon;

public class Problem02 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	int numQuestions = 0, questionNumber = 0, numCorrect = 0, numWrong = 0;
	int x = (int) (Math.random()*10), y = (int) (Math.random()*10), z = 0;
	long startTime = 0, finishTime = 0;

	Calendar c = Calendar.getInstance();
	String sdate = c.get(Calendar.MONTH)+1 + "/" + c.get(Calendar.DATE) + "/" + c.get(Calendar.YEAR);
		
	Image imgface, imgschool;	
		
	Label ltodaysDate = new Label("Today's date: " + sdate),
			lselectNumQuestions = new Label("Select the nmber of questions:"),
			lpracticingAddition = new Label("Practicing addition"),
			lquestionNo = new Label("Question No."),
			lmessageFromInst = new Label("A Message from the Institution"),
			lreport = new Label("Report"),
			lmathProb = new Label(""),
			lresult = new Label("");
	
	Button bstart = new Button("Click to Start"),
			bnextQuestion = new Button("Press for next question");
	
	TextField tfresult = new TextField(null, 5);
	
	TextArea tamessage = new TextArea(null,2,20),
			tareport = new TextArea(null,10,20);
	
	CheckboxGroup cbgnumQuestions = new CheckboxGroup();
	Checkbox cbfive = new Checkbox("5", cbgnumQuestions, true),
			cbten = new Checkbox("10", cbgnumQuestions, false);
	
	public void init() {
		// some defaults
		setLayout(null);
		setSize(600,400);		
		
		// Let's load our CSUF Image
		imgschool = new ImageIcon(getClass().getResource("csuf.jpg")).getImage();
		
		 // setBounds(x, y, width, height), and add
		lpracticingAddition.setBounds(240,10,140,20); add(lpracticingAddition);
		ltodaysDate.setBounds(10, 30, 180, 20); add(ltodaysDate);
		lselectNumQuestions.setBounds(10, 60, 200, 20); add(lselectNumQuestions);
		lquestionNo.setBounds(10, 200, 120, 20); add(lquestionNo);
		lmessageFromInst.setBounds(30, 230, 200, 20); add(lmessageFromInst);
		lreport.setBounds(440, 230, 120, 20); add(lreport);
		lresult.setBounds(260, 200, 100, 20); add(lresult);
		bstart.setBounds(30, 130, 120, 30); add(bstart);
		bnextQuestion.setBounds(380, 200, 180, 30); add(bnextQuestion);
		tamessage.setBounds(10, 260, 240, 140); add(tamessage);
		tareport.setBounds(380, 260, 180, 140); add(tareport);
		tfresult.setBounds(200, 200, 40, 20); add(tfresult);
		lmathProb.setBounds(130, 200, 60, 20 ); add(lmathProb);
		cbfive.setBounds(220, 60, 40, 20); add(cbfive);
		cbten.setBounds(270, 60, 50, 20); add(cbten);
		
		// some listeners..
		bstart.addActionListener(this);
		bnextQuestion.addActionListener(this);
 	}
	
	public void actionPerformed(ActionEvent e) {
		// some game logic
		if (e.getSource() == bstart) {	
			c = Calendar.getInstance();
			startTime = c.getTimeInMillis()/1000; // current time in seconds at the start of quiz
			numCorrect = 0; numWrong = 0;
			tareport.setText(null); tamessage.setText(null);
			questionNumber = 1; // initialized earlier to 0
			lquestionNo.setText("Question No. " + questionNumber);
			
			// did they select 5 or 10 questions?
			if (cbfive.getState()) {
				numQuestions = 5; // initialized earlier to 0, this also affects conditional in else
			} else {
				numQuestions = 10; // initialized earlier to 0, this also affects conditional in else
			}
			
			// first math problem
			lmathProb.setText(x + " + " + y + " = ?");
			
			// give the text-field focus
			tfresult.requestFocus();
		} else { 
			if (numQuestions > 0 && (numWrong + numCorrect) != numQuestions) {
				// avoiding a parseInt() exception for null string
				if (tfresult.getText().equals("")) {
					z = 0;
				} else {
					z = Integer.parseInt(tfresult.getText());
				}
				
				// clear the text-field, give it focus in prep for next question
				tfresult.setText(null); tfresult.requestFocus();
				
				// x and y set to random digits above.
				if ((x + y) == z) {
					numCorrect++;
					// Update label to say "CORRECT", and a smiley face
					lresult.setText("CORRECT");
					imgface = new ImageIcon(getClass().getResource("happyface.png")).getImage(); 
					repaint();
				} else {
					numWrong++;
					// Update label to say "WRONG", and an angry face
					lresult.setText("WRONG");
					imgface = new ImageIcon(getClass().getResource("angryface.png")).getImage();
					repaint();
				}			
				
				// control whether to print a question, or compute results.
				if ((numCorrect + numWrong) == numQuestions) { // exam is over.. print out results
					c = Calendar.getInstance();
					finishTime = c.getTimeInMillis()/1000; // time in seconds at the end of quiz
					lmathProb.setText("");
					tareport.setText("Duration: " + (finishTime - startTime) + " seconds\n\n");
					tareport.append("No. of CORRECT: " + numCorrect + "\n");
					tareport.append("No. of WRONGs: " + numWrong + "\n");
					if (numQuestions/2 > numWrong) {
						tamessage.setText("Very good! Keep up the good work.\n");
					} else { 
						tamessage.setText("Don't give up. Keep trying.\n");
					}
				} else if  (numQuestions >= questionNumber) {	// print another question
					questionNumber++;	
					x = (int) (Math.random()*10); y = (int) (Math.random()*10); z = 0;
					lmathProb.setText(x + " + " + y + " = ?");
					lquestionNo.setText("Question No. " + questionNumber);
				} 
			}
		}
	} 
	
	public void paint(Graphics g) {
		g.drawImage(imgschool, 380, 100, 180, 100, this);
		g.drawImage(imgface, 260, 260, 100, 100, this);
	}
}