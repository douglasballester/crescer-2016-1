package br.com.cwi.aula2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {
    
    public static BufferedReader getReader(String fila) throws FileNotFoundException, IOException{
        File file = new File(fila);
        file.createNewFile();
        return new BufferedReader(new FileReader(file));
    }
    
    public static BufferedWriter getWriter(String fila) throws IOException{
        return new BufferedWriter(new FileWriter(fila, true));
    }
    
    public static void main(String[] args){
        
        new Thread(new Runnable(){
            @Override
            public void run(){
                BufferedReader bufferReader = null;
                try{
                    
                    bufferReader = Run.getReader("////10.0.100.102//cwitmp//carloshenrique/crescer.txt");
                    while(true){
                        String readLine = bufferReader.readLine();
                        if(readLine != null){
                            System.out.println(readLine);
                        }
                        Thread.sleep(1000l);
                    }
                } catch (Exception ex) {
                    
                    //...
                } finally{
                    if(bufferReader != null){
                        try{
                            bufferReader.close();
                        } catch(IOException ex){
                            //....
                        }
                    }
                }
            }
        }).start();
        
        String nick = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        while(true){
            String info = dateFormat.format(new Date()) + " " +nick+ " diz:";
            Scanner scanner = new Scanner(System.in);
            String nextLine = info + " " + scanner.nextLine();
            if(":q!".equals(nextLine)){
                break;
            }
            BufferedWriter bufferedWriter = null;
            try{
                bufferedWriter = getWriter("////10.0.100.102//cwitmp//carloshenrique/crescer.txt");
                bufferedWriter.write(nextLine);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                
            } catch(Exception e){
            //...
            } finally{
                try{
                    if (bufferedWriter != null){
                        bufferedWriter.close();
                    }
                } catch(Exception e){
                    //...
                }
            }
        }
    }
}
