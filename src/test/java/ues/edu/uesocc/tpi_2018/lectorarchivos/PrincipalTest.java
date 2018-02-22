/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.uesocc.tpi_2018.lectorarchivos;

import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Objeto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrea
 */
public class PrincipalTest {
    
    public PrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Principal.
     */
    @Test
    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Principal.main(args);
         try {
            ManageFIle mf = new ManageFIle();
            InputStream is = mf.getFile();
            List<Objeto> lista = mf.leerCSV(is);
            
            for (Objeto obj: lista) {
                System.out.println("Objeto: " + obj.getColum1() + obj.getColum2());
            }

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
