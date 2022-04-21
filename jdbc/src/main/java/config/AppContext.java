package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.UserDao;

@Configuration
public class AppContext {
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhosst/jdbc?characterEncoding=utf8");
		ds.setUsername("jdbc");
		ds.setPassword("jdbc");
		ds.setInitialSize(2);
		ds.setMaxActive(5);
		return ds;
	}
	
	@Bean
	public UserDao userDao() {
		return new UserDao(dataSource());
	}
}
