//
//  Clipper.java
//
//Created on Feb 17, 2017

//@author: Srinivas
//
//  Contributor:  Arjun Dass
//

///
// Object for performing clipping
//
///

public class clipper {

	public static byte code;
	
	class MyCoords {

	    float x;
	    float y;

	    public MyCoords() {
	        x = 0;
	        y = 0;
	    }

	    public MyCoords(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    void setX(float X) {
	        x = X;
	    }

	    void setY(float Y) {
	        y = Y;
	    }
	}
	
	 byte create(MyCoords temp, MyCoords lLeft, MyCoords rRight1) {

	        if (temp.y > rRight1.y) {
	            code = 8;
	            if (temp.x > rRight1.x) {
	                code += 2;
	            } else if (temp.x < lLeft.x) {
	                code++;
	            }
	        } else if (temp.y < lLeft.y) {
	            code = 4;
	            if (temp.x > rRight1.x) {
	                code += 2;
	            } else if (temp.x < lLeft.x) {
	                code++;
	            }
	        } else {
	            code = 0;
	            if (temp.x > rRight1.x) {
	                code += 2;
	            } else if (temp.x < lLeft.x) {
	                code++;
	            }
	        }
	        return code;
	    }
	
	 MyCoords intersection(MyCoords e1, MyCoords s1, MyCoords lLeft, MyCoords uRight, byte s2) {
	        MyCoords coordinatesIntersection = new MyCoords(s1.x, s1.y);

	        if ((s2 & 8) != 0) {           // code for top edge = 8  
	            if (s1.y - e1.y != 0) {
	                coordinatesIntersection.setX(e1.x + (s1.x - e1.x) * (uRight.y - e1.y) / (s1.y - e1.y));
	            } else {
	                coordinatesIntersection.setX(e1.x + (s1.x - e1.x) * (uRight.y - e1.y) / 1000000);
	            }
	            coordinatesIntersection.setY(uRight.y);
	        } else if ((s2 & 4) != 0) {      // code for bottom edge = 4 
	            if (s1.y - e1.y != 0) {
	                coordinatesIntersection.setX(e1.x + (s1.x - e1.x) * (lLeft.y - e1.y) / (s1.y - e1.y));
	            } else {
	                coordinatesIntersection.setX(e1.x + (s1.x - e1.x) * (lLeft.y - e1.y) / 1000000);
	            }
	            coordinatesIntersection.setY(lLeft.y);
	        } else if ((s2 & 2) != 0) {  // code for right edge = 2
	            if (s1.x - e1.x != 0) {
	                coordinatesIntersection.setY(e1.y + (s1.y - e1.y) * (uRight.x - e1.x) / (s1.x - e1.x));
	            } else {
	                coordinatesIntersection.setY(e1.y + (s1.y - e1.y) * (uRight.x - e1.x) / 1000000);
	            }
	            coordinatesIntersection.setX(uRight.x);
	        } else if ((s2 & 1) != 0) {  // code for left edge = 1
	            if (s1.x - e1.x != 0) {
	                coordinatesIntersection.setY(e1.y + (s1.y - e1.y) * (lLeft.x - e1.x) / (s1.x - e1.x));
	            } else {
	                coordinatesIntersection.setY(e1.y + (s1.y - e1.y) * (lLeft.x - e1.x / 1000000));
	            }
	            coordinatesIntersection.setX(lLeft.x);
	        }
	        
	        /*
	        
	        */
	        
	        return coordinatesIntersection;
	    }
	
    public int clipPolygon(int in, float insideX[], float insideY[], float outerX[],
            float outerY[], float x0, float y0, float x1, float y1)
    {
    	
    	int xLength = outerX.length;
        int yLength = outerX.length;
        int insideLengthX = insideX.length;
        int insideLengthY = insideX.length;
    	
    	float[] insideX1 = new float[xLength];
        float[] insideY1 = new float[yLength];

        int outputVerticesCount = 0;
        MyCoords uRight = new MyCoords(x1, y1);
        MyCoords lLeft = new MyCoords(x0, y0);
        MyCoords temp;
        MyCoords t1 = null;
        MyCoords t2 = null;

        System.arraycopy(insideX, 0, insideX1, 0, insideLengthX);
        System.arraycopy(insideY, 0, insideY1, 0, insideLengthY);

        byte s, e;

        for (byte a = 8; a >= 1; a /= 2) {

            if (in > 1) {
                t2 = new MyCoords(insideX1[in - 1], insideY1[in - 1]);
            }
            outputVerticesCount = 0;

            for (int i = 0; i < in; i++) {
                t1 = new MyCoords(insideX1[i], insideY1[i]);
                s = create(t2, lLeft, uRight);
                e = create(t1, lLeft, uRight);

                if ((e & a) != 0) {
                    if ((s & a) == 0) {
                        temp = intersection(t2, t1, lLeft, uRight, e);
                        outerX[outputVerticesCount] = temp.x;
                        outerY[outputVerticesCount++] = temp.y;
                    }
                } else {
                    if ((s & a) != 0) {
                        temp = intersection(t1, t2, lLeft, uRight, s);
                        outerX[outputVerticesCount] = temp.x;
                        outerY[outputVerticesCount++] = temp.y;
                    }
                    outerX[outputVerticesCount] = t1.x;
                    outerY[outputVerticesCount++] = t1.y;

                }

                t2 = t1;
            }

            System.arraycopy(outerX, 0, insideX1, 0, outputVerticesCount); System.arraycopy(outerY, 0, insideY1, 0, outputVerticesCount);
            
            in = outputVerticesCount;
        }
        return outputVerticesCount;  
    }

    

}
