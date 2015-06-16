/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.List;
import java.util.Map;


public class Mapa { //armazenar registros do jogo num XML
    
    //Map<String, String>arquivos;//ideia
    
    Map<String, List<Regiao>>arquivosRegioes;
    Map<String, List<Estado>>arquivosEstados;
    //Map<String, String>arquivosCapitais; como seria Map das capitais e siglas?

    public Mapa(Map<String, List<Regiao>> arquivosRegioes, Map<String, List<Estado>> arquivosEstados) {
        this.arquivosRegioes = arquivosRegioes;
        this.arquivosEstados = arquivosEstados;
    }
    
    
    
}


/*

Class Mapa {

     Map<String, String> arquivos;

   Essa estrutura mapearia os nomes dos arquivos aos nomes dos respectivos elementos 

representados pelo arquivo gráfico.

 “norte.jpg” – “Norte” (nome contido no objeto da classe Regiao presente no atributos regiões 

de Pais.

“sul.jpg” – “Sul”

“centrooeste.jpg”, “Centro-Oeste”

Etc.

}

Os nomes dos arquivos usado no mapa das regiões e no mapa dos estados (seriam duas 

instancias separadas da classe Mapa) também poderiam ser lidos de um arquivo texto de 

forma similar ao arquivo com as definições de países, etc – ou mesmo poderiam estar todos no 

mesmo arquivo texto).

Para montar a interface da fase 1, o programa pegaria a classe Mapa e listaria todos os nomes 

de arquivos do Mapa de regiões e listaria todos os nomes de regiões do Pais em uma ordem 

diferente (pelo atributo regiões) e o usuário (aqui é só para testar a lógica) faria a associação 

de uma lista com a outra.

Para montar a interface da fase 2, o programa pegaria a classe mapa e listaria todos os nomes 

de arquivos do Mapa de estados e listaria todos as siglas dos estados do pais, obtidos pela 

navegação pais.regioes.estados. De forma análoga, na fase 3, seriam listadas todas as capitais 

dos estados do pais (ao invés da sigla) seguindo a mesma navegação.


*/