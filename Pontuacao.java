/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

/**
 *
 * @author Flavio
 */
class Pontuacao {
        
        private int Ponto;
        private boolean Flag_Erro;
        private int QuantidadeTentativas;
        public int Valor_Da_Questao; // Se o Jogador consegui pontuacao maxima acertando de primeira ou não
        
        Pontuacao(){
            
            Ponto = 0;
            Flag_Erro = true;
            
        }
        
        
        void Incrementa_Pontuacao(){
            
            if(Flag_Erro == false){
                
                Ponto = Ponto + 1;
                Valor_Da_Questao = 1;
                IncrementaTentativas();
            }else{
                
                Ponto = Ponto + 2;
                Valor_Da_Questao = 2;
                IncrementaTentativas();
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
        
        void IncrementaTentativas(){
            QuantidadeTentativas++;
        }
        
        public int GetTentativas(){
        
            return QuantidadeTentativas;
        }
}
