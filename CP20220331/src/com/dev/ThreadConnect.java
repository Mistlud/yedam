package com.dev;

import java.sql.SQLException;
import java.util.*;

public class ThreadConnect extends Connect {
	// 게시글표시, 게시글등록, 체크, 수정, 삭제
	Scanner scn = new Scanner(System.in);

	public List<ThreadE> resList() { // 게시글표시
		List<ThreadE> res = new ArrayList<ThreadE>();
		conn = super.getConnect();
		try {
			psmt = conn.prepareStatement("select * from thisres where res_num <> 0 order by res_num");
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
		conn = getConnect();
		String sql = "Update thisres set res_in = ?, res_hi = ?\r\n" + "where res_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(3, t1.getResNo());
			psmt.setString(1, t1.getResIn());
			psmt.setString(2, t1.getResDate());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void deleteRes(int resno) { // 게시글삭제
		conn = getConnect();
		String sql = "delete from thisres where res_num = ?";
		System.out.println("게시물 삭제를 확인합니다. 삭제하려면 게시물 번호'" + resno + "'를 다시 한 번 입력해 주십시오.");
		int delete = scn.nextInt();
		if (delete == resno) {
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, resno);
				psmt.executeUpdate();
				System.out.println("삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		} else {
			System.out.println("삭제가 취소되었습니다.");
			disconnect();
		}

	}

	public void deleteResPlus(int resno) { // 게시글 삭제시 거기 달린 댓글도 삭제
		conn = getConnect();
		String sql = "delete from resres where res_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, resno);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void deleteResres(int resresno) { // 댓글삭제
		conn = getConnect();
		String sql = "delete from resres where resres_num = ?";
		System.out.println("댓글 삭제를 확인합니다. 삭제하려면 댓글 번호'" + resresno + "'를 다시 한 번 입력해 주십시오.");
		int delete = scn.nextInt();
		if (delete == resresno) {
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, resresno);
				psmt.executeUpdate();
				System.out.println("삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
		} else {
			System.out.println("삭제가 취소되었습니다.");
			disconnect();
		}

	}

	public int findNo() { // 게시글 작성시 다음 숫자 매기기
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
		} finally {
			disconnect();
		}
		return r;
	}

	public int findNo2(int ff) { // 댓글 작성시 다음 숫자 매기기
		int r = 0;
		conn = getConnect();
		String sql = "select max(resres_num) from resres where res_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ff);
			rs = psmt.executeQuery();
			if (rs.next()) {
				r = rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return r;
	}

	public void clear() {
		conn = getConnect();
		String sql = "delete from thisres where res_num <> 0";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public int onOff(int i) {
		if (i == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public List<ThreadE> resresList(int num) { // 댓글표시
		List<ThreadE> res = new ArrayList<ThreadE>();
		conn = super.getConnect();
		try {
			psmt = conn.prepareStatement("select * from resres\r\n" + "where res_num = ? order by resres_num");
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			while (rs.next()) {
				ThreadE t1 = new ThreadE();
				t1.setResNo(rs.getInt("resres_num"));
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
	}

	public ThreadE lookupRes(int num) {
		conn = getConnect();
		ThreadE res = null;
		String sql = "select * from thisres where res_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				res = new ThreadE();
				res.setResNo(rs.getInt("res_num"));
				res.setResIn(rs.getString("res_in"));
				res.setResDate(rs.getString("res_hi"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return res;
	}

	public void insertResres(ThreadE tt1) {
		conn = getConnect();
		String sql = "insert into resres values (?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, tt1.getResNo());
			psmt.setString(2, tt1.getResIn());
			psmt.setString(3, tt1.getResDate());
			psmt.setInt(4, tt1.getResresNo());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public int findres(int resnum) {
		int r = 0;
		conn = getConnect();
		String sql = "select max(resres_num) from resres where res_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, resnum);
			rs = psmt.executeQuery();
			if (rs.next()) {
				r = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

}