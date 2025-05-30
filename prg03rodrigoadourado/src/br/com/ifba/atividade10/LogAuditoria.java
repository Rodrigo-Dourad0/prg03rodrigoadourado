/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;
import java.time.LocalDateTime;
/**
 *
 * @author user
 */
public class LogAuditoria {
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    
    @Override
    public String toString() {
        return "LogAuditoria{" + "id=" + id + ", usuario=" 
                + usuario + ", acao=" + acao + ", dataHora=" 
                + dataHora + ", ip=" + ip + '}';
    }
    
    
}
