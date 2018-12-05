/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*File file = new File("C:\\Users\\Luis Guilherme\\Desktop\\aqui\\Arquivo.txt");
        
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Ana");
                bw.newLine();
                bw.close();
                fw.close();
                //faz a leitura do arquivo
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                //enquanto houver mais linhas
                while (br.ready()) {
                //lê a proxima linha
                String linha = br.readLine();
                //faz algo com a linha
                System.out.println(linha);
                }
                br.close();
                fr.close();
                } catch (IOException ex) {
                ex.printStackTrace();
                }
                    
           */
        
        /*File arquivo = new File("C:\\Users\\Luis Guilherme\\Desktop\\aqui/Pokemon.txt");
        try {
        if (!arquivo.exists()) {
        //cria um arquivo (vazio)
        arquivo.createNewFile();
        }
        //caso seja um diretório, é possível listar seus arquivos e diretórios
        File[] arquivos = arquivo.listFiles();
        //escreve no arquivo
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Texto a ser escrito no txt");
        bw.newLine();
        bw.close();
        fw.close();
        //faz a leitura do arquivo
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        //enquanto houver mais linhas
        while (br.ready()) {
        //lê a proxima linha
        String linha = br.readLine();
        //faz algo com a linha
        System.out.println(linha);
        }
        br.close();
        fr.close();
        } catch (IOException ex) {
        ex.printStackTrace();
        }
        }*/
        
        
        File file = new File("C:\\Users\\Luis Guilherme\\Desktop\\aqui/Pokedex.txt");
        
        if(!file.exists()){
            try {
                file.createNewFile();
                
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Pikachu");
                bw.close();
                fw.close();
                
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                while(br.ready()){
                    String linha = br.readLine();
                    System.out.println(linha);
                }
                br.close();
                fr.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }  
}
