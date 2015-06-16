/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.util.ArrayList;

/**
 *
 * @author Flavio
 */
public class Regiao {
    
    
  
    private String Nome_Regiao;
    private String Sigla;   // Com a interface grafica usaremos botoes ao inves de sigla para identificar regioes :P
    ArrayList<Regiao> ArrayRegiao;

    
    Regiao(){
  
        ArrayRegiao = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Regiao_Aux2 , String Sigla_Aux){
       
       Regiao a = new Regiao();
        
       a.Sigla = Sigla_Aux;
       a.Nome_Regiao = Regiao_Aux2; 
       
       ArrayRegiao.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Sigla_Aux,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Sigla.contentEquals(Sigla_Aux)== true && ArrayRegiao.get(i).Nome_Regiao.contentEquals(Regiao_Aux2) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        String aux="";
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Regiao      ||          Sigla");
        for(int i = 0; i< ArrayRegiao.size(); i++) {   
       
          
         System.out.println(ArrayRegiao.get(i).Nome_Regiao + "      ||      "+ ArrayRegiao.get(i).Sigla);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayRegiao.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayRegiao.get(Index).Sigla;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayRegiao.get(Index).Nome_Regiao;
    }
    
    public void Remove_String(String Regiao_Aux2){
    String aux="";

        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Nome_Regiao.contentEquals(Regiao_Aux2)== true){
            aux = ArrayRegiao.get(i).Nome_Regiao;
            ArrayRegiao.remove(i);
   
          }
       }
       
    
    
    }
    
    
    
    }

