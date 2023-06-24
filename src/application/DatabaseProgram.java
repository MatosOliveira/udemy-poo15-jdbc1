/**
 * 
 */
package application;

import java.sql.Connection;

import db.Database;

/**
 * @author Matos
 *
 */
public class DatabaseProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection conn = Database.getConnection();
		
		Database.closeConnection();

	}

}
