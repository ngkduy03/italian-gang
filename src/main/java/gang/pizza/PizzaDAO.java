package gang.pizza;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import gang.data.HibernateUtil;

public class PizzaDAO {
	@SuppressWarnings("unchecked")
	public static List<Pizza> selectAllPizza() {
		try {
			return HibernateUtil.getSessionFactory().openSession()
					.createQuery("FROM Pizza p ORDER BY p.pId ASC").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void addPizza(Pizza pizza) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			session.save(pizza);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				e.printStackTrace();
			}
		}
	}

	public static void updatePizza(Pizza pizza) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(pizza);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public static void deletePizzaById(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			Pizza pizza = session.get(Pizza.class, id);
			if (pizza != null) {
				session.delete(pizza);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public static Pizza selectPizzaById(int id) {
		Transaction transaction = null;
		Pizza pizza = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			pizza = (Pizza) session.createQuery("FROM Pizza p WHERE p.pId = :id")
					.setParameter("id", id).uniqueResult();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return pizza;
	}
}
