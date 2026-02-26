package ExThree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // tạo product
            Product p = new Product("Laptop", 1500);

            // lưu vào DB
            session.persist(p);

            tx.commit();

            System.out.println("Lưu sản phẩm thành công!");

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}