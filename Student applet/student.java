import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class student extends Applet implements ActionListener {

	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;
	public void init(){
		setLayout(null);
		l1=new Label("Name");
		l2=new Label("Division");
		l3=new Label("Roll no");
		l4=new Label("Java marks");
		l5=new Label("DS marks");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();

		b1=new Button("Ok");
		b1.addActionListener(this);
		b2=new Button("Cancel");
		b2.addActionListener(this);

		l1.setBounds(100,100,100,30);
		l2.setBounds(100,200,100,30);
		l3.setBounds(100,300,100,30);
		l4.setBounds(100,400,100,30);
		l5.setBounds(100,500,100,30);

		t1.setBounds(200,100,100,30);
		t2.setBounds(200,200,100,30);
		t3.setBounds(200,300,100,30);
		t4.setBounds(200,400,100,30);
		t5.setBounds(200,500,100,30);

		b1.setBounds(125,600,50,30);
		b2.setBounds(175,600,50,30);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);

		add(b1);
		add(b2);

	}
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()== b1){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","");
				String sql="INSERT INTO marks(Student_name,Student_division,Student_rollno,Java_marks,DataStructure_marks) VALUES(?,?,?,?,?)";
				PreparedStatement pst=c.prepareStatement(sql);
				String name=t1.getText();
				String div=t2.getText();
				int rollno=Integer.parseInt(t3.getText());
				int java_marks=Integer.parseInt(t4.getText());
				int ds_marks=Integer.parseInt(t5.getText());
				pst.setString(1,name);
				pst.setString(2,div);
				pst.setInt(3,rollno);
				pst.setInt(4,java_marks);
				pst.setInt(5,ds_marks);
				pst.executeUpdate();
				System.out.println("Records inserted");
				c.close();			
			}
			catch(Exception e){
				System.out.println(e);
			}
		}


		if(ae.getSource() == b2){
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
		}
	}
	// public static void main(String args[]){
	// 	student s=new student();
	// 	s.setSize(500,700);
	// 	s.setVisible(true);
	// }
}

// <applet code=student width=500 height=700>
// </applet> 
