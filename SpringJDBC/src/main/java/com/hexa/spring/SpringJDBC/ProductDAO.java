package com.hexa.spring.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ProductDAO {

		JdbcTemplate jdbcTemplate;
		DataSource datasource;
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		public DataSource getDatasource() {
			return datasource;
		}
		public void setDatasource(DataSource datasource) {
			this.datasource = datasource;
		}
		
		public int insertPro(Product pro) {
			String insertQuery = "insert into Product values('"+pro.getProId()+"','"+pro.getProName()+"')";
			return jdbcTemplate.update(insertQuery);
		}
		public int updatepro(Product pro) {
			String insertQuery = "update Product set pname= '"+pro.getProName()+"' "+"where pid='"+pro.getProId()+"'";
			return jdbcTemplate.update(insertQuery);
		}
		public int delete(int id) {
			String deleteQuery = "delete from Product where pid= '"+id+"'";
			return jdbcTemplate.update(deleteQuery);
		}
		public List<Product> selectData() {
			String sql = "select * from Product";
			return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {
				public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> em = new ArrayList<Product>();
				while(rs.next()) {
					Product e=new Product();
					e.setProId(rs.getInt(1));
					e.setProName(rs.getString(2));
					em.add(e);
				}
				return em;
			}
 		});
		
}
}