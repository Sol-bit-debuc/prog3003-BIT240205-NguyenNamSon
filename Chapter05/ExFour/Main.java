package ExFour;

import ExThree.HibernateUtil;
import ExThree.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        try {
            // HQL query
            List<Product> products =
                    session.createQuery(
                            "FROM Product WHERE price > 1000",
                            Product.class
                    ).getResultList();

            // in kết quả
            for (Product p : products) {
                System.out.println(
                        p.getId() + " - "
                        + p.getName() + " - "
                        + p.getPrice()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}