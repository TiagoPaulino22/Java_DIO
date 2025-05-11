package com.dio;

import com.dio.persistence.migration.MigrationStrategy;
import java.sql.SQLException;

import static com.dio.persistence.config.ConnectionConfig.getConnection;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		try(var connection = getConnection()){
			
			new MigrationStrategy(connection).executeMigration();
			
		}
			
		
	}

}
