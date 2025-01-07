import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

	
	public class Sala1 extends JFrame implements ActionListener{
	
		private static final long serialVersionUID = 1L;
		
		final ImageIcon icon = createImageIcon("images/movie.jpg");
		Connection con=this.getConnection();
		public ResultSet resultset,results;
		
		JFrame f;
		JPanel pane1=new JPanel(), pane2=new JPanel();
		JPanel pane3=new JPanel();
		JLabel b;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
		JButton b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40;
		JButton b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56;
		JButton b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72;
		GridBagConstraints c = new GridBagConstraints();
		
		
		JTextField nume,telefon,loc;
		JLabel labelnume,labeltelefon,labelloc,labell;
		JButton inregistrare,cautare;

		public Sala1(){
			
			this.createTable(con);
			this.query(con);
			this.queryAll(con);
			/*
			 * JFrame.
			 */
			final JFrame f = new JFrame ("Frame");
		    f.setLayout(null);
		    f.setSize(800,1300);//marime
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//inchidere
		    f.setVisible(true);//set vizibil
			
			pane1.setLayout(new GridBagLayout());
			pane1.setBounds(100, -150, 800, 600);
			
			b1=new JButton("1");
			c.gridx = 4;
			c.gridy = 3;
			pane1.add(b1,c);
			b1.addActionListener(this);
			
			b2=new JButton("2");
			c.gridx = 5;
			c.gridy = 3;
			pane1.add(b2,c);
			b2.addActionListener(this);
			
			b3=new JButton("3");
			c.gridx = 6;
			c.gridy = 3;
			pane1.add(b3,c);
			b3.addActionListener(this);
			
			b4=new JButton("4");
			c.gridx = 7;
			c.gridy = 3;
			pane1.add(b4,c);
			b4.addActionListener(this);
			
			b5=new JButton("5");
			c.gridx = 8;
			c.gridy = 3;
			pane1.add(b5,c);
			b5.addActionListener(this);
			
			b6=new JButton("6");
			c.gridx = 10;
			c.gridy = 3;
			pane1.add(b6,c);
			b6.addActionListener(this);
			
			b7=new JButton("7");
			c.gridx = 11;
			c.gridy = 3;
			pane1.add(b7,c);
			b7.addActionListener(this);
			
			b8=new JButton("8");
			c.gridx = 12;
			c.gridy = 3;
			pane1.add(b8,c);
			b8.addActionListener(this);
			
			b9=new JButton("9");
			c.gridx = 13;
			c.gridy = 3;
			pane1.add(b9,c);
			b9.addActionListener(this);
			
			b10=new JButton("10");
			c.gridx = 14;
			c.gridy = 3;
			pane1.add(b10,c);
			b10.addActionListener(this);
			
			b11=new JButton("11");
			c.gridx = 4;
			c.gridy = 4;
			pane1.add(b11,c);
			b11.addActionListener(this);
			
			b12=new JButton("12");
			c.gridx = 5;
			c.gridy = 4;
			pane1.add(b12,c);
			b12.addActionListener(this);
			
			b13=new JButton("13");
			c.gridx = 6;
			c.gridy = 4;
			pane1.add(b13,c);
			b13.addActionListener(this);
			
			b14=new JButton("14");
			c.gridx = 7;
			c.gridy = 4;
			pane1.add(b14,c);
			b14.addActionListener(this);
			
			b15=new JButton("15");
			c.gridx = 8;
			c.gridy = 4;
			pane1.add(b15,c);
			b15.addActionListener(this);
			
			b16=new JButton("16");
			c.gridx = 10;
			c.gridy = 4;
			pane1.add(b16,c);
			b14.addActionListener(this);
			
			b17=new JButton("17");
			c.gridx = 11;
			c.gridy = 4;
			pane1.add(b17,c);
			b17.addActionListener(this);
			
			b18=new JButton("18");
			c.gridx = 12;
			c.gridy = 4;
			pane1.add(b18,c);
			b18.addActionListener(this);
			
			b19=new JButton("19");
			c.gridx = 13;
			c.gridy = 4;
			pane1.add(b19,c);
			b19.addActionListener(this);
			
			b20=new JButton("20");
			c.gridx = 14;
			c.gridy = 4;
			pane1.add(b20,c);
			b20.addActionListener(this);
			
			b21=new JButton("21");
			c.gridx = 4;
			c.gridy = 5;
			pane1.add(b21,c);
			b21.addActionListener(this);
			
			b22=new JButton("22");
			c.gridx = 5;
			c.gridy = 5;
			pane1.add(b22,c);
			b22.addActionListener(this);
			
			b23=new JButton("23");
			c.gridx = 6;
			c.gridy = 5;
			pane1.add(b23,c);
			b23.addActionListener(this);
			
			b24=new JButton("24");
			c.gridx = 7;
			c.gridy = 5;
			pane1.add(b24,c);
			b24.addActionListener(this);
			
			b25=new JButton("25");
			c.gridx = 8;
			c.gridy = 5;
			pane1.add(b25,c);
			b25.addActionListener(this);
			
			b26=new JButton("26");
			c.gridx = 10;
			c.gridy = 5;
			pane1.add(b26,c);
			b26.addActionListener(this);
			
			b27=new JButton("27");
			c.gridx = 11;
			c.gridy = 5;
			pane1.add(b27,c);
			b27.addActionListener(this);
			
			b28=new JButton("28");
			c.gridx = 12;
			c.gridy = 5;
			pane1.add(b28,c);
			b28.addActionListener(this);
			
			b29=new JButton("29");
			c.gridx = 13;
			c.gridy = 5;
			pane1.add(b29,c);
			b29.addActionListener(this);
			
			b30=new JButton("30");
			c.gridx = 14;
			c.gridy = 5;
			pane1.add(b30,c);
			b30.addActionListener(this);
			
			b31=new JButton("31");
			c.gridx = 4;
			c.gridy = 6;
			pane1.add(b31,c);
			b31.addActionListener(this);
			
			b32=new JButton("32");
			c.gridx = 5;
			c.gridy = 6;
			pane1.add(b32,c);
			b32.addActionListener(this);
			
			b33=new JButton("33");
			c.gridx = 6;
			c.gridy = 6;
			pane1.add(b33,c);
			b33.addActionListener(this);
			
			b34=new JButton("34");
			c.gridx = 7;
			c.gridy = 6;
			pane1.add(b34,c);
			b34.addActionListener(this);
			
			b35=new JButton("35");
			c.gridx = 8;
			c.gridy = 6;
			pane1.add(b35,c);
			b35.addActionListener(this);
			
			b36=new JButton("36");
			c.gridx = 10;
			c.gridy = 6;
			pane1.add(b36,c);
			b34.addActionListener(this);
			
			b37=new JButton("37");
			c.gridx = 11;
			c.gridy = 6;
			pane1.add(b37,c);
			b37.addActionListener(this);
			
			b38=new JButton("38");
			c.gridx = 12;
			c.gridy = 6;
			pane1.add(b38,c);
			b38.addActionListener(this);
			
			b39=new JButton("39");
			c.gridx = 13;
			c.gridy = 6;
			pane1.add(b39,c);
			b39.addActionListener(this);
			
			b40=new JButton("40");
			c.gridx = 14;
			c.gridy = 6;
			pane1.add(b40,c);
			b40.addActionListener(this);
			
			b41=new JButton("41");
			c.gridx = 4;
			c.gridy = 7;
			pane1.add(b41,c);
			b41.addActionListener(this);
			
			b42=new JButton("42");
			c.gridx = 5;
			c.gridy = 7;
			pane1.add(b42,c);
			b42.addActionListener(this);
			
			b43=new JButton("43");
			c.gridx = 6;
			c.gridy = 7;
			pane1.add(b43,c);
			b43.addActionListener(this);
			
			b44=new JButton("44");
			c.gridx = 7;
			c.gridy = 7;
			pane1.add(b44,c);
			b44.addActionListener(this);
			
			b45=new JButton("45");
			c.gridx = 8;
			c.gridy = 7;
			pane1.add(b45,c);
			b45.addActionListener(this);
			
			b46=new JButton("46");
			c.gridx = 10;
			c.gridy = 7;
			pane1.add(b46,c);
			b46.addActionListener(this);
			
			b47=new JButton("47");
			c.gridx = 11;
			c.gridy = 7;
			pane1.add(b47,c);
			b47.addActionListener(this);
			
			b48=new JButton("48");
			c.gridx = 12;
			c.gridy = 7;
			pane1.add(b48,c);
			b48.addActionListener(this);
			
			b49=new JButton("49");
			c.gridx = 13;
			c.gridy = 7;
			pane1.add(b49,c);
			b49.addActionListener(this);
			
			b50=new JButton("50");
			c.gridx = 14;
			c.gridy = 7;
			pane1.add(b50,c);
			b50.addActionListener(this);
			
			b51=new JButton("51");
			c.gridx = 4;
			c.gridy = 8;
			pane1.add(b51,c);
			b51.addActionListener(this);
			
			b52=new JButton("52");
			c.gridx = 5;
			c.gridy = 8;
			pane1.add(b52,c);
			b52.addActionListener(this);
			
			b53=new JButton("53");
			c.gridx = 6;
			c.gridy = 8;
			pane1.add(b53,c);
			b53.addActionListener(this);
			
			b54=new JButton("54");
			c.gridx = 7;
			c.gridy = 8;
			pane1.add(b54,c);
			b54.addActionListener(this);
			
			b55=new JButton("55");
			c.gridx = 8;
			c.gridy = 8;
			pane1.add(b55,c);
			b55.addActionListener(this);
			
			b56=new JButton("56");
			c.gridx = 10;
			c.gridy = 8;
			pane1.add(b56,c);
			b56.addActionListener(this);
			
			b57=new JButton("57");
			c.gridx = 11;
			c.gridy = 8;
			pane1.add(b57,c);
			b57.addActionListener(this);
			
			b58=new JButton("58");
			c.gridx = 12;
			c.gridy = 8;
			pane1.add(b58,c);
			b58.addActionListener(this);
			
			b59=new JButton("59");
			c.gridx = 13;
			c.gridy = 8;
			pane1.add(b59,c);
			b59.addActionListener(this);
			
			b60=new JButton("60");
			c.gridx = 14;
			c.gridy = 8;
			pane1.add(b60,c);
			b60.addActionListener(this);
			
			b61=new JButton("61");
			c.gridx = 4;
			c.gridy = 9;
			pane1.add(b61,c);
			b61.addActionListener(this);
			
			b62=new JButton("62");
			c.gridx = 5;
			c.gridy = 9;
			pane1.add(b62,c);
			b62.addActionListener(this);
			
			b63=new JButton("63");
			c.gridx = 6;
			c.gridy = 9;
			pane1.add(b63,c);
			b63.addActionListener(this);
			
			b64=new JButton("64");
			c.gridx = 7;
			c.gridy = 9;
			pane1.add(b64,c);
			b64.addActionListener(this);
			
			b65=new JButton("65");
			c.gridx = 8;
			c.gridy = 9;
			pane1.add(b65,c);
			b65.addActionListener(this);
			
			b66=new JButton("66");
			c.gridx = 10;
			c.gridy = 9;
			pane1.add(b66,c);
			b66.addActionListener(this);
			
			b67=new JButton("67");
			c.gridx = 11;
			c.gridy = 9;
			pane1.add(b67,c);
			b67.addActionListener(this);
			
			b68=new JButton("68");
			c.gridx = 12;
			c.gridy = 9;
			pane1.add(b68,c);
			b68.addActionListener(this);
			
			b69=new JButton("69");
			c.gridx = 13;
			c.gridy = 9;
			pane1.add(b69,c);
			b69.addActionListener(this);
			
			b70=new JButton("70");
			c.gridx = 14;
			c.gridy = 9;
			pane1.add(b70,c);
			b70.addActionListener(this);
			
			b=new JLabel("         ECRAN         ");
			c.gridx = 8;
			c.gridy = 0;
			c.gridwidth=2;
			pane1.add(b,c);
			
			b=new JLabel(" ");
			c.gridx = 0;
			c.gridy = 1;
			pane1.add(b,c);
			
			b=new JLabel(" ");
			c.gridx = 0;
			c.gridy = 2;
			pane1.add(b,c);
				
			try{
				if(resultset!=null)
					while(resultset.next())
						{Stare_loc(b1,resultset.getInt(1));
						Stare_loc(b2,resultset.getInt(1));
						Stare_loc(b3,resultset.getInt(1));
						Stare_loc(b4,resultset.getInt(1));
						Stare_loc(b5,resultset.getInt(1));
						Stare_loc(b6,resultset.getInt(1));
						Stare_loc(b7,resultset.getInt(1));
						Stare_loc(b8,resultset.getInt(1));
						Stare_loc(b9,resultset.getInt(1));
						Stare_loc(b10,resultset.getInt(1));
						Stare_loc(b11,resultset.getInt(1));
						Stare_loc(b12,resultset.getInt(1));
						Stare_loc(b13,resultset.getInt(1));
						Stare_loc(b14,resultset.getInt(1));
						Stare_loc(b15,resultset.getInt(1));
						Stare_loc(b16,resultset.getInt(1));
						Stare_loc(b17,resultset.getInt(1));
						Stare_loc(b18,resultset.getInt(1));
						Stare_loc(b19,resultset.getInt(1));
						Stare_loc(b20,resultset.getInt(1));
						Stare_loc(b21,resultset.getInt(1));
						Stare_loc(b22,resultset.getInt(1));
						Stare_loc(b23,resultset.getInt(1));
						Stare_loc(b24,resultset.getInt(1));
						Stare_loc(b25,resultset.getInt(1));
						Stare_loc(b26,resultset.getInt(1));
						Stare_loc(b27,resultset.getInt(1));
						Stare_loc(b28,resultset.getInt(1));
						Stare_loc(b29,resultset.getInt(1));
						Stare_loc(b30,resultset.getInt(1));
						Stare_loc(b31,resultset.getInt(1));
						Stare_loc(b32,resultset.getInt(1));
						Stare_loc(b33,resultset.getInt(1));
						Stare_loc(b34,resultset.getInt(1));
						Stare_loc(b35,resultset.getInt(1));
						Stare_loc(b36,resultset.getInt(1));
						Stare_loc(b37,resultset.getInt(1));
						Stare_loc(b38,resultset.getInt(1));
						Stare_loc(b39,resultset.getInt(1));
						Stare_loc(b40,resultset.getInt(1));
						Stare_loc(b41,resultset.getInt(1));
						Stare_loc(b42,resultset.getInt(1));
						Stare_loc(b43,resultset.getInt(1));
						Stare_loc(b44,resultset.getInt(1));
						Stare_loc(b45,resultset.getInt(1));
						Stare_loc(b46,resultset.getInt(1));
						Stare_loc(b47,resultset.getInt(1));
						Stare_loc(b48,resultset.getInt(1));
						Stare_loc(b49,resultset.getInt(1));
						Stare_loc(b50,resultset.getInt(1));
						Stare_loc(b51,resultset.getInt(1));
						Stare_loc(b52,resultset.getInt(1));
						Stare_loc(b53,resultset.getInt(1));
						Stare_loc(b54,resultset.getInt(1));
						Stare_loc(b55,resultset.getInt(1));
						Stare_loc(b56,resultset.getInt(1));
						Stare_loc(b57,resultset.getInt(1));
						Stare_loc(b58,resultset.getInt(1));
						Stare_loc(b59,resultset.getInt(1));
						Stare_loc(b60,resultset.getInt(1));
						Stare_loc(b61,resultset.getInt(1));
						Stare_loc(b62,resultset.getInt(1));
						Stare_loc(b63,resultset.getInt(1));
						Stare_loc(b64,resultset.getInt(1));
						Stare_loc(b65,resultset.getInt(1));
						Stare_loc(b66,resultset.getInt(1));
						Stare_loc(b67,resultset.getInt(1));
						Stare_loc(b68,resultset.getInt(1));
						Stare_loc(b69,resultset.getInt(1));
						Stare_loc(b70,resultset.getInt(1));
						pane1.repaint();}
				}catch(SQLException e){e.printStackTrace();}
				
				
			f.add(pane1);
			
			
			pane1.repaint();
			
			pane2.setBounds(100, 450, 800, 100);
			
			labelloc=new JLabel("Loc");
			loc=new JTextField("",10);
			labelnume=new JLabel("Nume");
			nume=new JTextField("",10);
			labeltelefon=new JLabel("Telefon");
			telefon=new JTextField("",10);
			inregistrare=new JButton("Inregistrare");
			inregistrare.addActionListener(this);
			
			pane2.add(labelloc);
			pane2.add(loc);
			pane2.add(labelnume);
			pane2.add(nume);
			pane2.add(labeltelefon);
			pane2.add(telefon);
			pane2.add(inregistrare);
			
			f.add(pane2);
			
			pane3.setLayout(new GridBagLayout());
			pane3.setBounds(100, 550, 800, 400);
			
			
			KeyStroke F4KeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0, false);
		    Action F4Action = new AbstractAction() {
		         public void actionPerformed(ActionEvent e) {
		        	 String input = JOptionPane.showInputDialog(null, " Introduceti parola" );
	    				if ( input != null )
	    					if ( input.compareTo("Andrei") == 0 )
	    					{		    						
	    						int i=1;
	    						try{
	    						if(results!=null)
	    							while(results.next()){	    								
	    									labell=new JLabel(Integer.toString(results.getInt(1)));
	    									c.gridx = 1;
	    									c.gridy = i;
	    									pane3.add(labell,c);
	    									labell=new JLabel("                       ");
	    									c.gridx = 2;
	    									c.gridy = i;
	    									pane3.add(labell,c);
	    									labell=new JLabel(results.getString(3));
	    									c.gridx = 3;
	    									c.gridy = i;
	    									pane3.add(labell,c);
	    									labell=new JLabel(results.getString(4));
	    									c.gridx = 4;
	    									c.gridy = i;
	    									pane3.add(labell,c);
	    									i++;
	    									}																
	    						}catch(SQLException ex){ex.printStackTrace();}
	    						}
	    					else
								JOptionPane.showMessageDialog(null, "Gresit! (case sensitive)");
		         }
		    };
		    f.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(F4KeyStroke, "F4");
		    f.getRootPane().getActionMap().put("F4", F4Action);	
	    pane3.repaint();				
		f.add(pane3); 
		f.revalidate();
		f.repaint();
		}
		
		public void actionPerformed(ActionEvent evt1) {
			if (evt1.getSource() == inregistrare)  
			{
				try{
					int loc_field= Integer.parseInt(loc.getText());	
					update(con,loc_field,nume.getText(),telefon.getText());
				}catch(NumberFormatException e){e.printStackTrace();}
				new Sala1();}
			
			}
		

		
		
		public void Stare_loc(JButton but,int nr_loc){
			String idstring=Integer.toString(nr_loc);
			if(but.getText().compareTo(idstring)==0)
				but.setBackground(Color.red);
		}

		public static void main(String[] args){ 
			new Sala1();
		}
		
		
		Connection getConnection(){
    		Connection con=null;
    		try{
    			String driver="com.mysql.jdbc.Driver";
    			Class.forName(driver).newInstance();

    			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_multiplex?"+"user=root");
    			if(!con.isClosed())
    				System.out.println("JDBC s-a conectat la mysql");
    		}catch(Exception e)
    		{e.printStackTrace();}
    		return con;
    	}
		
		public void createTable(Connection con){
			try{//creare tabela daca nu exista
				Statement s=con.createStatement();
				s.execute("CREATE TABLE IF NOT EXISTS Sala1(loc INTEGER NOT NULL AUTO_INCREMENT ,stare enum('liber','ocupat'),nume varchar(40),telefon varchar(20),UNIQUE (loc))");
				//verificare daca tabela este goala, daca da adauga atatea inregistrari care locuri are sala
				ResultSet rs=s.executeQuery("select count(*) from Sala1");
				rs.next();
				int row_count = rs.getInt(1);
				if(row_count==0)
					for(int i=1;i<=70;i++)
					{
						PreparedStatement ps1=con.prepareStatement("INSERT INTO Sala1 (stare) values (?)");
						ps1.setString(1, "liber");
						ps1.execute();
					}
				//con.commit();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
    	public void queryAll(Connection con){
    		try{
    			PreparedStatement ps=con.prepareStatement("SELECT * FROM Sala1 where stare='ocupat' order by nume");
    			ResultSet rs=ps.executeQuery();
    			results=rs;
    			}catch(SQLException e){e.printStackTrace();}
    	}
		
    	public void query(Connection con){
    		try{
    			PreparedStatement ps=con.prepareStatement("SELECT * FROM Sala1 where stare=?");
    			ps.setString(1, "ocupat");
    			ResultSet rs=ps.executeQuery();
    			resultset=rs;
    			}catch(SQLException e){e.printStackTrace();}
    	}
    	
    	public void queryname(Connection con,String name){
    		try{
    			PreparedStatement ps=con.prepareStatement("SELECT * FROM Sala1 where name=?");
    			ps.setString(1, name);
    			ResultSet rs=ps.executeQuery();
    			resultset=rs;
    			}catch(SQLException e){e.printStackTrace();}
    	}
    	
    	public void update(Connection con,int loc,String nume, String telefon){
    		try{
    			PreparedStatement ps=con.prepareStatement("UPDATE Sala1 SET stare=?,nume=?,telefon=? WHERE loc=?");
    			ps.setString(1, "ocupat");
    			ps.setString(2, nume);
    			ps.setString(3, telefon);
    			ps.setInt(4, loc);
    			ps.execute();
    			//con.commit();
    		}catch(SQLException e){e.printStackTrace();}
    	}
    	
    	protected static ImageIcon createImageIcon(String path) {
    		java.net.URL imgURL = InterfataMain.class.getResource(path);
    		if (imgURL != null) {
    			return new ImageIcon(imgURL);
    		} else {
    			System.err.println("Couldn't find file: " + path);
    			return null;
    		}
    	}
	
	}

