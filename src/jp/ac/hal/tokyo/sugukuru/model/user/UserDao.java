package jp.ac.hal.tokyo.sugukuru.model.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import jp.ac.hal.tokyo.sugukuru.model.Dao;


public class UserDao extends Dao {

	private PreparedStatement prepared;
	private Statement statement;
	private ResultSet result;

}
