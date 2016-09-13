
import Model.Cliente;
import Model.ClienteDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everson
 */
public class teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Everson");
        ClienteDAO dao = new ClienteDAO();
        dao.merge(cliente);
    }
}
