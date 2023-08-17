package br.com.fiap;

import br.com.fiap.doamin.entity.TipoDocumento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Oracle");

    EntityManager manager = factory.createEntityManager();

    static TipoDocumento findById(long id, EnityManager manager){
        return.manager
        }


private static tipoDocumento addTipodeDocumento

    tipoDocumento tipo = new TipoDocumento();

    String nome = JOptionPane.showInputDialog("Tipo de documento");

     try{

     }catch(exception ex){
         System.err.println("Não foi possível salvar o tipo de documento" + ex,getMessage());

         String erro = """
                Erro!
                Não foi possível salvar o tipo de documento.
                
                """ + ex.getMessage();

         JOptionPane.showMessageDialog(null,"erro");

     }

    Area vendas = new Area();

    String nome = JOptionPane.showInputDialog("Nome da Área");
    String descricao = JOptionPane.showInputDialog("Descricao da Área");

    vendas.setNome("Vendas"). setDescricao("Vendas Diretas");

    try{
        manager.getTransaction().begin();
        manager.persist(vendas);
        manager.getDelegate().comit();

        System.out.println(vendas);
    catch(Exception ex) {
        System.out.println(ex.getMessage());
        JOptionPane.showInputDialog( null, ex.getMessage());
        }


    }

    manager.getTransaction().begin();
    manager.persist(vendas);
    manager.getTransaction().commit();

    system.out.println(vendas);

    nagager.close();
    factory.close();

    }
}