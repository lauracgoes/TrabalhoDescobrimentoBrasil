/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author Flavio
 */
class Pontuacao {
        
        private int Ponto;
        private boolean Flag_Erro;
        
        
        Pontuacao(){
            
            Ponto = 0;
            Flag_Erro = true;
            
        }
        
        
        void Incrementa_Pontuacao(){
            
            if(Flag_Erro == false){
                
                Ponto = Ponto + 1;
                
            }else{
                
                Ponto = Ponto + 2;
            }
        }
            
        public int Retorna_Pontuacao(){
        
            return Ponto;
        }
       public boolean Retorna_Flag(){
        
            return Flag_Erro;
        }
        
        void Muda_Flag_Acerto(){
            
            Flag_Erro = true;
        
        }
        
        void Muda_Flag_Erro(){
            
            Flag_Erro = false;
        
        }
}
