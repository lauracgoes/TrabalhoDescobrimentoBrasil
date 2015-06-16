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
public class Estado {
    
 
    //private String Cidade_Aux;
    private String nomeEstado;
    private String siglaEstado;
    ArrayList<Estado> ArrayEstado;

    
    Estado(){
           
        ArrayEstado = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Estado_Aux , String Sigla_Aux){
       
       Estado a = new Estado();
        
       a.siglaEstado = Sigla_Aux;
       a.nomeEstado = Estado_Aux; 
       
       ArrayEstado.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Estado_Aux,String Sigla_Aux){
       
        
        
        for(int i = 0 ; i < ArrayEstado.size() ;i++){
            
          if(ArrayEstado.get(i).siglaEstado.contentEquals(Estado_Aux)== true && ArrayEstado.get(i).nomeEstado.contentEquals(Sigla_Aux) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Estado      ||          Sigla do Estado");
        for(int i = 0; i< ArrayEstado.size(); i++) {   
       
  
         System.out.println(ArrayEstado.get(i).nomeEstado + "      ||      "+ ArrayEstado.get(i).siglaEstado);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayEstado.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayEstado.get(Index).siglaEstado;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayEstado.get(Index).nomeEstado;
    }
    
  
    public void Remove_String(String Estado_Aux){
    

        for(int i = 0 ; i < ArrayEstado.size() ;i++){
            
          if(ArrayEstado.get(i).nomeEstado.contentEquals(Estado_Aux)== true){
            
            ArrayEstado.remove(i);
            
          }
        }   
    }
    
    
}
