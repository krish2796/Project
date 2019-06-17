/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mini.maingraph.Edge;
import mini.maingraph.Graph;

public class gui extends JFrame {
    
       private JLabel a0;
	private JTextField aa0;
	
	private JLabel a1;
	private JTextField aa1;
	
	private JLabel a2;
	private JTextField aa2;
	
	private JLabel a3;
	private JTextField aa3;
	
	private JLabel a4;
	private JTextField aa4;
	
	private JLabel a5;
	private JTextField aa5;
	
	private JLabel a6;
	private JTextField aa6;
	
	private JLabel a7;
	private JTextField aa7;
        
        private JLabel b0;
        public JTextField bb0;
        
         private JLabel b1;
        public JTextField bb1;
        
         private JLabel b2;
        public JTextField bb2;
        
        
        private JLabel b3;
        public JTextField bb3;
         
         private JLabel b4;
        public JTextField bb4;
        
        
         private JLabel b5;
        public JTextField bb5;
        
        
         private JLabel b6;
        public JTextField bb6;
        
        
         private JLabel b7;
        public JTextField bb7;
        
         private JLabel b8;
        public JTextField bb8;
        
         private JLabel b9;
        public JTextField bb9;
        
        
         private JLabel b10;
        public JTextField bb10;
        
        
         private JLabel b11;
        public JTextField bb11;
        
         private JLabel b12;
        public JTextField bb12;
        
         private JLabel b13;
        public JTextField bb13;
        
        private JLabel sourcepoint;
        public JTextField tsourcepoint;
        
        private JLabel endpoint;
        public JTextField tendpoint;
        
        private JButton submit;
        
        private int c1;
        private int c2;
        private int c3;
        private int c4;
        private int c5;
        private int c6;
        private int c7;
        private int c8;
        private int c9;
        private int c10;
        private int c11;
        private int c12;
        private int c13;
        private int c14;
        private int spoint;
        private int epoint;
	
	public gui() {
		
		super("Title");
		setLayout(new FlowLayout());
		
		a0 = new JLabel("0");
		add(a0);
		aa0 = new JTextField(15);
		add(aa0);
		
		a1 = new JLabel("1");
		add(a1);
		aa1 = new JTextField(15);
		add(aa1);
		
		a2 = new JLabel("2");
		add(a2);
		aa2 = new JTextField(15);
		add(aa2);
		
		a3 = new JLabel("3");
		add(a3);
		aa3 = new JTextField(15);
		add(aa3);
		
		a4 = new JLabel("4");
		add(a4);
		aa4 = new JTextField(15);
		add(aa4);
		
		a5 = new JLabel("5");
		add(a5);
		aa5 = new JTextField(15);
		add(aa5);
		
		a6 = new JLabel("6");
		add(a6);
		aa6 = new JTextField(15);
		add(aa6);
		
		a7 = new JLabel("7");
		add(a7);
		aa7 = new JTextField(15);
		
		
		add(aa7);
                
                
                b0 = new JLabel("city1 to city2");
                add(b0);
                bb0 = new JTextField(5);
                add(bb0);
                
                b1 = new JLabel("city2 to city3");
                add(b1);
                bb1 = new JTextField(5);
                add(bb1);
                
                b2 = new JLabel("city1 to ciy4");
                add(b2);
                bb2 = new JTextField(5);
                add(bb2);
                
                b3 = new JLabel("city1 to city5");
                add(b3);
                bb3 = new JTextField(5);
                add(bb3);
                
                 b4 = new JLabel("city2 to city4");
                add(b4);
                bb4 = new JTextField(5);
                add(bb4);
                
                b5 = new JLabel("city2 to city5");
                add(b5);
                bb5 = new JTextField(5);
                add(bb5);
                
                b6 = new JLabel("city2 to city6");
                add(b6);
                bb6 = new JTextField(5);
                add(bb6);
                
                
                b7 = new JLabel("city3 to city5");
                add(b7);
                bb7 = new JTextField(5);
                add(bb7);
                
                
                b8 = new JLabel("city4 to city6");
                add(b8);
                bb8= new JTextField(5);
                add(bb8);
                
                b9 = new JLabel("city5 to city6");
                add(b9);
                bb9 = new JTextField(5);
                add(bb9);
                
                
                b10 = new JLabel("city5 to city7");
                add(b10);
                bb10 = new JTextField(5);
                add(bb10);
                
                b11 = new JLabel("city5 to city8");
                add(b11);
                bb11 = new JTextField(5);
                add(bb11);
                
                b12 = new JLabel("city6 to city7");
                add(b12);
                bb12 = new JTextField(5);
                add(bb12);
                
                b13 = new JLabel("city7 to city8");
                add(b13);
                bb13 = new JTextField(5);
                add(bb13);
                
                
                
                sourcepoint = new JLabel("Start point");
                add(sourcepoint);
                tsourcepoint = new JTextField(5);
                add(tsourcepoint);
                
                endpoint = new JLabel("End point");
                add(endpoint);
                tendpoint = new JTextField(5);
                add(tendpoint);
                
                submit = new JButton("Submit");
                add(submit);
                
                
                
                thehandler handler = new thehandler();
        		aa0.addActionListener(handler);
        		aa1.addActionListener(handler);
        		aa2.addActionListener(handler);
        		aa3.addActionListener(handler);
        		aa4.addActionListener(handler);
        		aa5.addActionListener(handler);
        		aa6.addActionListener(handler);
        		aa7.addActionListener(handler);
                        bb0.addActionListener(handler);
                        bb1.addActionListener(handler);
                        bb2.addActionListener(handler);
                        bb3.addActionListener(handler);
                        bb4.addActionListener(handler);
                        bb5.addActionListener(handler);
                        bb6.addActionListener(handler);
                        bb7.addActionListener(handler);
                        bb8.addActionListener(handler);
                        bb9.addActionListener(handler);
                        bb10.addActionListener(handler);
                        bb11.addActionListener(handler);
                        bb12.addActionListener(handler);
                        bb13.addActionListener(handler);
                        submit.addActionListener(handler);
                        tsourcepoint.addActionListener(handler);
                        tendpoint.addActionListener(handler);
                        
	}
	
	public class thehandler implements ActionListener{
    	
		public void actionPerformed(ActionEvent event) {
			maingraph mg = new maingraph();
			if(event.getSource() == submit ){
				c1 = Integer.parseInt(bb0.getText());
				c2=Integer.parseInt(bb1.getText());
                c3=Integer.parseInt(bb2.getText());
                c4=Integer.parseInt(bb3.getText());
                c5=Integer.parseInt(bb4.getText());
                c6=Integer.parseInt(bb5.getText());
                c7=Integer.parseInt(bb6.getText());
                c8=Integer.parseInt(bb7.getText());
                c9=Integer.parseInt(bb8.getText());
                c10=Integer.parseInt(bb9.getText());
                c11=Integer.parseInt(bb10.getText());
                c12=Integer.parseInt(bb11.getText());
                c13=Integer.parseInt(bb12.getText());
                c14=Integer.parseInt(bb13.getText());
                
                spoint = Integer.parseInt(tsourcepoint.getText());
                epoint = Integer.parseInt(tendpoint.getText());
				
				
        
               // c1=Integer.parseInt(aa0.getText());
				
				Edge[] edges = {
					      new Edge(0, 1, c1), new Edge(1, 2, c2), new Edge(0, 3, c3),
					      new Edge(0, 4, c4), new Edge(1, 3, c5), new Edge(1, 4, c6),
					      new Edge(1, 5, c7), new Edge(2, 4, c8), new Edge(3, 5, c9),
					      new Edge(4, 5, c10), new Edge(4, 6, c11), new Edge(4, 7, c12),
					      new Edge(5, 6, c13), new Edge(6, 7, c14)
					    };
					    Graph g = new Graph(edges);
					    
					    int source = spoint;
					    g.calculateShortestDistances(source);
					    //int s = g.nodes[2].getDistanceFromSource();
					   int q =  g.printResult(source,epoint); 
					   JOptionPane.showMessageDialog(null,"Shortest path is "+q+"KM");
				
				
            	}
                }
		
        }
		
        
        
        
}

