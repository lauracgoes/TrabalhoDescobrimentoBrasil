
package Jogo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bianca
 */
public class Pais { 
   
    private String nome;
    private List<Regiao>regioes;

    
    public Pais(){
       this.nome = "";
       regioes = new ArrayList<>();
    }

    public Pais(String nome){
        this.nome = nome;
        regioes = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Regiao> getRegioes() {
        return regioes;
    }

    public void setRegioes(List<Regiao> regioes) {
        this.regioes = regioes;
    }
    
    
    public Regiao getRegiaoPorNome(String nomeRegiao){
        for (Regiao regiaoCorrente : regioes) {
            if(regiaoCorrente.getNome().equals(nomeRegiao))
                    return regiaoCorrente;
           
        }
        return null;
    }
    
    }

    
    /*
    public void Carrega_Mapa_Aqui(String Regiao_Aux2 , String Sigla_Aux){
       
       Pais a = new Pais();
        
       a.Sigla = Sigla_Aux;
       a.Regiao_Aux = Regiao_Aux2; 
       
       ArrayRegiao.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Sigla_Aux,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Sigla.contentEquals(Sigla_Aux)== true && ArrayRegiao.get(i).Regiao_Aux.contentEquals(Regiao_Aux2) == true){
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
       
          
         System.out.println(ArrayRegiao.get(i).Regiao_Aux + "      ||      "+ ArrayRegiao.get(i).Sigla);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayRegiao.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayRegiao.get(Index).Sigla;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayRegiao.get(Index).Regiao_Aux;
    }
    
    public void Remove_String(String Regiao_Aux2){
    String aux="";

        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Regiao_Aux.contentEquals(Regiao_Aux2)== true){
            aux = ArrayRegiao.get(i).Regiao_Aux;
            ArrayRegiao.remove(i);
   
          }
       }
       
    
    
    }
    
    */