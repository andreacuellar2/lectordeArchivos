/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.uesocc.tpi_2018.lectorarchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import objetos.Objeto;

/**
 *
 * @author andrea
 */
public class ManageFIle {
    public InputStream getFile() throws IOException {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream("archivos/archivo.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return is;   
    }

    public List<Objeto> leerCSV(InputStream is) {
        List<Objeto> lista = new ArrayList<Objeto>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        Objeto obj;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] objects = line.split(cvsSplitBy);
                obj = new Objeto();

                obj.setColum1(objects[0]);
                obj.setColum2(objects[1]);
                obj.setColum3(objects[2]);
                obj.setColum4(objects[3]);
                lista.add(obj);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

    }
}
