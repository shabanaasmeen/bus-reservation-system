import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import java.awt.Color;
import javax.swing.BorderFactory.*; 

class Busres 
{
	
	Busres()
	{
	JFrame f=new JFrame("Welcome to Spy Bus ");
	Label top=new Label("Spy Bus Reservation");
	
	top.setBounds(180,10,250,40);
	f.add(top);
	Font myFont = new Font("Vani",Font.BOLD,24);
	top.setFont(myFont);
	JLabel label = new JLabel();
    label.setIcon(new ImageIcon("Buslogo.png"));
	label.setBounds(200,45,250,200);
	f.add(label);
	
	Label date=new Label("Date:");
	date.setBounds(450,60,40,30);
	f.add(date);
	
	Label datesys=new Label();
	datesys.setBounds(490,60,100,30);
	f.add(datesys);
	
	Label time=new Label("Time:");
	time.setBounds(450,90,40,30);
	f.add(time);
	
	Label timesys=new Label();
	timesys.setBounds(490,90,100,30);
	f.add(timesys);
	
	Date d = Calendar.getInstance().getTime();  
	DateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy");  
	String strDate1 = dateFormat1.format(d);  
	datesys.setText(strDate1);
	
	Date d1 = Calendar.getInstance().getTime();  
	DateFormat dateFormat = new SimpleDateFormat("hh:mm");  
	String strDate = dateFormat.format(d1);  
	timesys.setText(strDate);
	
	JButton book=new JButton(new ImageIcon("book.png"));
	book.setBounds(110,200,165,50);
	book.setToolTipText("New User ");  
	f.add(book);
	
	book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Book();
			}
		});
	
	JButton log=new JButton(new ImageIcon("Login.png"));
	log.setBounds(320,200,165,50);
	log.setToolTipText("Existing User");  
	f.add(log);
	
	log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new View();
			}
		});
	
	Label copy=new Label("Copyright@SpyBusReservation 2019-20");
	copy.setBounds(180,330,250,40);
	f.add(copy);
	Font myFont3 = new Font("Vani",Font.BOLD,12);
	copy.setFont(myFont3);
	
	f.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(600,405);
	f.setLayout(null);
	f.setVisible(true);
	
	
	}
	public static void main(String a[])
	{
		Busres obj=new Busres();
		 
	}
}	