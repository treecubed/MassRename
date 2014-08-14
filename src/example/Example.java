package example;

import java.io.File;

import javax.swing.*;
import javax.swing.border.*;

import net.iharder.dnd.FileDrop;

/**
 * A simple example showing how to use {@link FileDrop}
 * @author Robert Harder, rob@iharder.net
 */
public class Example {


    /** Runs a sample program that shows dropped files */
    public static void main( String[] args )
    {
        JFrame frame = new javax.swing.JFrame( "FileDrop" );
        TitledBorder dragBorder = new TitledBorder( "Drop 'em" );
        final JTextArea text = new JTextArea();
        frame.getContentPane().add( 
            new javax.swing.JScrollPane( text ), 
            java.awt.BorderLayout.CENTER );
        
        new FileDrop( System.out, text, dragBorder, new FileDrop.Listener()
        {   public void filesDropped( java.io.File[] files )
            {   for( int i = 0; i < files.length; i++ )
                {   try
                    {	text.append( files[i].getName() + "; \n     " );
                		text.append( files[i].getCanonicalPath() + "\n     " );
                		text.append( files[i].getParent() +File.separator +files[i].getName() + "\n     " );
                		text.append( files[i].getParent() + "\n\n" );
                    }   // end try
                    catch( java.io.IOException e ) {}
                }   // end for: through each dropped file
            }   // end filesDropped
        }); // end FileDrop.Listener

        frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }   // end main



}