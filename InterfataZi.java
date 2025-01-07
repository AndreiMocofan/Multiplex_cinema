import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Timer;

public class InterfataZi extends JPanel implements ActionListener{
	/**
	 * 
	 */
	Connection con1=this.getConnection();
	final static boolean shouldWeightX = true;
	final static boolean shouldFill = true;
	final static boolean RIGHT_TO_LEFT = false;


	private static final long serialVersionUID = 1L;

	JTextField but=null,filmad,filmdel,ziad;
	JButton bAdaugare,bStergere,bUpdate ,butons1,butons2,butons3,butons4;
	JLabel flabel,filmlabel,zilabel,idlabel;
	JLabel filmidlabel;
	JPanel pane=new JPanel();
	int i=0,id_film;
	JComboBox sCombo1,sCombo2,sCombo3,sCombo4;
	String[] sali = { null,"Widescreen","Sala1", "Sala2", "Sala3", "Sala_3D" };
	GridBagConstraints c = new GridBagConstraints();
	public ResultSet rezset;


	

	public InterfataZi(String zi) {

		this.createTable(con1);
		this.query(con1, zi);
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}

		pane.setLayout(new GridBagLayout());


		if (shouldFill) {
			//natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		//    InterfataZi interfatazi= new InterfataZi(zi);
		//	
		//	Timer timer1 = new Timer();             // Get timer 1
		//	long delay1 = 10*1000; 
		//	timer1.schedule(new TaskThatRepaints(interfatazi), 0, delay1);
		
		add(pane);
		
		try{
			if(rezset!=null)
				while(rezset.next())
				{
					IncarcareFilme(pane,rezset.getInt(1),rezset.getString(2),rezset.getString(3),rezset.getString(4),rezset.getString(5),rezset.getString(6),rezset.getString(7));}
		}catch(SQLException e){e.printStackTrace();}

	}
	

	public void IncarcareFilme(Container pane, int id, String film,String zi,String sala1,String sala2,String sala3,String sala4){


		flabel=new JLabel(film);
		//flabel.setContentType("text/html");
		c.gridx = 1;
		c.gridy = i;
		pane.add(flabel, c);
		
		flabel = new JLabel("          ");
		//but.setVisible(false);
		c.gridx = 2;
		c.gridy = i;
		pane.add(flabel, c);

		flabel=new JLabel("14:00");
		c.gridx = 3;
		c.gridy = i;
		pane.add(flabel, c);

		butons1=new JButton(sala1);
		butons1.addActionListener(this);
		c.gridx = 4;
		c.gridy = i;
		pane.add(butons1, c);

		flabel=new JLabel("17:00");
		c.gridx = 5;
		c.gridy = i;
		pane.add(flabel, c);

		butons2=new JButton(sala2);
		butons2.addActionListener(this);
		c.gridx = 6;
		c.gridy = i;
		pane.add(butons2, c);

		flabel=new JLabel("20:00");
		c.gridx = 7;
		c.gridy = i;
		pane.add(flabel, c);


		butons3=new JButton(sala3);
		butons3.addActionListener(this);
		c.gridx = 8;
		c.gridy = i;
		pane.add(butons3, c);

		flabel=new JLabel("22:00");
		c.gridx = 9;
		c.gridy = i;
		pane.add(flabel, c);


		butons4=new JButton(sala4);
		butons4.addActionListener(this);
		c.gridx = 10;
		c.gridy = i;
		pane.add(butons4, c);

		i++;

	}
	
	public void IncarcareAdmin(Container pane, int id, String film,String zi,String sala1,String sala2,String sala3,String sala4){



		String idstring=Integer.toString(id);
		filmidlabel=new JLabel(idstring);
		c.gridx = 0;
		c.gridy = i;
		pane.add(filmidlabel, c);

		flabel=new JLabel(film);
		//flabel.setContentType("text/html");
		c.gridx = 1;
		c.gridy = i;
		pane.add(flabel, c);
		
		flabel=new JLabel(zi);
		//flabel.setContentType("text/html");
		c.gridx = 2;
		c.gridy = i;
		pane.add(flabel, c);

		flabel=new JLabel("14:00");
		c.gridx = 4;
		c.gridy = i;
		pane.add(flabel, c);

		butons1=new JButton(sala1);
		butons1.addActionListener(this);
		c.gridx = 5;
		c.gridy = i;
		pane.add(butons1, c);

		flabel=new JLabel("17:00");
		c.gridx = 6;
		c.gridy = i;
		pane.add(flabel, c);

		butons2=new JButton(sala2);
		butons2.addActionListener(this);
		c.gridx = 7;
		c.gridy = i;
		pane.add(butons2, c);

		flabel=new JLabel("20:00");
		c.gridx = 8;
		c.gridy = i;
		pane.add(flabel, c);

		butons3=new JButton(sala3);
		butons3.addActionListener(this);
		c.gridx = 9;
		c.gridy = i;
		pane.add(butons3, c);
		
		flabel=new JLabel("22:00");
		c.gridx = 10;
		c.gridy = i;
		pane.add(flabel, c);

		butons4=new JButton(sala4);
		butons4.addActionListener(this);
		c.gridx = 11;
		c.gridy = i;
		pane.add(butons4, c);
		
		i++;

	}
	
	public InterfataZi()
	{
		this.createTable(con1);
		this.queryAll(con1);
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}

		pane.setLayout(new GridBagLayout());


		if (shouldFill) {
			//natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		
		idlabel=new JLabel("id"); 
		c.gridx = 0;
		c.gridy = i;
		pane.add(idlabel, c);
		
		filmlabel=new JLabel("Film");
		c.gridx = 1;
		c.gridy = i;
		pane.add(filmlabel, c);
		
		zilabel=new JLabel("zi");
		c.gridx = 2;
		c.gridy = i;
		pane.add(zilabel, c);
		
		i=1;
		
		try{
			if(rezset!=null)
				while(rezset.next())
				{
					IncarcareAdmin(pane,rezset.getInt(1),rezset.getString(2),rezset.getString(3),rezset.getString(4),rezset.getString(5),rezset.getString(6),rezset.getString(7));}
		}catch(SQLException e){e.printStackTrace();}
	
		
		c.insets=new Insets(10,0,0,10);

		filmdel = new JTextField();
		c.gridx = 0;       
		c.gridy = i;       
		pane.add(filmdel, c);
		
		filmad = new JTextField();
		filmad.setSize(200,300);
		c.gridx = 1;       
		c.gridy = i;       
		pane.add(filmad, c);

		ziad = new JTextField();
		ziad.setSize(200,300);
		c.gridx = 2;       
		c.gridy = i;       
		pane.add(ziad, c);
		
		sCombo1=new JComboBox(sali);
		sCombo1.addActionListener(this);
		sCombo1.setEditable(true);
		c.gridx = 5;
		c.gridy = i;
		pane.add(sCombo1, c);
		
		sCombo2=new JComboBox(sali);
		sCombo2.addActionListener(this);
		sCombo2.setEditable(true);
		c.gridx = 7;
		c.gridy = i;
		pane.add(sCombo2, c);
		
		sCombo3=new JComboBox(sali);
		sCombo3.addActionListener(this);
		sCombo3.setEditable(true);
		c.gridx = 9;
		c.gridy = i;
		pane.add(sCombo3, c);
		
		sCombo4=new JComboBox(sali);
		sCombo4.addActionListener(this);
		sCombo4.setEditable(true);
		c.gridx = 11;
		c.gridy = i;
		pane.add(sCombo4, c);

		bStergere = new JButton("Stergere film");
		bStergere.addActionListener(this);
		c.gridx = 0;       
		c.gridy = i+1;       
		pane.add(bStergere, c);
		
		bAdaugare = new JButton("Adaugare film");
		bAdaugare.addActionListener(this);
		c.gridx = 1;       
		c.gridy = i+1;       
		pane.add(bAdaugare, c);
		pane.setFocusable(true);
		
		bUpdate = new JButton("Update Film");
		bUpdate.addActionListener(this);
		c.gridx = 2;       
		c.gridy = i+1;       
		pane.add(bUpdate, c);
		pane.setFocusable(true);


		add(pane);
	}	
		

	public void actionPerformed(ActionEvent evt1) {
		
		//adaugarea unui nou film cu toti parametrii tabelei
		if (evt1.getSource() == bAdaugare)  
		{
			try{
				int id_field= Integer.parseInt(filmdel.getText());	
				String s1=(String) sCombo1.getSelectedItem();
				String s2=(String) sCombo2.getSelectedItem();
				String s3=(String) sCombo3.getSelectedItem();
				String s4=(String) sCombo4.getSelectedItem();
				insert(con1,id_field,filmad.getText(),ziad.getText(),s1,s2,s3,s4);
			}catch(NumberFormatException e){e.printStackTrace();}
			pane.repaint();
		}

		//stergerea filmului in functie de id
		if (evt1.getSource() == bStergere)
			{try{
				int id_de_sters= Integer.parseInt(filmdel.getText());	
				deleterow(con1,id_de_sters);
		}catch(NumberFormatException e){e.printStackTrace();}
		pane.repaint();
		}
		
		//update filme in functie de IDul filmului
		if (evt1.getSource() == bUpdate)  
		{
			try{
				int id_field= Integer.parseInt(filmdel.getText());
				String s1=(String) sCombo1.getSelectedItem();
				String s2=(String) sCombo2.getSelectedItem();
				String s3=(String) sCombo3.getSelectedItem();
				String s4=(String) sCombo4.getSelectedItem();
				update(con1,id_field,filmad.getText(),ziad.getText(),s1,s2,s3,s4);
			}catch(NumberFormatException e){e.printStackTrace();}
			pane.repaint();
		}
		
		//accesul la salile filmelor prin butoane
		if (evt1.getSource() == butons1)  
		{
			if((butons1.getText()).compareTo("Widescreen")==0)
					new WideScreen();
			if((butons1.getText()).compareTo("Sala1")==0)
				new Sala1();
			if((butons1.getText()).compareTo("Sala2")==0)
				new Sala2();
			if((butons1.getText()).compareTo("Sala3")==0)
				new Sala3();
			if((butons1.getText()).compareTo("Sala_3D")==0)
				new Sala_3D();
		}
		
		if (evt1.getSource() == butons2)  
		{
			if((butons2.getText()).compareTo("widescreen")==0)
					new WideScreen();
			if((butons2.getText()).compareTo("Sala1")==0)
				new Sala1();
			if((butons2.getText()).compareTo("Sala2")==0)
				new Sala2();
			if((butons2.getText()).compareTo("Sala3")==0)
				new Sala3();
			if((butons2.getText()).compareTo("Sala_3D")==0)
				new Sala_3D();
		}
		
		if (evt1.getSource() == butons3)  
		{
			if((butons3.getText()).compareTo("widescreen")==0)
					new WideScreen();
			if((butons3.getText()).compareTo("Sala1")==0)
				new Sala1();
			if((butons3.getText()).compareTo("Sala2")==0)
				new Sala2();
			if((butons3.getText()).compareTo("Sala3")==0)
				new Sala3();
			if((butons3.getText()).compareTo("Sala_3D")==0)
				new Sala_3D();
		}
		
		if (evt1.getSource() == butons4)  
		{
			if((butons4.getText()).compareTo("widescreen")==0)
					new WideScreen();
			if((butons4.getText()).compareTo("Sala1")==0)
				new Sala1();
			if((butons4.getText()).compareTo("Sala2")==0)
				new Sala2();
			if((butons4.getText()).compareTo("Sala3")==0)
				new Sala3();
			if((butons4.getText()).compareTo("Sala_3D")==0)
				new Sala_3D();
		}
			
	}
	


	Connection getConnection(){
		Connection con=null;
		try{
			String driver="com.mysql.jdbc.Driver";//mentionarea driverului folosit
			Class.forName(driver).newInstance();
			//Stringul de logare la baza de date
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_multiplex?"+"user=root");
			if(!con.isClosed())
				System.out.println("JDBC s-a conectat la mysql");//conexiune reusita
		}catch(Exception e)
		{e.printStackTrace();}
		return con;
	}


	public void createTable(Connection con){
		try{
			Statement s=con.createStatement();
			s.execute("CREATE TABLE IF NOT EXISTS Filme(ID INTEGER NOT NULL AUTO_INCREMENT ,TITLU VARCHAR(50),ZI VARCHAR(10),SALA1 enum('Widescreen','Sala 3D','Sala1','Sala2','Sala3'),SALA2 enum('WideScreen','Sala 3D','Sala1','Sala2','Sala3'),SALA3 enum('WideScreen','Sala 3D','Sala1','Sala2','Sala3'),Sala4 enum('Widescreen','Sala 3D','Sala1','Sala2','Sala3'),UNIQUE (ID ))");
			//con.commit();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void insert(Connection con,int id,String numef,String zi,String sala1,String sala2, String sala3, String sala4){
		try{
			PreparedStatement ps=con.prepareStatement("INSERT INTO Filme VALUES ((?),(?),(?),(?),(?),(?),(?))");
			ps.setInt(1, id);
			ps.setString(2, numef);
			ps.setString(3,zi);
			ps.setString(4, sala1);
			ps.setString(5, sala2);
			ps.setString(6, sala3);
			ps.setString(7, sala4);
			ps.execute();
			//con.commit();
		}catch(SQLException e){e.printStackTrace();}
	}

	public void query(Connection con, String zi){
		try{
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Filme WHERE ZI=?");
			ps.setString(1, zi);
			ResultSet rs=ps.executeQuery();
			rezset=rs;
		}catch(SQLException e){e.printStackTrace();}
	}
	
	public void queryAll(Connection con){
		try{
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Filme");
			ResultSet rs=ps.executeQuery();
			rezset=rs;
		}catch(SQLException e){e.printStackTrace();}
	}

	public void deleterow(Connection con,int de_sters){
		try{
			PreparedStatement ps=con.prepareStatement("DELETE FROM Filme WHERE ID=?");
			ps.setInt(1, de_sters);
			ps.execute();
			//con.commit();
		}catch(SQLException e){e.printStackTrace();}
	}

	public void update(Connection con,int id,String numef,String zi, String sala1,String sala2, String sala3, String sala4){
		try{
			PreparedStatement ps=con.prepareStatement("UPDATE Filme SET titlu=?,zi=?,sala1=?,sala2=?,sala3=?,sala4=? WHERE ID=?");
			ps.setString(1, numef);
			ps.setString(2, zi);
			ps.setString(3, sala1);
			ps.setString(4, sala2);
			ps.setString(5, sala3);
			ps.setString(6, sala4);
			ps.setInt(7, id);
			ps.execute();
			//con.commit();
		}catch(SQLException e){e.printStackTrace();}
	}

}

