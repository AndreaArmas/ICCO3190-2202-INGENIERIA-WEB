/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;
import sessionBeans.UsuarioFacade;

/**
 *
 * @author Dell
 */
@ManagedBean
@ViewScoped
public class indexController implements Serializable {
    
    @EJB
    private UsuarioFacade EJBUsuario;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        usuario=new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String iniciarSesion(){
        Usuario us;
        String redireccion=null;
        try {
            us=EJBUsuario.iniciarSesion(usuario);
            if(us!=null){
                //almacenar en la sesión de jsf
               FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
               
               redireccion ="/faces/principal.xhtml";
            }
            else{
                
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso","Credenciales incorrectas"));

            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error"));
        }
        return redireccion;
    }
    
}
