package org.ezequiel.hibernateapp;

import jakarta.persistence.EntityManager;
import org.ezequiel.hibernateapp.entity.Cliente;
import org.ezequiel.hibernateapp.util.JpaUtil;

import java.util.List;

public class HibernateListar {
    public static void main(String[]args){


        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c").getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }
}
