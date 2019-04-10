package javaspringexamples.springJDBC.InitializingDb;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:conf.xml");
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);

		Connection connection = dataSource.getConnection();
		System.out.println(connection.isClosed());
		connection.close();
		System.out.println(connection.isClosed());
	}
}