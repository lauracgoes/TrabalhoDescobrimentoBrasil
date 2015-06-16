
package Jogo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bianca
 */
public class Regiao { //Estado vira classe Região, que terá um List de Estados
    
    private String nome;
    List<Estado>estados;
    


    public Regiao(String nome, List<Estado> estados) {
        this.nome = nome;
        this.estados = estados;
    }

    public Regiao() {
        nome = "";
        estados = new ArrayList<>();
    }

    public Regiao(String nome){
        this.nome = nome;
        estados = new ArrayList<>();
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    
}

    
    /*
    private String Cidade_Aux;
    private String nomeEstado;
    private String regiaoCorrespondente;
    ArrayList<Regiao> ArrayCidade;

    
    Regiao(){
           
        ArrayCidade = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Capital_Aux2 , String Regiao_Aux){
       
       Regiao a = new Regiao();
        
       a.regiaoCorrespondente = Regiao_Aux;
       a.nomeEstado = Capital_Aux2; 
       
       ArrayCidade.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Cidade_Aux2,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).regiaoCorrespondente.contentEquals(Regiao_Aux2)== true && ArrayCidade.get(i).nomeEstado.contentEquals(Cidade_Aux2) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        String aux="";
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Capital      ||          Regiao");
        for(int i = 0; i< ArrayCidade.size(); i++) {   
       
  
         System.out.println(ArrayCidade.get(i).nomeEstado + "      ||      "+ ArrayCidade.get(i).regiaoCorrespondente);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayCidade.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayCidade.get(Index).regiaoCorrespondente;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayCidade.get(Index).nomeEstado;
    }
    
  
    public void Remove_String(String Regiao_Aux2){
    

        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).nomeEstado.contentEquals(Regiao_Aux2)== true){
            
            ArrayCidade.remove(i);
            
          }
        }   
    }
    */
