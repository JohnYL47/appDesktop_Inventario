package Main;

import Jframes.JfLogin;
import Controladores.Control_Login;

public class Run {
    public static void main(String[] args) {
        JfLogin lg = new JfLogin();
        Control_Login Marvel = new Control_Login(lg);
        Marvel.inicio();
    }
}