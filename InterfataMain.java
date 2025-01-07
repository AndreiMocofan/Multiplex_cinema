import javax.swing.*;

//import InterfataTaburi.Chrono;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Timer;
//import java.util.TimerTask;

public class InterfataMain extends JApplet {
	   	/**
		 * 
		 */
	
		private static final long serialVersionUID = 1L;

		ResultSet resultset;
	public void init()
		{ 
		final InterfataMain test=new InterfataMain();// instanta a clasei
		Connection con1=test.getConnection();// se apleleaza conexiunea cu baza de date
		test.createTable(con1);//se creaza tabela parole daca nu exista
		test.query(con1);// obtine continutul tabelei
		
		final JTabbedPane tabbedPane = new JTabbedPane();
		setLayout(new GridLayout(1,1));
    	setSize(1000,500);
    	
    final ImageIcon icon = createImageIcon("images/movie.jpg");
    
    tabbedPane.addTab("Luni", icon, new InterfataZi("luni"));
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    
    tabbedPane.addTab("Marti", icon, new InterfataZi("marti"));
    tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

    tabbedPane.addTab("Miercuri", icon, new InterfataZi("miercuri"));
    tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
    
    tabbedPane.addTab("Joi", icon, new InterfataZi("joi"));
    tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
    
    tabbedPane.addTab("Vineri", icon, new InterfataZi("vineri"));
    tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
    
    tabbedPane.addTab("Sambata", icon, new InterfataZi("sambata"));
    tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);
    
    tabbedPane.addTab("Duminica", icon, new InterfataZi("duminica"));
    tabbedPane.setMnemonicAt(6, KeyEvent.VK_7);
    

    add(tabbedPane);
    
    //scroll tabs pt ferestre mici
    //necesar pt a vizualiza corect ferestrele mici
    tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    
    tabbedPane.addKeyListener(new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if ( e.getKeyCode() == KeyEvent.VK_F4 && e.isAltDown() && e.isControlDown()){
				String input = JOptionPane.showInputDialog(null, " Introduceti parola" );
				if ( input != null )
					if ( input.compareTo("Andrei") == 0 )
//					try{
//						if(resultset!=null)
//							while(resultset.next()){
//								if ( input.compareTo(resultset.getString(1)) == 0 )
								{
								    tabbedPane.addTab("Administrare", icon, new InterfataZi());
								    tabbedPane.setMnemonicAt(7, KeyEvent.VK_8);
									}
								else
									JOptionPane.showMessageDialog(null, "Gresit! (case sensitive)");
//							}
//							
//					}catch(SQLException ex){ex.printStackTrace();}
		    }
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
		}
		});
	this.repaint();
	
	int delay = 1000; //milliseconds

	ActionListener taskPerformer = new ActionListener() {
	  public void actionPerformed(ActionEvent evt) {
	    test.repaint();
	  }
	};

	new Timer(delay, taskPerformer).start();
	}


	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = InterfataMain.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}   	


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	    //obtinerea conexiunii 
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
	
	//crearea tabelului in cazul in care acesta nu exista 
	public void createTable(Connection con){
		try{
			Statement s=con.createStatement();
			s.execute("CREATE TABLE IF NOT EXISTS parole (parola varchar(20))");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	//selectarea tuturor parolelor posibile
	public void query(Connection con){
		try{
			PreparedStatement ps=con.prepareStatement("SELECT * FROM parole");
			ResultSet rs=ps.executeQuery();
			resultset=rs;
		}catch(SQLException e){e.printStackTrace();}
	}
	    
	public void start(){}
	
	}

	
