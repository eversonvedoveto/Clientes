
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
        cliente.setId(Long.parseLong("1"));
        cliente.setNome("Everson");
        cliente.setCpf("06864493989");
        cliente.setCep("87505512");
        cliente.setBairro("Centro");
        cliente.setCidade("Umuarama");
        cliente.setEndereco("Rua Vicente");
        cliente.setGenero("Masculino");
        cliente.setRg("101347544");
        
        ClienteDAO dao = new ClienteDAO();
        dao.merge(cliente);
    }
}
