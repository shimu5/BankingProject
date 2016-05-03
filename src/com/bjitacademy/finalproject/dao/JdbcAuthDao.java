package com.bjitacademy.finalproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import com.bjitacademy.finalproject.domains.UserAccount;



public class JdbcAuthDao extends SimpleJdbcDaoSupport implements UserAuthDao{
	private static final String SELECT_SQL = "select LoginId, Password, LoginType,BankAccNumber from UserAccount "
			+"where LoginId= ? ";
	
	public UserAccount UserAccountInfo(UserAccount searchaccnt){
		
		try{
			return getSimpleJdbcTemplate().queryForObject(SELECT_SQL,new RowMapper<UserAccount>(){
				public UserAccount mapRow(ResultSet rs,int rowNumber) throws SQLException{
					UserAccount useraccount = new UserAccount();
					useraccount.setLoginId(rs.getString("LoginId"));
					useraccount.setPassword(rs.getString("Password"));
					useraccount.setLoginType(rs.getString("loginType"));
					useraccount.setBankAccNumber(rs.getInt("bankAccNumber"));
					return useraccount;

				}
			},searchaccnt.getLoginId());
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
		
	}

}
