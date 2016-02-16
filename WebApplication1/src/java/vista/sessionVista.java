/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import logica.sessionLogicaLocal;
import modelo.Aprendiz;
import modelo.Coordinador;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.password.Password;

/**
 *
 * @author Daniela Agudelo®
 */
@Named(value = "sessionVista")
@Dependent
public class sessionVista {

    
     @EJB
    private sessionLogicaLocal sesionLogica;
    
    private InputText txtUsuario;
    private Password txtClave;
    private CommandButton btnIngresar;

    /**
     * Creates a new instance of SesionVista
     */
    public sessionVista() {
    }

    public InputText getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(InputText txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public Password getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(Password txtClave) {
        this.txtClave = txtClave;
    }

    public CommandButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(CommandButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }
    
    public void funcion_ingresar(){
        FacesContext context =FacesContext.getCurrentInstance();
        ExternalContext extContext=context.getExternalContext();
        String urlAprendiz=""; String urlCoordinador="";
        try {
            urlAprendiz = extContext.encodeActionURL(context.getApplication().getViewHandler().getActionURL(context, "/gestionEstudiante.xhtml"));
            urlCoordinador = extContext.encodeActionURL(context.getApplication().getViewHandler().getActionURL(context, "/gestionDocente.xhtml"));
            Long documento = Long.parseLong(txtUsuario.getValue().toString());
            String clave = txtClave.getValue().toString();
            Aprendiz aprendizLogueado = sesionLogica.iniciarSesionAprendiz(documento, clave);
            Coordinador coordinadorLogueado = null;
            if(aprendizLogueado==null){
                coordinadorLogueado = sesionLogica.iniciarSesionCoordinador(documento, clave);
                if(coordinadorLogueado==null){
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El usuario no existe"));
                }else{
                    //esta logueado un docente
                    extContext.getSessionMap().put("usuario", coordinadorLogueado);
                    extContext.getSessionMap().put("tipo", "coordinador");
                    extContext.redirect(urlCoordinador);
                }
            }else{
                //esta logueado un estudiante
                extContext.getSessionMap().put("usuario", aprendizLogueado);
                extContext.getSessionMap().put("tipo", "aprendiz");
                extContext.redirect(urlAprendiz);
            }
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", ex.getMessage()));
        }
        
    }
    
    public void cerrarSesion_action()
    {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext extContext= context.getExternalContext();
            extContext.getSessionMap().remove("tipo");
            extContext.getSessionMap().remove("usuario");
            String url=extContext.encodeActionURL(context.getApplication().getViewHandler().getActionURL(context,"/index.xhtml"));
            extContext.redirect(url);
        } catch (IOException ex) {
            Logger.getLogger(sessionVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
