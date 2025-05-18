/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        
       // Cria perfil de administrador
       
        PerfilUsuario  perfilAdmin = new PerfilUsuario();
        
        perfilAdmin.setId(1);
        perfilAdmin.setDescricao("Administrador");
        perfilAdmin.setPermissoes(Arrays.asList("CRIAR_USUARIO", "DELETAR_USUARIO", "VER_LOGS"));

        
        // Cria perfil de usuário comum
         
        PerfilUsuario userPerfil = new PerfilUsuario();
        
        userPerfil.setId(2);
        userPerfil.setDescricao("Usuário Comum");
        userPerfil.setPermissoes(Arrays.asList("VER_CONTEUDO"));
        
        // Criar usuário administrador
        
        Usuario admin = new Usuario();
        
        admin.setId(100);
        admin.setNomeUsuario("admin01");
        admin.setEmail("admin@empresa.com");
        admin.setSenha("1234");
        admin.setPerfil(perfilAdmin);
        admin.setAtivo(true);
        admin.setUltimoLogin(LocalDateTime.now());
        
        
        // Cria usuário comum
        
        Usuario user = new Usuario();
        
        user.setId(101);
        user.setNomeUsuario("usuario01");
        user.setEmail("usuario@empresa.com");
        user.setSenha("abcd");
        user.setPerfil(userPerfil);
        user.setAtivo(true);
        user.setUltimoLogin(LocalDateTime.now());
        
        
        
        // Cria sessão para o admin
        
        Sessao sessaoAdmin = new Sessao();
        
        sessaoAdmin.setId(1);
        sessaoAdmin.setUsuario(admin);
        sessaoAdmin.setToken("token-admin-xyz");
        
        // Cria sessão para o usuário comum
        
        Sessao sessaoUser = new Sessao();
        
        sessaoUser.setId(2);
        sessaoUser.setUsuario(user);
        sessaoUser.setToken("token-user-abc");
        
        
        // Cria log de auditoria para o admin
        
        LogAuditoria logAdmin = new LogAuditoria();
        
        logAdmin.setId(1);
        logAdmin.setUsuario(admin);
        logAdmin.setAcao("Login realizado");
        logAdmin.setDataHora(LocalDateTime.now());
        logAdmin.setIp("192.168.0.1");
        
        
        // Criar log de auditoria para o usuário comum
        
        LogAuditoria logUser = new LogAuditoria();
        
        logUser.setId(2);
        logUser.setUsuario(user);
        logUser.setAcao("Visualizou conteúdo");
        logUser.setDataHora(LocalDateTime.now());
        logUser.setIp("192.168.0.2");
        
        
 
        // Exibe resultados
        System.out.println(admin);
        System.out.println(user);
        System.out.println(sessaoAdmin);
        System.out.println(sessaoUser);
        System.out.println(logAdmin);
        System.out.println(logUser);
    }
}
