package gang.user;

import org.hibernate.Session;
import org.hibernate.Transaction;

import gang.data.HibernateUtil;

public class UserDAO {
	public static User selectUser(String account) {
		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			user = (User) session.createQuery(" FROM User u WHERE u.email = :account")
					.setParameter("account", account).uniqueResult();

			System.out.println("hello" + user.getAccount());
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return user;
	}

	public static boolean accountExists(String account) {
		User u = selectUser(account);

		return u != null;
	}

	public static boolean checkLoginUser(String account, String password) // Use to login
	{
		Transaction transaction = null;
		User user = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			user = (User) session.createQuery(" FROM User u WHERE u.email = :account AND u.password = :password")
					.setParameter("account", account).setParameter("password", password).uniqueResult();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return user != null;
	}

	public static void addUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			session.save(user);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
