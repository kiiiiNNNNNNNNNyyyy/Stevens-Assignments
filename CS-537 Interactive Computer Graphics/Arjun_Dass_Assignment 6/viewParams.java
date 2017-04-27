//
//  viewParams.java
//
//  Simple class for setting up the viewing and projection transforms
//  for the Transformation Assignment.
//
//  Students are to complete this class.
//

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.fixedfunc.*;

public class viewParams
{
    // current values for transformations
    private float rotateData[];
    private float translateData[];
    private float scaleData[];

    // current view values
    private float eyeData[];
    private float lookData[];
    private float upData[];

    // clipping window boundaries
    private float left = -1.0f;
    private float right = 1.0f;
    private float top = 1.0f;
    private float bottom = -1.0f;
    private float near = 0.9f;
    private float far = 4.5f;

    /**
     * constructor
     */
    public viewParams()
    {
        rotateData = new float[3];
        rotateData[0] = 0.0f;
        rotateData[1] = 0.0f;
        rotateData[2] = 0.0f;
        translateData = new float[3];
        translateData[0] = 0.0f;
        translateData[1] = 0.0f;
        translateData[2] = 0.0f;
        scaleData = new float[3];
        scaleData[0] = 0.0f;
        scaleData[1] = 0.0f;
        scaleData[2] = 0.0f;
        eyeData = new float[3];
        eyeData[0] = 0.0f;
        eyeData[1] = 0.0f;
        eyeData[2] = 0.0f;
        lookData = new float[3];
        lookData[0] = 0.0f;
        lookData[1] = 0.0f;
        lookData[2] = 0.0f;
        upData = new float[3];
        upData[0] = 0.0f;
        upData[1] = 0.0f;
        upData[2] = 0.0f;
    }


    /**
     * Common code to set up projections
     */

    private void commonProjection( int program, GL3 gl3 ) {
        int leftLoc = gl3.glGetUniformLocation( program , "left" );
        int rightLoc = gl3.glGetUniformLocation( program , "right" );
        int topLoc = gl3.glGetUniformLocation( program , "top" );
        int bottomLoc = gl3.glGetUniformLocation( program , "bottom" );
        int nearLoc = gl3.glGetUniformLocation( program , "near" );
        int farLoc = gl3.glGetUniformLocation( program , "far" );

        gl3.glUniform1f( leftLoc, left );
        gl3.glUniform1f( rightLoc, right );
        gl3.glUniform1f( topLoc, top );
        gl3.glUniform1f( bottomLoc, bottom );
        gl3.glUniform1f( nearLoc, near );
        gl3.glUniform1f( farLoc, far );
    }


    /**
     * This function sets up the view and projection parameter for a frustum
     * projection of the scene. See the assignment description for the values
     * for the projection parameters.
     *
     * You will need to write this function, and maintain all of the values
     * needed to be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     *
     */
    public void setUpFrustum( int program, GL3 gl3 )
    {
        // Add your code here.
        commonProjection( program, gl3 );
        int doOrtho = gl3.glGetUniformLocation( program , "doOrtho" );
        gl3.glUniform1i( doOrtho, 0 );
    }


    /**
     * This function sets up the view and projection parameter for an
     * orthographic projection of the scene. See the assignment description
     * for the values for the projection parameters.
     *
     * You will need to write this function, and maintain all of the values
     * needed to be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     *
     */
    public void setUpOrtho( int program, GL3 gl3 )
    {
        // Add your code here.
        commonProjection( program, gl3 );
        int doOrtho = gl3.glGetUniformLocation( program , "doOrtho" );
        gl3.glUniform1i( doOrtho, 1 );
    }


    /**
     * This function clears any transformations, setting the values to the
     * defaults: no scaling (scale factor of 1), no rotation (degree of
     * rotation = 0), and no translation (0 translation in each direction).
     *
     * You will need to write this function, and maintain all of the values
     * which must be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     */
    public void clearTransforms( int program, GL3 gl3 )
    {
        // reset the global data structures and send to the shader
        // scale( 1, 1, 1 )
        // rotate( 0, 0, 0 )
        // translate( 0, 0, 0 )
        setUpTransforms( program, gl3,
            1.0f, 1.0f, 1.0f,
            0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f );
    }


    /**
     * This function sets up the transformation parameters for the vertices
     * of the teapot.  The order of application is specified in the driver
     * program.
     *
     * You will need to write this function, and maintain all of the values
     * which must be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     * @param xScale - amount of scaling along the x-axis
     * @param yScale - amount of scaling along the y-axis
     * @param zScale - amount of scaling along the z-axis
     * @param xRotate - angle of rotation around the x-axis, in degrees
     * @param yRotate - angle of rotation around the y-axis, in degrees
     * @param zRotate - angle of rotation around the z-axis, in degrees
     * @param xTranslate - amount of translation along the x axis
     * @param yTranslate - amount of translation along the y axis
     * @param zTranslate - amount of translation along the z axis
     */
    public void setUpTransforms( int program, GL3 gl3,
        float xScale, float yScale, float zScale,
        float xRotate, float yRotate, float zRotate,
        float xTranslate, float yTranslate, float zTranslate )
    {
        int thetaLoc = gl3.glGetUniformLocation( program , "theta" );
        int transLoc = gl3.glGetUniformLocation( program , "trans" );
        int scaleLoc = gl3.glGetUniformLocation( program , "scale" );

        // update the globals
        scaleData[0]     = xScale;
        scaleData[1]     = yScale;
        scaleData[2]     = zScale;
        rotateData[0]    = xRotate;
        rotateData[1]    = yRotate;
        rotateData[2]    = zRotate;
        translateData[0] = xTranslate;
        translateData[1] = yTranslate;
        translateData[2] = zTranslate;

        // send down to the shader
        gl3.glUniform3fv( thetaLoc, 1, rotateData, 0 );
        gl3.glUniform3fv( transLoc, 1, translateData, 0 );
        gl3.glUniform3fv( scaleLoc, 1, scaleData, 0 );
    }


    /**
     * This function clears any changes made to camera parameters, setting the
     * values to the defaults: eyepoint (0.0,0.0,0.0), lookat (0,0,0.0,-1.0),
     * and up vector (0.0,1.0,0.0).
     *
     * You will need to write this function, and maintain all of the values
     * which must be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     */
    void clearCamera( int program, GL3 gl3 )
    {
        setUpCamera( program, gl3,
            0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 1.0f, 0.0f );
    }


    /**
     * This function sets up the camera parameters controlling the viewing
     * transformation.
     *
     * You will need to write this function, and maintain all of the values
     * which must be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     * @param eyepointX - x coordinate of the camera location
     * @param eyepointY - y coordinate of the camera location
     * @param eyepointZ - z coordinate of the camera location
     * @param lookatX - x coordinate of the lookat point
     * @param lookatY - y coordinate of the lookat point
     * @param lookatZ - z coordinate of the lookat point
     * @param upX - x coordinate of the up vector
     * @param upY - y coordinate of the up vector
     * @param upZ - z coordinate of the up vector
     */
    void setUpCamera( int program, GL3 gl3,
        float eyepointX, float eyepointY, float eyepointZ,
        float lookatX, float lookatY, float lookatZ,
        float upX, float upY, float upZ )
    {
        int posLoc = gl3.glGetUniformLocation( program, "cPosition" );
        int lookLoc = gl3.glGetUniformLocation( program, "cLookAt" );
        int upVecLoc = gl3.glGetUniformLocation( program, "cUp" );

        // update the globals
        eyeData[0]  = eyepointX;
        eyeData[1]  = eyepointY;
        eyeData[2]  = eyepointZ;
        lookData[0] = lookatX;
        lookData[1] = lookatY;
        lookData[2] = lookatZ;
        upData[0]   = upX;
        upData[1]   = upY;
        upData[2]   = upZ;

        // send down to the shader
        gl3.glUniform3fv( posLoc, 1, eyeData, 0 );
        gl3.glUniform3fv( lookLoc, 1, lookData, 0 );
        gl3.glUniform3fv( upVecLoc, 1, upData, 0 );
    }

}
