/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Jogo.Regiao;
import Jogo.Pais;
import Jogo.Estado;
import Jogo.Mapa;
//import negocio.Padrao;


public class baseDados {
    
    private List<dadoTemporario> listaDadosTemporario = new ArrayList<>();
    
    private Pais pais = new Pais("Brasil");
    
    public Pais leTxt(String caminhoArquivo){
        try{
        importarArquivo(new File(caminhoArquivo));
        temporarioParaPais();
        }catch (Exception e){
        }
        return pais;
    }
    
    public void importarArquivo(File arquivo) throws IOException{
        BufferedReader reader = null;
        try{
            reader = new BufferedReader (new FileReader(arquivo));
            dadoTemporario dadoTemporario1 = new dadoTemporario();
            while(reader.ready()){
                if(interpretaLinha(reader.readLine(), dadoTemporario1)){
                    listaDadosTemporario.add(dadoTemporario1);
                    dadoTemporario1 = new dadoTemporario();
                }
                    
                
            }
            System.out.println("oi");
        }finally{
            if(reader != null){
                reader.close();
        }
        }
    }
    
    public boolean interpretaLinha(String texto, dadoTemporario dadoTemporario){
        String[] partes = texto.split("@");
        
        if (partes.length == 2){
            String label = partes[0];
            String valor = partes[1];
            
            if(isRegiao(label)){
                dadoTemporario.setRegiao(valor);
                return false;
            }
            else if(isEstado(label)){
                dadoTemporario.setEstado(valor);
                return false;
            }
            else if(isCapital(label)){
                dadoTemporario.setCapital(valor);
                return true;
            }
        }
        return false;
    }
    
    private boolean regiaoExiste(String nomeRegiao){
        List<Regiao> regioes = pais.getRegioes();
        for (Regiao regiaoCorrente : regioes) {
            if(regiaoCorrente.getNome().equals(nomeRegiao))
                return true;
        }
        return false;
    }
    private boolean estadoExiste(String nomeEstado, String nomeRegiao){
        Regiao regiaoDoEstado = pais.getRegiaoPorNome(nomeRegiao);
        
        List<Estado> estados = regiaoDoEstado.getEstados();
        for (Estado estadoCorrente : estados) {
            if(estadoCorrente.getNome().equals(nomeEstado))
                return true;
        }
        
        return false;
    }
            
    
    public void temporarioParaPais()
    {
       List<dadoTemporario> lista = listaDadosTemporario;
        for (dadoTemporario dadoTemporarioCorrente : lista) {
            if(!regiaoExiste(dadoTemporarioCorrente.getRegiao()))
                pais.getRegioes().add(new Regiao(dadoTemporarioCorrente.getRegiao()));
            
            if(!estadoExiste(dadoTemporarioCorrente.getEstado(), dadoTemporarioCorrente.getRegiao()))
                pais.getRegiaoPorNome(dadoTemporarioCorrente.getRegiao()).getEstados().add(new Estado(dadoTemporarioCorrente.getEstado(), dadoTemporarioCorrente.getCapital()));
        }
        System.out.println("oi");
    }
    
    
    
    
    
    private boolean isRegiao(String texto) {
    return "REGIAO".equals(texto.toUpperCase());
    }
    private boolean isEstado(String texto) {
        return "ESTADO".equals(texto.toUpperCase());
    }
    private boolean isCapital(String texto) {
        return "CAPITAL".equals(texto.toUpperCase());
    }
} 