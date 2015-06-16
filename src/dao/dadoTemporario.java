/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Luiz
 */
public class dadoTemporario {
    
    private String Regiao;
    private String Estado;
    private String Capital;

    public dadoTemporario() {
    }

    public dadoTemporario(String Regiao, String Estado, String Capital) {
        this.Regiao = Regiao;
        this.Estado = Estado;
        this.Capital = Capital;
    }

    /**
     * @return the Regiao
     */
    public String getRegiao() {
        return Regiao;
    }

    /**
     * @param Regiao the Regiao to set
     */
    public void setRegiao(String Regiao) {
        this.Regiao = Regiao;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Capital
     */
    public String getCapital() {
        return Capital;
    }

    /**
     * @param Capital the Capital to set
     */
    public void setCapital(String Capital) {
        this.Capital = Capital;
    }
    
    
    
}
