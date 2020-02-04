/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;

/**
 *
 * @author Dell
 */
@ManagedBean
@ViewScoped
public class plantillaController implements Serializable {
    public void verificarSesion(){
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get(("usuario"));
            
            if(us == null){
                context.getExternalContext().redirect("/faces/permisos.xhtml?faces-redirect=true");
            }
        } catch (Exception e) {
        }
    }
    
}
