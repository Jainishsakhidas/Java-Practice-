import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class CollegeForm extends Applet implements ActionListener{
	Label l1,l2,l3,l4;
	Button b1,b2;
	TextField t1,t2;
	TextArea t3;
	CheckboxGroup cb;
	Checkbox c1,c2,c3;

	public void init(){

		setLayout(null);

		l1 = new Label("Name");
		l2 = new Label("Email Address");
		l3 = new Label("Suggestions for Events");
		l4 = new Label("Division");

		t1 = new TextField();
		t2 = new TextField();

		t3 = new TextArea(4,10);

		cb = new CheckboxGroup();
		c1 = new Checkbox("SE3",false,cb);
		c2 = new Checkbox("SE4",false,cb);
		c3 = new Checkbox("SE9",false,cb);

		b1 = new Button("Ok");
		b2 = new Button("Cancel");
		b2.addActionListener(this);


		l1.setBounds(100,100,100,30);
		l2.setBounds(100,200,100,30);
		l3.setBounds(100,300,200,30);
		l4.setBounds(100,500,100,30);

		t1.setBounds(300,100,100,30);
		t2.setBounds(300,200,100,30);

		t3.setBounds(300,300,100,100);

		c1.setBounds(300,500,40,30);
		c2.setBounds(340,500,40,30);
		c3.setBounds(380,500,40,30);

		b1.setBounds(125,600,50,30);
		b2.setBounds(275,600,50,30);
		

		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(l3);
		add(t3);

		add(l4);
		add(c1);
		add(c2);
		add(c3);

		add(b1);
		add(b2);

	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b2){
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");

			cb.setSelectedCheckbox(null);

		}
	}



} 
// <applet code=CollegeForm width=600 height=700>
// </applet> 