
package Controladores;
import Conexion.Conectores;
import Models.*;
import Jframes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Control_Login implements ActionListener{
    
    ArrayList<Models_User> usuariosArray = new ArrayList<Models_User>();
    
    //Conector
    Conectores conec = new Conectores();
    
    //Jframes
    JfLogin login = new JfLogin();
    JfInicioPnl inicio = new JfInicioPnl();
    JfRegistro registro = new JfRegistro();
    JfClient showCliente = new JfClient();
    JfNewVenta showNewvent = new JfNewVenta();
    JfProduct showProduct = new JfProduct();
    JfProveedor showProveedor = new JfProveedor();
    JfVenta showVent = new JfVenta();
    Crud_persona DaoPerson = new Crud_persona();
    
    private String Usuario;
    private String Passwd;

    public Control_Login(JfLogin lg) {
        this.login.JButtonIngresar_User.addActionListener(this);
        this.inicio.menuDesplegable_inicio.addActionListener(this);
        this.login.JButtonRegistrar_User.addActionListener(this);
        this.registro.JButtonCancelar_Reg.addActionListener(this);
        this.registro.JButtonRegistrar_Reg.addActionListener(this);
        this.inicio.JButtonCliente_Inicio.addActionListener(this);
        this.inicio.JButtonNewVents_Inicio.addActionListener(this);
        this.inicio.JButtonProducto_Inicio.addActionListener(this);
        this.inicio.JButtonProveedor_Inicio.addActionListener(this);
        this.inicio.JButtonVenta_Inicio.addActionListener(this);
        this.showCliente.jBtnBACK_Cliente.addActionListener(this);
        this.showNewvent.jBtnBACK_newVent.addActionListener(this);
        this.showProduct.jBtnBACK_Producto.addActionListener(this);
        this.showProveedor.jBtnBACK_Proveedor.addActionListener(this);
        this.showVent.jBtnBACK_Vents.addActionListener(this);
    }
    public void inicio() {
        this.login.setVisible(true);
        conec.getConexion();
        conec.desconectar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //LOGIN
        if (e.getSource() == this.login.JButtonIngresar_User) {
            Usuario = this.login.UsuarioLogin_txt.getText();
            Passwd = this.login.PasswdLogin_txt.getText();
            if (Usuario.equals("jhon")&& Passwd.equals("123")) {
                this.login.dispose();
                this.inicio.setVisible(true);
            } else if (Usuario.equals("") && Passwd.equals("")){
                JOptionPane.showMessageDialog(null, "Favor ingrese usuario y contraseña","ERROR",JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña no valido","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            limpiar();
        }
        //Open Pnl-Registro
        if (e.getSource() == this.login.JButtonRegistrar_User) {
            registro.setVisible(true);
            inicio.dispose();            
        }
        //Guardar los datos ingresados a la BD
        if (e.getSource() == this.registro.JButtonRegistrar_Reg) {
            String a = this.registro.UsuarioRegistro_txt.getText();
            String b = this.registro.PasswdRegistro_txt.getText();
            DaoPerson.guardar(0,a,b);
            DaoPerson.Ingresar();
            limpiar();
        }
        if (e.getSource() == this.registro.JButtonCancelar_Reg) {
            registro.dispose();
        }
        //Buttons panel - Inicio
        if (e.getSource() == this.inicio.JButtonCliente_Inicio) {
            showCliente.setVisible(true);
            inicio.dispose();
        }
        if (e.getSource() == this.inicio.JButtonNewVents_Inicio) {
            showNewvent.setVisible(true);
            inicio.dispose();
        }
        if (e.getSource() == this.inicio.JButtonProducto_Inicio) {
            showProduct.setVisible(true);
            inicio.dispose();
        }        
        
        if (e.getSource() == this.inicio.JButtonProveedor_Inicio) {
            showProveedor.setVisible(true);
            inicio.dispose();
        }
        
        if (e.getSource() == this.inicio.JButtonVenta_Inicio) {
            showVent.setVisible(true);
            inicio.dispose();
        }
        //NAV - Inicio
        if (e.getSource() == this.inicio.menuDesplegable_inicio) {
            JOptionPane.showMessageDialog(null, "Aun sin hacer","En proceso...",JOptionPane.WARNING_MESSAGE);
        }
        //Buttons BACKS
        if (e.getSource() == this.showCliente.jBtnBACK_Cliente) {
            inicio.setVisible(true);
            showCliente.dispose();
        }
        if (e.getSource() == this.showNewvent.jBtnBACK_newVent) {
            inicio.setVisible(true);
            showNewvent.dispose();
        }
        if (e.getSource() == this.showProduct.jBtnBACK_Producto) {
            inicio.setVisible(true);
            showProduct.dispose();
        }
        if (e.getSource() == this.showProveedor.jBtnBACK_Proveedor) {
            inicio.setVisible(true);
            showProveedor.dispose();
        }
        if (e.getSource() == this.showVent.jBtnBACK_Vents) {
            inicio.setVisible(true);
            showVent.dispose();
        }
    }

    private void limpiar() {
        this.login.UsuarioLogin_txt.setText("");
        this.login.PasswdLogin_txt.setText("");
        this.registro.UsuarioRegistro_txt.setText("");
        this.registro.PasswdRegistro_txt.setText("");
    }
    
    
}
