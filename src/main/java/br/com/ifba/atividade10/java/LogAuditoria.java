/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;

/**
 *
 * @author Cauã
 */
import java.time.LocalDateTime; // importa data e hora da maquina

public class LogAuditoria {
    
    long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    public LogAuditoria(long id, Usuario usuario, String acao, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.ip = ip;
        this.dataHora =LocalDateTime.now(); 
             
    }
//getters
    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getAcao() {
        return acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getIp() {
        return ip;
    }
// setterss
    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    @Override
    public String toString(){
    
        return"logAuditoria:"+ "Id : "+this.id +" Usuario :"+this.usuario+" Acao :"+ this.acao+" DataHora : "+ this.dataHora+" Ip :"+ this.ip;
   }

}
