/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.PaisDao;
import javax.swing.JOptionPane;
import modelo.Pais;
import tela.manutencao.ManutencaoPais;

/**
 *
 * @author Administrador
 */
public class ControladorPais {
    
    //vai ter que deixar os campos public na manutenção e a listagem tb
    
    public static void inserir(ManutencaoPais man){
        Pais objeto = new Pais();
        objeto.setSigla(man.jtfSigla.getText());
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = PaisDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
