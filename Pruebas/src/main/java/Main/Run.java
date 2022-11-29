/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;
import Jframes.JfLogin;
import Controladores.Control_Login;
/**
 *
 * @author JAMES
 */
public class Run {

    public static void main(String[] args) {
        JfLogin lg = new JfLogin();
        Control_Login Marvel = new Control_Login(lg);
        Marvel.inicio();
    }
}
