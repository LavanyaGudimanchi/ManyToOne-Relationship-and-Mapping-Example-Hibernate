package com.perscholas.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Department dep = new Department();
        dep.setDname("IT");

        Department dep1= new Department();
        dep.setDname("HR");

        Department dep2= new Department(3,"Medicine");

        Teacher t1 = new Teacher();
        t1.setDepartment(dep);
        t1.setSalary("1000");
        t1.setTeachername("MHaseeb");

        Teacher t2 = new Teacher();
        t2.setDepartment(dep1);
        t2.setSalary("2220");
        t2.setTeachername("Shahparan");

        Teacher t3 = new Teacher();
        t3.setDepartment(dep);
        t3.setSalary("30000");
        t3.setTeachername("James");

        Teacher t4 = new Teacher();
        t3.setDepartment(dep2);
        t3.setSalary("40000");
        t3.setTeachername("Joseph");

        session.save(dep);
        session.save(dep2);
        session.save(dep1);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        t.commit();



}

    }
