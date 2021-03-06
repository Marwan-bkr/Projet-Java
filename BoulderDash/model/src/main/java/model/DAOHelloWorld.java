package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.*;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOHelloWorld extends DAOEntity<Entity> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOHelloWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final HelloWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	@Override
	public HelloWorld find(final String level) {
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{addlevel2}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, level);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			//if (resultSet.first()) {
				helloWorld = new HelloWorld(a, resultSet.getString("a"), b, resultSet.getString("b"));
				System.out.println("ok" + resultSet);
			//}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
