/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcilio
 */
public final class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin,String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinha(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas=dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        String[] nome = null;
        colunas = nome;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinha().get(numLin);
        return linha[numCol];
    }
}