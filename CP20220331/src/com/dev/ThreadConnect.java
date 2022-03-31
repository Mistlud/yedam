package com.dev;

import java.sql.SQLException;
import java.util.*;

public class ThreadConnect extends Connect {
	// 게시글표시, 게시글등록, 체크, 수정, 삭제

	public List<ThreadE> resList() { // 게시글표시
		List<ThreadE> res = new ArrayList<ThreadE>();
		conn = super.getConnect();
		try {
			psmt = conn.prepareStatement("select * from thisres order by res_num");
			rs = psmt.executeQuery();
			while (rs.next()) {
				ThreadE t1 = new ThreadE();
				t1.setResNo(rs.getInt("res_num"));
				t1.setResIn(rs.getString("res_in"));
				t1.setResDate(rs.getString("res_hi"));
				res.add(t1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return res;
	} // End of resList

	public void insertRes(ThreadE t1) { // 게시글입력
		conn = getConnect();
		String sql = "insert into thisres(res_num, res_in, res_hi) VALUES (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, t1.getResNo());
			psmt.setString(2, t1.getResIn());
			psmt.setString(3, t1.getResDate());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void changeRes(ThreadE t1) { // 게시글수정

	}

	public void deleteRes(int resno) {

	}

	public int findNo() {
		int r = 0;
		conn = getConnect();
		String sql = "select max(res_num) from thisres";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if (rs.next()) {
				r = rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

}
