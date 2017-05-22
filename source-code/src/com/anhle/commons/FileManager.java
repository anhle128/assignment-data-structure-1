package com.anhle.commons;

import com.anhle.models.Entity;
import com.google.gson.Gson;
import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;

import java.io.IOException;



/**
 * Created by anhle on 5/15/17.
 */
public class FileManager {

    public static void SaveData(String filePath,Entity entities) throws IOException{
        Gson gson = new Gson();
//        gson.toJson(entities, new FileWriter(filePath));     
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( filePath));
            writer.write( gson.toJson(entities));

        }
        catch ( IOException e)
        {
        }
        finally
        {
            try
            {
                if ( writer != null)
                writer.close( );
            }
            catch ( IOException e)
            {
            }
        }
//        FileOutputStream fout = null;
//        ObjectOutputStream oos = null;
//
//        try {
//
//            fout = new FileOutputStream(filePath);
//            oos = new ObjectOutputStream(fout);
//            oos.writeObject(entities);
////            oos.writeChars(gson);
//
//            System.out.println("Done");
//
//        } catch (Exception ex) {
//
//            ex.printStackTrace();
//
//        } finally {
//
//            if (fout != null) {
//                try {
//                    fout.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
    }

    public static Entity LoadData(String filePath) throws FileNotFoundException{
        Gson gson = new Gson();
        Entity result = gson.fromJson(new FileReader(filePath), Entity.class);
        return result;
//        Entity entities = null;
//
//        FileInputStream fin = null;
//        ObjectInputStream ois = null;
//
//        try {
//
//            fin = new FileInputStream(filePath);
//            ois = new ObjectInputStream(fin);
//            entities = (Entity) ois.readObject();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//
//            if (fin != null) {
//                try {
//                    fin.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (ois != null) {
//                try {
//                    ois.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//
//        return entities;
    }
}
