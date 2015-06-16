/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Fabiaano
 */
public class Base_De_Dados {
    private int num=0;
    
    
    public void EscreveArquivo(String Capital,String Regiao,String Dominio) throws IOException{
        Scanner ler = new Scanner(System.in);
        String nome =Dominio + ".txt";
        String n = Capital +";"+Regiao;
        
        
    FileWriter arq = new FileWriter(nome,true);
    PrintWriter gravarArq = new PrintWriter(arq);
    
    //gravarArq.printf(n);
    gravarArq.println(n);
    
    arq.close();
    
    }
    
    
    public void EscreveArquivo(String NomeJogador,int Pontuacao,int QuantidadeTentativas,String Fase) throws IOException{
        Scanner ler = new Scanner(System.in);
        String nome = "Pontuacao.txt";
        String n = Fase +";"+Pontuacao +" pontos "+ ";" + NomeJogador + ";" + QuantidadeTentativas + "tentativas";
       
    FileWriter arq = new FileWriter(nome,true);
    PrintWriter gravarArq = new PrintWriter(arq);
    
    //gravarArq.printf(n);
    gravarArq.println(n);
    
    arq.close();
    
    }
    
    public void Arquivo() throws IOException{
    
               Scanner ler = new Scanner(System.in);
                //FileWriter arq = new FileWriter("df.txt");
                String nome ="Capital.txt"; 
                
                        FileReader arq = new FileReader(nome);
                        BufferedReader lerArq = new BufferedReader(arq);
                
              String linha = lerArq.readLine();
                  
                
                while(linha != null){
                    System.out.printf("%s\n",linha);
                    linha = lerArq.readLine();
                    num++;
                }
    
    }
    
    
    public void LimpaArquivo(String nomeArq) throws IOException{
              
        
        Writer out1 = new FileWriter(nomeArq + ".txt");
        out1.write("");  
        out1.flush();  
    }
    
  public int TamanhoArq(String nomeArquivo) throws IOException{
    num = 0 ;
               Scanner ler = new Scanner(System.in);
                //FileWriter arq = new FileWriter("df.txt");
                String nome = nomeArquivo + ".txt";
                
                        FileReader arq = new FileReader(nome);
                        BufferedReader lerArq = new BufferedReader(arq);
                
                String linha = lerArq.readLine();
                
                
                while(linha != null){
                    
                    linha = lerArq.readLine();
                    num++;
                }
    return num;
    }
    
    
    //---------------------------------------- Aqui ------------------------
    
    public String RetornaBase(int Index,String nomeArquivo) throws IOException{
    int i = 0;
               Scanner ler = new Scanner(System.in);
                //FileWriter arq = new FileWriter("df.txt");
                String nome = nomeArquivo + ".txt";
                
                        FileReader arq = new FileReader(nome);
                        BufferedReader lerArq = new BufferedReader(arq);
                
                String linha = lerArq.readLine();
                
                
                while(linha != null){
                    i++;
                   
                  
                  
                    if(i == Index)
                     return linha;
                    
                     linha = lerArq.readLine();
                   }
               return "";
    }
    
    
    
    
    
    
    
    
}


