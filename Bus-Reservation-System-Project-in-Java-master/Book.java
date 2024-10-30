import javax.swing.*;
import javax.swing.BorderFactory.*;
import java.text.SimpleDateFormat;
import java.awt.event.*;
import java.awt.event.ItemListener.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.util.*;
import java.awt.Color;
import java.awt.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 
import java.awt.*;  
import java.text.*;  
import java.text.SimpleDateFormat;

public class Book 
{
	JFrame f = new JFrame("Welcome to SPY Services");
	 
	public Book() 
	{
		 
		
	JLabel li=new JLabel("Choose id");
	li.setBounds(10,20,60,30);
	f.add(li);
	String id[]={"Select","301","302","303","304","305","306","307","308","309","310","311","312","313","314","315","316","317","318","319","320","321","322","323","324","325","326","327","328","329","330","331","332","333","334","335","336","337","338","339","340"};
	JComboBox id1=new JComboBox(id);
	id1.setBounds(80,20,80,30);
	f.add(id1);
	
	JTextField name=new JTextField("CustomerName");
	name.setBounds(10,60,150,30);
	f.add(name);
		
	JLabel l1=new JLabel("From:-");
	l1.setBounds(200,20,60,30);
	f.add(l1);
	
	String city[]={"Select The City","Jalna","Aurangabad","Pune","Nashik","Nanded","Mumbai","Nagpur","Amravati","Kolhapur"};
	JComboBox t1=new JComboBox(city);
	t1.setBounds(250,10,210,50);
	f.add(t1);
	
	JLabel l2=new JLabel("to:-");
	l2.setBounds(200,70,60,30);
	f.add(l2);
	String city1[]={"Select The CITY","Jalna","Aurangabad","Pune","Nashik","Nanded","Mumbai","Nagpur","Amravati","Kolhapur"};
	 JComboBox t2=new JComboBox(city1);
	t2.setBounds(250,70,210,50);
	f.add(t2);
	
	JLabel l5=new JLabel("Amount");
	l5.setBounds(80,230,90,30);
	f.add(l5);
	JTextField t4=new JTextField();
	t4.setBounds(150,230,90,30);
	f.add(t4);
	t4.setEditable(false);

	JLabel l4=new JLabel("BUS type");
	l4.setBounds(10,90,100,50); //10,60,150,30);
	f.add(l4);
	String type[]={"Select","AC","Non_AC"};
	JComboBox d1=new JComboBox(type);
	d1.setBounds(70,105,90,20);
	f.add(d1);	
	
	JLabel l3=new JLabel("Number of Seats");
    l3.setBounds(10,115,200,50);
	f.add(l3);
	String seats[]={"0","1","2","3","4","5","6"};
	JComboBox t3=new JComboBox(seats);
	t3.setBounds(110,130,50,20);
	f.add(t3);
		

	t1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ae) {
			String s =t1.getSelectedItem().toString();
			if (s != null)
				{
					t2.removeItem(s);
				}
			}
		});		
		
		//remove same city
				//Amount logic
	t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			String s12 =t1.getSelectedItem().toString();
			String s13 =t2.getSelectedItem().toString();
			String s1 =d1.getSelectedItem().toString();		
	if(s12=="Jalna")
	{
		if(s13=="Aurangabad")
		{
		t4.setText("150");
		}
		else if(s13=="Pune")
		{
			t4.setText("450");
		}
		else if(s13=="Nashik")
		{
			t4.setText("350");
		}
		else if(s13=="Nanded")
		{
			t4.setText("250");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("650");
		}
		else if(s13=="Nagpur")
		{
			t4.setText("720");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("520");
		}
		else if(s13=="Amravati")
		{
			t4.setText("400");
		}
	}	
	else if(s12=="Aurangabad")
	{
		if(s13=="Jalna")
		{
			t4.setText("150");
		}
		else if(s13=="Pune")
		{
			t4.setText("300");
		}
		else if(s13=="Nashik")
		{
			t4.setText("280");
		}
		else if(s13=="Nanded")
		{
			t4.setText("350");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("550");
		}
		else if(s13=="Nagpur")
		{
			t4.setText("620");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("420");
		}
		else if(s13=="Amravati")
		{
			t4.setText("300");
		}
	}
	else if(s12=="Pune")
	{
		if(s13=="Jalna")
		{
			t4.setText("450");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("300");
		}
		else if(s13=="Nashik")
		{
			t4.setText("200");
		}
		else if(s13=="Nanded")
		{
			t4.setText("520");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("250");
		}
		else if(s13=="Nagpur")
		{
			t4.setText("600");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("400");
		}
		else if(s13=="Amravati")
		{
			t4.setText("150");
		}
	}
	else if(s12=="Nashik")
	{
		if(s13=="Jalna")
		{
			t4.setText("350");
		}
		else if(s13=="Pune")
		{
			t4.setText("200");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("280");
		}
		else if(s13=="Nanded")
		{
			t4.setText("420");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("400");
		}
		else if(s13=="Nagpur")
		{
			t4.setText("500");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("620");
		}
		else if(s13=="Amravati")
		{
			t4.setText("300");
		}
	}
	else if(s12=="Nanded")
	{
		if(s13=="Jalna")
		{
			t4.setText("250");
		}
		else if(s13=="Pune")
		{
			t4.setText("520");
		}
		else if(s13=="Nashik")
		{
			t4.setText("420");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("350");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("750");
	}
		else if(s13=="Nagpur")
		{
			t4.setText("900");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("650");
		}
		else if(s13=="Amravati")
		{
			t4.setText("620");
		}
	}
//ongoing
	else if(s12=="Mumbai")
	{
		if(s13=="Jalna")
		{
			t4.setText("650");
		}
		else if(s13=="Pune")
		{
			t4.setText("250");
		}
		else if(s13=="Nashik")
		{
			t4.setText("400");
		}
		else if(s13=="Nanded")
		{
			t4.setText("750");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("550");
		}
		else if(s13=="Nagpur")
		{
			t4.setText("1000");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("550");
		}
		else if(s13=="Amravati")
		{
			t4.setText("380");
		}
	}
	else if(s12=="Nagpur")
	{
		if(s13=="Jalna")
		{
			t4.setText("720");
		}
		else if(s13=="Pune")
		{
			t4.setText("600");
		}
		else if(s13=="Nashik")
		{
			t4.setText("500");
		}
		else if(s13=="Nanded")
		{
			t4.setText("900");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("620");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("1000");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("620");
		}
		else if(s13=="Amravati")
		{
			t4.setText("740");
		}
	}
	else if(s12=="Amravati")
	{
		if(s13=="Jalna")
		{
			t4.setText("400");
		}
		else if(s13=="Pune")
		{
			t4.setText("100");
		}
		else if(s13=="Nashik")
		{
			t4.setText("300");
		}
		else if(s13=="Nanded")
		{
			t4.setText("620");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("300");
		}
		else if(s13=="Mumbai")
		{
			t4.setText("380");
		}
		else if(s13=="Kolhapur")
		{
			t4.setText("450");
		}
	}
	else if(s12=="Kolhapur")
	{
		if(s13=="Jalna")
		{
			t4.setText("520");
		}
		else if(s13=="Pune")
		{
			t4.setText("400");
		}
		else if(s13=="Nashik")
		{
			t4.setText("620");
		}
		else if(s13=="Nanded")
		{
			t4.setText("650");
		}
		else if(s13=="Aurangabad")
		{
			t4.setText("420");
		}
		else if(s13=="Amravati")
		{
			t4.setText("450");
		}
	}
	//No of seats
			String s2=t4.getText();
			String s3=(String) t3.getSelectedItem();
			int result = Integer.parseInt(s2);	
			int result1 = Integer.parseInt(s3);	
				int	c1=result*result1;
				String ns = Integer.toString(c1);
				t4.setText(ns);	
			//if AC
			String tw=t4.getText();
			int result3 = Integer.parseInt(tw);	
			if (s1=="AC")
				{
				int	c=result3+80;
				String ns1 = Integer.toString(c);
				t4.setText(ns1);	
				}
}
		});
			
	JLabel em=new JLabel("Emial");
	em.setBounds(200,120,60,30);
	f.add(em);
	JTextField em1=new JTextField("@gmail.com");
	em1.setBounds(235,125,230,20);
	f.add(em1);
	
	
	JLabel l6=new JLabel("Date_Of_Journey");
	l6.setBounds(10,180,100,30);
	f.add(l6);
	JDateChooser c1 = new JDateChooser();
    c1.setBounds(120,180,120,30);
	c1.setDateFormatString("yyyy-MM-dd");
	c1.setMinSelectableDate(new Date());
	f.add(c1);
	//c1.setEnabled(false);
	


	JButton b1=new JButton("Book");
	b1.setBounds(250,180,90,40);
	f.add(b1);
	
	b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
					try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","cw202");
			
			PreparedStatement stmt=con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?)");  
			String a12,a13,a14,a17;
			
			// String a15=t3.getText();
			String a15=(String) t3.getSelectedItem();
			  String a21=em1.getText();
			 int ii = Integer.parseInt(a15);
			 String a20=t4.getText();
			 int ii22 = Integer.parseInt(a20);
			 
			 String a18=name.getText();
			 a17=(String) id1.getSelectedItem();
             a12=(String) t1.getSelectedItem();
			 a13=(String) t2.getSelectedItem();
			 a14=(String) d1.getSelectedItem();
			 
			 
			 
			stmt.setInt(8,ii22);
			stmt.setString(9,a21);
			stmt.setString(2,a18);
			stmt.setString(1,a17); 
		    stmt.setInt(6,ii); 
			stmt.setString(5,a14);  
            stmt.setString(4,a13); 
			stmt.setString(3,a12); 

			//String a16=c1.getDate().toString().trim();
			
			
			SimpleDateFormat format;
			format = new SimpleDateFormat("yyyy-MMM-dd");
			java.util.Date r= c1.getDate();
			java.sql.Date today = new java.sql.Date(r.getTime()); 
			stmt.setDate(7,today);
						
			int i=stmt.executeUpdate();  
			JOptionPane.showMessageDialog(f,"Your ticket is booked"); 
			System.out.println("Done");		   
			con.close();
			
			String downloadURL="https://spybus.blogspot.com/2019/09/payment-form.html";
				java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();
				try
					{
					java.net.URI myNewLocation = new java.net.URI(downloadURL);
					myNewBrowserDesktop.browse(myNewLocation);
					}
					catch(Exception e)
					{
					}
		}catch(Exception b)
		{
			System.out.println(b);
		}
			}
		});

	JButton b3=new JButton("Reset");
	b3.setBounds(350,180,90,40);
	f.add(b3);
	
	//end
	
	b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 String s =t2.getSelectedItem().toString();
               // t3.setText("");
					t3.setSelectedIndex(0);
				c1.setCalendar(null);
				name.setText("");
				t4.setText("");
				t1.setSelectedIndex(0);
				t2.setSelectedIndex(0);
				id1.setSelectedIndex(0);
				d1.setSelectedIndex(0);
				
   
			}
		});	
		
		//start
		 f.addWindowListener(new WindowAdapter() {
				public void windowOpened(WindowEvent e)  {
				
                try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","cw202");
        PreparedStatement stmt = con.prepareStatement("select Ticket_id from booking ");
         
		ResultSet rs;
		rs = stmt.executeQuery();
        while(rs.next()){
    
        String av=rs.getString(1);
			if(av==id1.getSelectedItem());
			{
				id1.removeItem(av);
			}
        }
	}
	catch(Exception qe){
	JOptionPane.showMessageDialog(f,"Invali details");
	}
            }
        }); 
		//end
	
	
	
	
	JLabel label = new JLabel();
	label.setIcon(new ImageIcon("logo.png"));
	label.setBounds(150,210,200,200);
	f.add(label);
	
/*	
	Label time=new Label("Time:");
	time.setBounds(5,320,40,30);
	f.add(time);
	Label timesys=new Label();
	timesys.setBounds(50,320,100,30);
	f.add(timesys);
	
*/	
	f.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(500,400);
	f.setLayout(null);
	f.setVisible(true);
		
	
	}

	
	public static void main(String a[])
	{
		new Book();
		
	}

}	

