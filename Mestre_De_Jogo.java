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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flavio
 */
public class Mestre_De_Jogo {

    /**
     * @param args the command line arguments
     */
    
    private String Nome;
    private Pontuacao Pontos;
    private Fase_Regiao Fs_Regiao;
    private Fase_Capital Fs_Capital;
    private Fase_Estado Fs_Cidade;
    private Base_De_Dados dados;
    private boolean loop;
    
    Mestre_De_Jogo() throws IOException{
            Pontos = new Pontuacao();
            Fs_Regiao = new  Fase_Regiao();
            Fs_Capital = new Fase_Capital();
            Fs_Cidade = new Fase_Estado();
            dados = new Base_De_Dados();
    }
    
    public void Adiciona_Regiao(String Nome , String Sigla ,String Dominio) throws IOException{// Dominio == FaseCapital || FaseCidade || FaseRegiao
            
            dados.EscreveArquivo(Nome,Sigla,Dominio);
    }
    
    public void Limpa() throws IOException{
            
            dados.LimpaArquivo("Capital");
            dados.LimpaArquivo("Regiao");
            dados.LimpaArquivo("Cidade");
            dados.LimpaArquivo("Pontuacao");
    }
     public void Limpa(String nome) throws IOException{
          
            dados.LimpaArquivo(nome);
    }
    
    public static void main(String[] args) throws IOException  {
           
       // Tudo que for lido ou inserido nos arquivos de cidade serao renomeados para Estado
        Mestre_De_Jogo m = new Mestre_De_Jogo();
        
        m.loop = true;
       
        while(m.loop == true){
        m.Tela_De_Jogo(m);
        }
       
        
       // m.Limpa();  // Caso Queira Limpar Os Txts chame esse metodo
       // m.Adiciona_Regiao("Rio de Janeiro","Rj","Cidade"); // O nome  a Sigla e o Nome e base de dados relacionada
          
    }
    
    private void Jogar() throws IOException{
        
        Limpa("Pontuacao");
        
        System.out.println("----------------- O Jogo Comecou -----------------");
        
       Cadastra_Nome();
    
        Fs_Regiao.Carrega_Pontuacao(Pontos);
        Fs_Regiao.Comeca_Game();
        RegistraPontosFilho("Fase Regiao");// Pertence a classe mestre de Jogo usa métodos da Base_De_Dados
        
        if(Fs_Regiao.Pega_Final_Fase() == true){
            Limpa_Tela();
        }
        
        Fs_Capital.Carrega_Pontuacao(Pontos);
        Fs_Capital.Comeca_Game();
        RegistraPontosFilho("Fase Capital");
        
        if(Fs_Capital.Pega_Final_Fase() == true){
           Limpa_Tela();
        }
        Fs_Cidade.Carrega_Pontuacao(Pontos);
        Fs_Cidade.Comeca_Game();
        RegistraPontosFilho("Fase Cidade");
        
        Mostra_Estatistica();
        
        
    }
    
    private void Limpa_Tela(){
    for(int i=0 ;i<2;i++){
        System.out.println("--------------------------------------------");
    }
    
    }
    
    private void Cadastra_Nome(){
        
        String aux;
        
        System.out.println("Digite Seu Nome: ");
        aux = Fs_Regiao.Seta_Texto();
        Nome = aux;
    }
    
    private String Retorna_Nome(){
        
        return Nome;
    } 
    
    private void Mostra_Estatistica(){
        System.out.println("\n \n \n");
        System.out.println("Nome: "+ Nome);
        System.out.println("Pontuacao: "+ Pontos.Retorna_Pontuacao());
    }
    
    private void ScoreFilho() throws IOException{
        String resultado;
        
        System.out.print("----------- Score do " + this.Nome + " ---------------");
        for(int i = 0 ; i<=dados.TamanhoArq("Pontuacao");i++){
            resultado = dados.RetornaBase(i, "Pontuacao");
            System.out.println(resultado);
        }
        
           System.out.println("----- Aperte qualquer tecla para voltar para o menu ----");
           String  numero = Fs_Regiao.Seta_Texto(); 
          
    }
    
    
    private void RegistraPontosFilho(String Fase) throws IOException{
    
    
    dados.EscreveArquivo(this.Nome, Pontos.Retorna_Pontuacao(), Pontos.GetTentativas(), Fase);
    
    }
    
    private void RegistraNovaRegiao() throws IOException{
            String nomeR,nomeS,dominio;
            System.out.println("             !!!!!!! Bem vindo ao cadastro de Regioes Cidades e Estados !!!!!           ");
             
            
            System.out.println("Digite uma Regiao ou Capital ou Cidade. ");
            nomeR = Fs_Regiao.Seta_Texto(); 
            System.out.println("Digite uma Sigla para Regiao ou Capital ou Cidade. ");
            nomeS = Fs_Regiao.Seta_Texto(); 
            System.out.println("Digite um Dominio: Regiao ou Capital ou Cidade. ");
            dominio = Fs_Regiao.Seta_Texto(); 
            
            
            dados.EscreveArquivo(nomeR,nomeS, dominio);
            
    
    }
    
        private void Tela_De_Jogo(Mestre_De_Jogo mestre) throws IOException{
        
          String numero;
            
            System.out.println("---------------- Bem Vindo ao Game :P ---------------");
            System.out.println("Menu");
            System.out.println("Digite 'q' para Jogar");
            System.out.println("Digite 'w' para Cadastrar pais");
            System.out.println("Digite 'e' para Ver o Score do Filho");
            System.out.println("Digite 'r' para sair do game");
            System.out.println("Digite 't' para Cadastra Regioes");
            
            numero = Fs_Regiao.Seta_Texto(); 
             
            if(numero.contains("q")==true)
            mestre.Jogar();
          
            if(numero.contains("w")==true)
            mestre.Jogar();
            
            if(numero.contains("e")==true)
            mestre.ScoreFilho();
    
            
            if(numero.contains("r")==true){
            mestre.loop = false;
            }
                   
            if(numero.contains("t")==true)
            mestre.RegistraNovaRegiao();
        }

}
