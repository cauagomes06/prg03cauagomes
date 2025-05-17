/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;

/**
 *
 * @author Cauã
 */
import java.util.ArrayList;
import java.util.List;


public class PerfilUsuario {
    private long id;
    private String descricao;
    private List<String> permissoes = new ArrayList<>();

    /**
     *
     * @param id
     * @param descricao
     * @param permissoes
     */

    public PerfilUsuario(long id, String descricao,List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }
    
    public void mostrarPermissoes(){
        
               System.out.println("Permissoes do Usuario");
          for(String permissao : permissoes){
              System.out.println("- " + permissao);
          } 
    }
    @Override
    public String toString(){
        return"PerfilUsuario : " + "id : "+this.id+" Descricao: "+this.descricao+" Permissoes: "+this.permissoes;
    }
}
