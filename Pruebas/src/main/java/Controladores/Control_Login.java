
package Controladores;
import Models.Models_User;
import Jframes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Control_Login implements ActionListener{
    
    ArrayList<Models_User> usuariosArray = new ArrayList<Models_User>();
    
    JfLogin log = new JfLogin();
    JfInicioPnl inicio = new JfInicioPnl();
    //Jframes pnl
    JfClient showCliente = new JfClient();
    JfNewVenta showNewvent = new JfNewVenta();
    JfProduct showProduct = new JfProduct();
    JfProveedor showProveedor = new JfProveedor();
    JfVenta showVent = new JfVenta();
    
    private String Usuario;
    private String Passwd;

    public Control_Login(JfLogin lg) {
        this.log.JButtonIngresar_User.addActionListener(this);
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
        this.log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.log.JButtonIngresar_User) {
            Usuario = this.log.UsuarioLogin_txt.getText();
            Passwd = this.log.PasswdLogin_txt.getText();
            if (Usuario.equals("jhon")&& Passwd.equals("123")) {
                this.log.dispose();
                this.inicio.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
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
    
    
}
