/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codersfootballleague2.pkg0.negocios.beans;

/**
 *
 * @author Marco 10
 */
public class PartidaOficial {
    
    private int qtdPagantes;
    private double preco;
    
    
    public int getQtdPagantes(){
        return this.qtdPagantes;
    }
    public void setQtdPagantes(int qtdPagantes){
        
        this.qtdPagantes = qtdPagantes;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(int preco){
        
        this.preco = preco;
    }
}
