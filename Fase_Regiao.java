/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Flavio
 */

public class Fase_Regiao extends Regiao{
    
    private List Lista_De_Regioes; 
    private List Lista_De_Siglas; 
    private  BufferedReader in;
    private String Regiao;
    private String Regiao_Escolhida;
    private int Numeros[];
    private Pontuacao Pontos;
    private String Palavras[];
    private boolean Fim_Da_Fase;
    private Base_De_Dados BaseD;
    
    Fase_Regiao() throws IOException{
     BaseD = new Base_De_Dados();
     Fim_Da_Fase = false;        
     Lista_De_Siglas = new ArrayList();   
     Lista_De_Regioes = new ArrayList();
     in = new BufferedReader(new InputStreamReader(System.in));  
     Regiao = "";
     Regiao_Escolhida = "";
     Carrega_Mapa();
     Numeros = new int[Retorna_Tamanho_Lista()];
     Palavras = new String[Retorna_Tamanho_Lista()];
       
        for(int i=0;i<Retorna_Tamanho_Lista();i++){
             Palavras[i] = "";
    }
        
    }
   
    public void Carrega_Pontuacao(Pontuacao a){
    
       Pontos = a;
    
    }
    
    private void Carrega_Mapa() throws IOException {// mudanca ocorreu aqui
        
            String aux=null;
            String cidade,regiao;
            
             
           for(int i = 1; i <= BaseD.TamanhoArq("Regiao") ; i++){
                aux = BaseD.RetornaBase(i,"Regiao");
                cidade = aux.substring(0, aux.indexOf(';'));
                regiao = aux.substring(aux.indexOf(';') + 1,aux.length());
                
                Carrega_Mapa_Aqui(cidade,regiao);
          }
            
        }
       /* public void Adiciona_Regiao(String Regiao_Aux2,String Sigla_Aux2){
        
            Carrega_Mapa_Aqui(Regiao_Aux2, Sigla_Aux2);
        
        }*/
            
    
    
    public void Comeca_Game() throws IOException{
    
    int controlaLoop =0 ;    
    String regiao,sigla;
  
       System.out.println("-------------------------- Fase 1 ----------------------");
       System.out.println("Regras da Fase:");
       System.out.println("O jogador tem que selecionar uma Regiao e dizer a qual sigla ela pertence.");
       System.out.println("Acertos de Primeira: 2 pontos  \\ Acertos com mais de uma tentativa: 1 ponto");
       
       
       
       int tamanhoLista=Retorna_Tamanho_Lista();
               
       while(controlaLoop < tamanhoLista){
        
        Imprime();
        
          
        System.out.println("Digite a Regiao:  ");
        regiao = Seta_Texto();
        
        System.out.println("Digite a Sigla escolhida:  ");
        sigla = Seta_Texto();
      
        if(Verifica_Contain_Sigla(sigla,regiao) == true){
            if(Verifica_Se_Palavra_Escolhida(regiao) == false){
                
                Remove_String(regiao);
                
                controlaLoop++;
                Pontos.Incrementa_Pontuacao();
                Insere_Palavra(regiao);
                Pontos.Muda_Flag_Acerto();
            
            }else{ System.out.println("Palavra já foi escolhida !!!");}
                }else{
                
                Pontos.Muda_Flag_Erro();
                 
        }
                 if(Pontos.Retorna_Flag() == true){
                     System.out.println("Você fez: " + Pontos.Valor_Da_Questao +" Pontos.");
                 }else{
                     System.out.println("Você errou!!!");
                 }
                 
       
       }// Fim Loop
       
               System.out.println("Nessa Fase o Jogador fez: " + Pontos.Retorna_Pontuacao() +" Pontos.");
               System.out.println("Numero de Tentativas " + Pontos.GetTentativas());
       
        Fim_Da_Fase = true;
               
    }
 
    private void Gera_Opcoes(){
           
        for(int i = 0 ; i < Lista_De_Regioes.size() ; i++){
              System.out.println(Lista_De_Regioes.get(i));
        }
    }
    
    public String Seta_Texto(){
        
       String aux ="";
        
       try {
            aux = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Fase_Regiao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           return aux;
    }
    
    private boolean Verifica_Se_Palavra_Escolhida(String regiao){
    
       for(int i=0;i<Retorna_Tamanho_Lista();i++){
           
           if(Palavras[i].contentEquals(regiao) == true){
            return true;
           }
           
        }
        return false;
    }
    
    private void Insere_Palavra(String palavra){
    
      for(int i=0;i<Retorna_Tamanho_Lista();i++){
           
           if(Palavras[i] == ""){
            Palavras[i] = palavra;
            break;
           }
           
        }
    }
    
    public boolean Pega_Final_Fase(){
         
        return Fim_Da_Fase;
    }
    
    
}



     
     
       
        
            
    
   


