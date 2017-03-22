
import java.awt.*;
import java.awt.event.*;

public class midtermMain implements KeyListener, MouseListener {
	
	static public void main(String[] args){
		
        midtermMain M = new midtermMain (drawWidth, drawHeight);
		M.D.addKeyListener (M);
		M.D.addMouseListener (M);
		M.doDraw();

		
        Frame f = new Frame( "Arjun Dass Mid-Term Project" );
        f.add("Center", M.D);
		f.pack();
		f.setResizable (false);
        f.setVisible(true);
		
	}
	
	private cg1Canvas D;
	private int displayNumber = 1;
    
    private int tri;
    private int sq;
    private int oc;
    private int st;
	
	private static int drawHeight = 500;
	private static int drawWidth = 500;
	
	midtermMain (int w, int h)
	{
       
		D = new cg1Canvas (w, h);
        
        float x[] = new float [10];
        float y[] = new float [10];
        
        x[0] = 25.0f; y[0] = 125.0f;
		x[1] = 75.0f; y[1] = 125.0f;
		x[2] = 50.0f; y[2] = 175.0f;
        tri = D.addPoly (x, y, 3);
        
        x[0] = 125.0f; y[0] = 125.0f;
		x[1] = 175.0f; y[1] = 125.0f;
		x[2] = 175.0f; y[2] = 175.0f;
		x[3] = 125.0f; y[3] = 175.0f;
        sq = D.addPoly (x, y, 4);
        
        x[0] = 25.0f; y[0] = 25.0f;
		x[1] = 35.0f; y[1] = 15.0f;
		x[2] = 55.0f; y[2] = 15.0f;
		x[3] = 75.0f; y[3] = 25.0f;
		x[4] = 75.0f; y[4] = 55.0f;
		x[5] = 55.0f; y[5] = 75.0f;
		x[6] = 35.0f; y[6] = 75.0f;
		x[7] = 25.0f; y[7] = 55.0f;
        oc = D.addPoly (x, y, 8);
        
        x[0] = 150.0f; y[0] = 90.0f;
		x[1] = 140.0f; y[1] = 65.0f;
		x[2] = 110.0f; y[2] = 65.0f;
		x[3] = 140.0f; y[3] = 40.0f;
		x[4] = 110.0f; y[4] = 10.0f;
		x[5] = 150.0f; y[5] = 25.0f;
		x[6] = 190.0f; y[6] = 10.0f;
		x[7] = 160.0f; y[7] = 40.0f;
		x[8] = 190.0f; y[8] = 65.0f;
		x[9] = 160.0f; y[9] = 65.0f;
        st = D.addPoly (x, y, 10);
        
        
	}
	
	
	public void keyTyped(KeyEvent e)
	{
		char key = e.getKeyChar();
		
		if ((key == 'C') || (key == 'c')) displayNumber = 2; // clip
		if ((key == 'P') || (key == 'p')) displayNumber = 1; // polygon
		if ((key == 'T') || (key == 't')) displayNumber = 3; // transform
		if ((key == 'V') || (key == 'v')) displayNumber = 0; // viewport
		
		if ((key == 'Q') || (key == 'q')) System.exit(0); // quit
		
		
		doDraw();
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
	
	// Because we are a MouseListener
	public void mouseClicked(MouseEvent e)
	{
		displayNumber++;
		doDraw();
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	
	private void drawPolys(  ) {
		
		D.clearTransform();
		D.setColor( 0.2f, 0.5f, 0.4f );
        D.draw (tri);

		D.setColor( 0.0f, 1.0f, 0.6f );
        D.draw (sq);
		
		D.setColor( 0.6f, 0.2f, 0.8f );
        D.draw (oc);
		
		D.setColor( 0.1f, 1.0f, 0.1f );
		D.draw (st);
	}
	
	private void drawTPolys(  ) {
		
		D.clearTransform();
        D.rotate (-25.0f);
		D.setColor( 0.1f, 1.0f, 0.1f );
        D.draw (tri);
		
        D.clearTransform();
		D.translate (80.0f, 75.0f);
        D.setColor( 0.6f, 0.2f, 0.8f );
        D.draw (sq);   

		D.clearTransform();
		D.scale (0.75f, 0.5f);
        D.setColor( 0.0f, 1.0f, 0.6f);
        D.draw (oc);
		
		D.clearTransform();
		D.translate (50.0f, 50.0f);
		D.scale (2.0f, 2.0f);
		D.rotate (-10.0f);
		D.translate (-50.0f, 50.0f);
		D.setColor(0.2f, 0.5f, 0.4f );
		D.draw (st);
	}
	
	public void doDraw()
	{

		D.setColor ( 0.0f, 0.0f, 0.0f );
        D.clear();

		if ( (displayNumber % 4) == 1) {
			
			D.setClipWindow( 0.0f, 500.0f, 0.0f, 500.0f );
			
			D.setViewport( 0, 0, drawWidth, drawHeight );
			
			drawPolys();
		}
		else if ( (displayNumber % 4) == 2) {
			
			D.setClipWindow( 35.0f, 175.0f, 35.0f, 165.0f );
			
			D.setViewport( 0, 0, drawWidth, drawHeight );
			
			drawPolys();
			
		}
		else if ( (displayNumber % 4) == 3) {
	
			D.setClipWindow( 0.0f, 500.0f, 0.0f, 500.0f );
			
			D.setViewport( 0, 0, drawWidth, drawHeight );
			
			drawTPolys();
		}
		
		else  {
			D.setClipWindow( 0.0f, 500.0f, 0.0f, 500.0f );

			int wdiff = drawWidth / 5;
			int hdiff = drawHeight / 5;
			int x = 0;
			int y = 0;
			int i,j;
			for (i=0; i < 5; i++) {
				D.setViewport (x, y, wdiff, hdiff);
				drawPolys();
				y+= hdiff;
				x+= wdiff;
			}
		}
		
		D.repaint();
		
	}
        
}
