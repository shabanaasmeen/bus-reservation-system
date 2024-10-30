import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.BorderFactory.*; 


public class View
{
	private JFrame f = new JFrame("View My Tickets");
	
	public View() 
	{
	JLabel label = new JLabel();
    label.setIcon(new ImageIcon("viewlogo.png"));
	label.setBounds(200,3,200,100);
	f.add(label);	
		
	JLabel idl=new JLabel("Ticket id");
	idl.setBounds(30,90,60,30);
	f.add(idl);
	JTextField cname=new JTextField();
	cname.setBounds(100,90,150,30);
	f.add(cname);
	
	JLabel pl=new JLabel("Your Name");
	pl.setBounds(30,130,60,30);
	f.add(pl);
	JTextField psw=new JTextField();
	psw.setBounds(100,130,150,30);
	f.add(psw);
	
	JButton b1=new JButton("LOG IN");
	b1.setBounds(100,170,80,40);
	f.add(b1);
	JButton b2=new JButton("Admin");
	b2.setBounds(100,220,80,40);
	f.add(b2);
	
	JButton b3=new JButton("cancel");
	b3.setBounds(100,270,80,40);
	f.add(b3);
	b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.setEnabled(false);
				new Cancel();
				f.dispose();
			}
		});	
	
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();
TextField t6=new TextField();
TextField t7=new TextField();
TextField t8=new TextField();
TextField t9=new TextField();



Label i1=new Label("Ticket Id=");
Label i2=new Label("Name=");
Label i3=new Label("From=");
Label i4=new Label("To=");
Label i5=new Label("Bus Type=");
Label i6=new Label("No.Of Seats=");
Label i7=new Label("Date Of Journey=");
Label i8=new Label("Amount=");
Label i9=new Label("Email:-");


i1.setBounds(300,100,100,30);
i2.setBounds(300,140,100,30);
i3.setBounds(300,180,100,30);
i4.setBounds(300,220,100,30);
i5.setBounds(300,260,100,30);
i6.setBounds(300,300,100,30);
i7.setBounds(300,340,100,30);
i8.setBounds(300,380,100,30);
i9.setBounds(300,420,100,30);
f.add(i1);
f.add(i2);
f.add(i3);
f.add(i4);
f.add(i5);
f.add(i6);
f.add(i7);
f.add(i8);
f.add(i9);

t1.setBounds(450,100,100,30);
t2.setBounds(450,140,100,30);
t3.setBounds(450,180,100,30);
t4.setBounds(450,220,100,30);
t5.setBounds(450,260,100,30);
t6.setBounds(450,300,100,30);
t7.setBounds(450,340,100,30);
t8.setBounds(450,380,100,30);
t9.setBounds(450,420,100,30);

t1.setEditable(false);
t2.setEditable(false);
t3.setEditable(false);
t4.setEditable(false);
t5.setEditable(false);
t6.setEditable(false);
t7.setEditable(false);
t8.setEditable(false);
t9.setEditable(false);


f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(t5);
f.add(t6);
f.add(t7);
f.add(t8);
f.add(t9);

	
	
	
	//fetch
	
	
	
	
	
	
	
		 //For user name amd pass
		 b1.addActionListener(new ActionListener() 
		 {
				public void actionPerformed(ActionEvent e) {
				
                try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","cw202");
         PreparedStatement stmt = con.prepareStatement("select * from booking where Ticket_id  = ? and Cname=?");
         
		String rm = cname.getText().trim();
		stmt.setInt(1, Integer.parseInt(rm));
		String r = psw.getText().trim();
		stmt.setString(2,r);
		ResultSet rs;
		rs = stmt.executeQuery();
        while(rs.next()){
        
		t1.setText(rs.getString("Ticket_id"));
		t2.setText(rs.getString("Cname"));
		t3.setText(rs.getString("From_city"));
		t4.setText(rs.getString("to_city"));
		t5.setText(rs.getString("Bus_type"));
		t6.setText(rs.getString("No_of_Seats"));
		t7.setText(rs.getString("Date_of_journey"));
		t8.setText(rs.getString("Amount"));
		t9.setText(rs.getString("Email"));
		psw.setText("");
		cname.setText("");
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
        }
	}
	catch(Exception qe){
	JOptionPane.showMessageDialog(f,"Invali details");
	}
            }
        }); 
		
		//start
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.setEnabled(false);
			String strname="User";
			String strpass="admin";
			
			
				if(strname.equals(cname.getText()))
				{
					if(strpass.equals(psw.getText()))
					{
						psw.setText("");
		cname.setText("");
						JFrame frame1 = new JFrame("Data");
		
		

       String[] columnNames = {"Ticket_id", "Customer_Name", "From", "To","Bus_type ","No_of_Seats","Date_of_Journey","Amount","Email"};

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        JTable table = new JTable();
				 table.setEnabled(false);
        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


        String id = "";
        String cname = "";
        String from = "";
        String to = "";
        String type = "";
        String no = "";
        String date = "";
        String am = "";
		String em = "";
		
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","cw202");

             PreparedStatement pst = con.prepareStatement("select * from booking");

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                id = rs.getString("Ticket_id");

                cname = rs.getString("Cname");

                from = rs.getString("From_city");

                to = rs.getString("To_city");
                type = rs.getString("Bus_type");
                no = rs.getString("No_of_Seats");
                date = rs.getString("Date_of_journey");
                am = rs.getString("Amount");
				em= rs.getString("Email");
				

                model.addRow(new Object[]{id, cname,from,to,type,no,date,am,em});

              
				
            }


        } catch (Exception ex) {

            System.out.println(ex);

        }
		
		//reenable
		 frame1.addWindowListener(new WindowAdapter() {
           
            public void windowClosing(WindowEvent e) {
                if(JOptionPane.showConfirmDialog(frame1, "Are you sure ?") == JOptionPane.OK_OPTION){
             
				   f.setEnabled(true);
                  
                }
				
				
            }
        });
		
        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(800, 300);
					
					}
					else
					{
					JOptionPane.showMessageDialog(f,"Invalid Details");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(f,"Invalid Details");
				}
			}
			
		});
		//end 
		
		
		f.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String ar[])
	{
		new View();
	}
}	