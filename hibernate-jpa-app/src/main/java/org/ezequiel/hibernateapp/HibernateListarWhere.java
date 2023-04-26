package org.ezequiel.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.ezequiel.hibernateapp.entity.Cliente;
import org.ezequiel.hibernateapp.util.JpaUtil;

import java.util.Scanner;

public class HibernateListarWhere {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.formaPago=?1", Cliente.class);
        System.out.println("Ingrese un forma de Pago: ");
        String pago = s.next();
        query.setParameter(1,pago);
        Cliente c = (Cliente) query.getSingleResult();
        System.out.println(c);
        em.close();

    }
}
