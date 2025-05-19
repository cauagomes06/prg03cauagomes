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
import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private long id;
  private String senha;
  private String email;
  private PerfilUsuario perfil;
  private String nome;
  private boolean ativo;
  private LocalDateTime ultimoLogin;
  private  List<LogAuditoria> logs = new ArrayList<>();
  private Sessao sessao;

    public Usuario(long id, String senha, String email, PerfilUsuario perfil, String nome, boolean ativo) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.perfil = perfil;
        this.nome = nome;
        this.ativo = ativo;
        this.ultimoLogin = LocalDateTime.now();

    }
  
    
      @Override
    public  String toString(){  // o toString pedido no desasfio 

    return " USUARIO :"+ "Id :"+this.id+" Nome :" + this.nome +" Senha :"+this.senha+" Email :"+this.email+" Perfil :"+this.perfil+"Ultimo Login :"+this.ultimoLogin+"Status : "+this.ativo;
           
   }

    public long getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
    public static Usuario criaUsuario(PerfilUsuario perfil){
        
        return new Usuario(1,"caua123456","cau201812@gmai.com",perfil,"Caua",false);
    }
    public static PerfilUsuario criaPerfil(){
        List<String> permissoes = new ArrayList();
        permissoes.add("CRIA USUARIO");
        permissoes.add("EDITAR USUARIO");
        permissoes.add("APAGAR USUARIO");
        return new PerfilUsuario(1L, "ADM",permissoes);
    }

    public void criarLog(String acao){
        
        String ipAleatorio = "1111111111";
        long idlog = 1;
        logs.add(new LogAuditoria(idlog,this,acao,ipAleatorio));
    }
        public void logarConta(String nomeEscolhido,String senhaEscolhida){
        
         if(this.nome.equals(nome) && this.senha.equals(senhaEscolhida)){
             
            String tokenAleatorio = "FFFFFFFF";
            this.sessao = new Sessao(1,this,tokenAleatorio);
            criarLog("Login realizado");
            
            System.out.println("Login realizado com sucesso");
            this.ativo = true;
            this.ultimoLogin = LocalDateTime.now();
         }else{
             System.out.println("Usuario ou senha incorretos");
         }
    }
        public void deslogarConta(){
            
            if(this.sessao != null && this.ativo){
                System.out.println("Saiu da conta com sucesso");
                criarLog("Usuario deslogou");
                this.sessao = (Sessao)null;// termina a sessao
                this.ativo = false;
            }else{
                System.out.println("Voce ainda nao esta logado");
                criarLog("Usuario tentou deslogar sem estar logado");
            }
        }
       public void mostrarLogs(){
           for(LogAuditoria log : logs){
               System.out.println(log);
           }
       }
       public void toStringSessao(){
           System.out.println(this.sessao.toString());
       }
       public void toStringPerfil(){
           System.out.println(this.perfil.toString());
       }
       public void toStringUsuario(){
           System.out.println(this.toString());
       }
}    
