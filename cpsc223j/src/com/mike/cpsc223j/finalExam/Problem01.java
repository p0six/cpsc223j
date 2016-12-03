package com.mike.cpsc223j.finalExam;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Problem01 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	int subimgidx = 0, intimgidx = 0, fulimgidx = 0, selectedDays;
	String selectedCar, selectedType;
	double selectedCost;
	
	String[] ssimages = { "hondaFit.jpeg", "fordFiesta.jpeg", "toyotaYaris.jpeg"},
			siimages =  { "fordFusion.jpeg", "toyotaCamry.jpeg", "hondaAccord.jpeg" },
			sfimages = { "audiA8.jpg", "bmw7series.jpg", "cadillacCT6.jpg" },
			ssstrings = { "Honda Fit", "Ford Fiesta", "Toyota Yaris" },
			sistrings = { "Ford Fusion", "Toyota Camry", "Honda Accord" },
			sfstrings = { "Audi A8", "BMW 7-Series", "Cadillac CT6" };
	
	
	Label lavis = new Label("Avis Rent a Car"),
			ltypeOfCars = new Label("Type of cars"),
			lsubCompact = new Label("Subcompacts (Hyundai Accent or similar). $24.95/day"),
			lintermediate = new Label("Intermediate (Chev. Cruze or similar). $30.95/day"),
			lfullSize = new Label("Full Size (Chrysler, Impala or similar). $35.95/day"),
			lnumOfDays = new Label("Number of days(1-7)"),
			lselectedCar = new Label("Selected Car");
	
	Button bsnextCar = new Button("Next Car>>"),
			bsreserve = new Button("Reserve"),
			binextCar = new Button("Next Car>>"),
			bireserve = new Button("Reserve"),
			bfnextCar = new Button("Next Car>>"),
			bfreserve = new Button("Reserve"),
			breport = new Button("Press to see report");
	
	Choice chnumDays = new Choice();
	
	TextArea tareport = new TextArea(null,5,30);
	
	Image isc,iss,iic,iis,ifc,ifs;
	

	public void init() {
		// defaults
		setLayout(null);
		setSize(600,800);
		// initialize our dropdown for number of days..
		for (int i = 0; i < 7; i++) {
			chnumDays.add(Integer.toString(i+1));
		}
		
		// init some images..
		isc = new ImageIcon(getClass().getResource(ssimages[0])).getImage();
		iic = new ImageIcon(getClass().getResource(siimages[0])).getImage();
		ifc = new ImageIcon(getClass().getResource(sfimages[0])).getImage();
		
		// setBounds(x, y, width, height), and add
		lavis.setBounds(280, 10, 200, 20); add(lavis);
		ltypeOfCars.setBounds(10, 40, 100, 20); add(ltypeOfCars);
		lsubCompact.setBounds(10, 70, 350, 20); add(lsubCompact);
		lintermediate.setBounds(10, 200, 350, 20); add(lintermediate);
		lfullSize.setBounds(10, 350, 350, 20); add(lfullSize);
		lselectedCar.setBounds(400, 40, 100, 20); add(lselectedCar);
		bsnextCar.setBounds(230, 100, 100, 20); add(bsnextCar);
		bsreserve.setBounds(230, 140, 100, 20); add(bsreserve);
		binextCar.setBounds(230, 240, 100, 20); add(binextCar);
		bireserve.setBounds(230, 280, 100, 20); add(bireserve);
		bfnextCar.setBounds(230, 380, 100, 20); add(bfnextCar);
		bfreserve.setBounds(230, 420, 100, 20); add(bfreserve);
		lnumOfDays.setBounds(10, 500, 150, 20); add(lnumOfDays);
		breport.setBounds(180, 530, 150, 20); add(breport);
		chnumDays.setBounds(10, 530, 60, 20); add(chnumDays);
		tareport.setBounds(350, 530, 230, 150); add(tareport);
			
		// add some listeners
		bsnextCar.addActionListener(this);
		bsreserve.addActionListener(this);
		binextCar.addActionListener(this);
		bireserve.addActionListener(this);
		bfnextCar.addActionListener(this);
		bfreserve.addActionListener(this);
		breport.addActionListener(this);
	}
	
	public void paint(Graphics g) { // x, y, width, height
		g.drawImage(isc, 10, 100, 200, 100, this);
		g.drawImage(iss, 350, 100, 200, 100, this);
		g.drawImage(iic, 10, 240, 200, 100, this);
		g.drawImage(iis, 350, 240, 200, 100, this);
		g.drawImage(ifc, 10, 380, 200, 100, this);
		g.drawImage(ifs, 350, 380, 200, 100, this);
	}
	
	public void actionPerformed(ActionEvent e) {
		selectedDays = Integer.parseInt(chnumDays.getSelectedItem());
		double totalCost = selectedDays * selectedCost;
		if (e.getSource() == bsnextCar) { // 	int subimgidx = 0, intimgidx = 0, fulimgidx = 0;
			subimgidx = (subimgidx + 1) % ssimages.length;
			isc = new ImageIcon(getClass().getResource(ssimages[subimgidx])).getImage();
		} else if (e.getSource() == binextCar) {
			intimgidx = (intimgidx + 1) % ssimages.length;
			iic = new ImageIcon(getClass().getResource(siimages[intimgidx])).getImage();
		} else if (e.getSource() == bfnextCar) {
			fulimgidx = (fulimgidx + 1) % ssimages.length;
			ifc = new ImageIcon(getClass().getResource(sfimages[fulimgidx])).getImage();
		} else if (e.getSource() == bsreserve) {
			selectedType = "Sub-Compact";
			selectedCar = ssstrings[subimgidx];
			selectedCost = 24.95;
			iss = new ImageIcon(getClass().getResource(ssimages[subimgidx])).getImage();
			iis = null;
			ifs = null;
		} else if (e.getSource() == bireserve) {
			selectedType = "Intermediate";
			selectedCost = 30.95;
			selectedCar = sistrings[intimgidx];
			iis = new ImageIcon(getClass().getResource(siimages[intimgidx])).getImage();
			iss = null;
			ifs = null;
		} else if (e.getSource() == bfreserve) {
			selectedType = "Full Size";
			selectedCost = 35.95;
			selectedCar = sfstrings[fulimgidx];
			ifs = new ImageIcon(getClass().getResource(sfimages[fulimgidx])).getImage();
			iss = null;
			iis = null;
		} else { // Press to see report
			tareport.setText(null);
			tareport.append("Car Type: " + selectedType + "\n");
			tareport.append("Car Model: " + selectedCar + "\n");
			tareport.append("No. of days: " + selectedDays + "\n");
			tareport.append("Total Pay: $" + totalCost + "\n");
		}
		repaint();
	}
}