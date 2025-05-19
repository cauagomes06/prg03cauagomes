/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;



/**
 *
 * @author Cauã
 */
public class Sessao {
    
    private long id;
    private Usuario usuario;
    private String token;

    public Sessao(long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }
  
    @Override
    public String toString(){
        
        return" Sessao : " + "Id = " + this.id+ " Usuario :"+this.usuario+" Token: "+ this.token;
    }
}
