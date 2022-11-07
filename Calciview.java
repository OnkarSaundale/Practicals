package com.view;
import javax.swing.*;
import java.awt.event.*;
import com.controller.*;

public class Calciview 
	{
		public JFrame f;
		public JLabel l1,l2,l3,l4;
		public JButton b1,b2,b3,b4,b5,b6;
		public JTextField t1,t2,t3;
		
		public Calciview()
		{
			//Step 1: Initialization
			
			
			
			f = new JFrame("Calculator");//container
			
			l1= new JLabel("First No:");
			l2= new JLabel("Second No:");
			l3= new JLabel("Third No:");
			l4=new JLabel();
			
			b1= new JButton("+");
			b2= new JButton("-");
			b3= new JButton("*");
			b4= new JButton("/");
			b5= new JButton("Reset");
			b6= new JButton("Cancel");
			
			t1= new JTextField();
			t2= new JTextField();
			t3= new JTextField();
			
			
			//Step 2: Assigning(using)
			//           x ,  y,   w,  h
			l1.setBounds(10, 20, 100, 40);
			t1.setBounds(130, 20, 100, 40);
			
			l2.setBounds(10, 70, 100, 40);
			t2.setBounds(130, 70, 100, 40);
			
			b1.setBounds(10, 130, 100, 40);
			b2.setBounds(130, 130, 100, 40);
			b3.setBounds(250, 130, 100, 40);
			b4.setBounds(370, 130, 100, 40);
			
			l3.setBounds(10, 190, 100, 40);
			t3.setBounds(130, 190, 100, 40);
			
			b5.setBounds(10, 250, 100, 40);
			b6.setBounds(130, 250, 100, 40);
			
			
			//Step 3: Event Handling
			b1.addActionListener(new Calcicontroller(this));
			b2.addActionListener(new Calcicontroller(this));
			b3.addActionListener(new Calcicontroller(this));
			b4.addActionListener(new Calcicontroller(this));
			
			//Step 4: Mandatory methods
			f.add(l1);f.add(t1);
			f.add(l2);f.add(t2);
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);
			f.add(l3);f.add(t3);
			f.add(b5);f.add(b6);
			f.add(l4);
			f.setSize(600,600);
			f.setLayout(null);
			f.setVisible(true);
			
		}
	}
