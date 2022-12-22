import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
/*<html> 
    <head> 
    </head> 
    <body bgcolor="000000"> 
        <center> 
            <applet 
                code = "factorial.class" 
                width = "300" 
                height = "200" 
                > 
            </applet> 
        </center> 
    </body> 
</html>*/
public class factorial extends Applet implements ActionListener 
{ 
    Label l1; 
    TextField t1,t2; 
    Button b1; 
    public void init() 
    { 
        setBackground(Color.pink); 
        setLayout(null); 
        l1=new Label("Enter Number"); 
        t1=new TextField(); 
        t2=new TextField(); 
        t2.setText("Factorial is "); 
        b1=new Button("Calculate Factorial"); 
        l1.setBounds(20,20,100,30); 
        l1.setBackground(Color.blue); 
        l1.setForeground(Color.white); 
        t1.setBounds(150,20,100,30); 
        t1.setBackground(Color.blue); 
        t1.setForeground(Color.white); 
        b1.setBounds(60,60,150,30); 
        b1.setBackground(Color.red); 
        b1.setForeground(Color.white); 
        t2.setBounds(40,100,150,30); 
        t2.setBackground(Color.pink); 
        add(l1); 
        add(t1);
        add(b1); 
        add(t2); 
        // t1.addActionListener(this); 
        b1.addActionListener(this); 
    } 

    public void actionPerformed(ActionEvent ae) 
    { 
        int a,f=1; 
        if(ae.getSource()==b1) 
        { 
            a=Integer.parseInt(t1.getText()); 
            if(a==0||a==1) 
                f=1; 
            else 
            { 
                for(int i=1;i<=a;i++) 
                    f=f*i; 
            } 
            t2.setText("Factorial is "+f); 
        } 
    } 
} 


 

 

 

 

