package test07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class OracleDao implements Dao {
	Connection con = DBConnect.con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int updateCount;
	String sql;
	Product p = null;
	
	@Override
	public void insert(Product p) {
		try {
			sql = "insert into product values(dept_exam_seq.nextval,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			
		}
	}

	@Override
	public Product select(int num) {
		try {
			sql = "SELECT * FROM product Where num = " + num; //SQL문
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3));
		} catch (SQLException e) {
			
		}
		return p;
	}

	@Override
	public Vector<Product> selectAll() {
		Vector<Product> v = new Vector<>();
		try {
			sql = "SELECT * FROM product"; //SQL문
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				v.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			
		}
		return v;
	}

	@Override
	public void delete(int num) {
		try {
			sql = "Delete From product where num = " + num;
			pstmt = con.prepareStatement(sql);
			updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			
		}
	}

	@Override
	public void update(int num, Product p) {
		try {
			sql = "Update product Set name = '" + p.getName() + "', price = " + p.getPrice() + "Where num = " + num;
			pstmt = con.prepareStatement(sql);
			updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL실행오류");
		}
	}
}

