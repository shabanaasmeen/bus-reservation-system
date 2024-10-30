import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Cancel 
{  
	JFrame f=new JFrame();
	Cancel()
	{
	
	JLabel label = new JLabel();
    label.setIcon(new ImageIcon("viewlogo.png"));
	label.setBounds(80,3,200,100);
	f.add(label);	
		
	JLabel l1=new JLabel("Ticket id");
	l1.setBounds(30,90,60,30);
	f.add(l1);
	JTextField cname=new JTextField();
	cname.setBounds(100,90,150,30);
	f.add(cname);
	
	JLabel l2=new JLabel("YourName");
	l2.setBounds(30,130,60,30);
	f.add(l2);
	JTextField pass=new JTextField();
	pass.setBounds(100,130,150,30);
	f.add(pass);
	
	JButton b1=new JButton("Cancel");
	b1.setBounds(100,170,80,40);
	f.add(b1);
	b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
					try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","cw202");
			PreparedStatement stmt=con.prepareStatement("delete from booking where Ticket_id =? and Cname=?");  
			 
			String rm = cname.getText().trim();
			stmt.setInt(1, Integer.parseInt(rm));
			String r = pass.getText().trim();
			stmt.setString(2,r);
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(f,"Ticket is Canceled");
			 	   
		con.close();
		}catch(Exception b)
		{
			JOptionPane.showMessageDialog(f,"invalid details");
			System.out.println(b);
		}
			}
		});
			
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String ar[])
	{
		new Cancel();
	}
}
