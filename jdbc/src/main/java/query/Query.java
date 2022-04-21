package query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.jdbc.pool.DataSource;

public class Query {
	private DataSource dataSource;
	
	public Query(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public int count() {
		Connection con = null;
		try {
			con = dataSource.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select count(*) from user");
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					/* ... */
				}
			}
		}
	}
}
