package com.dio;

import com.dio.persistence.migration.MigrationStrategy;
import static com.dio.persistence.config.ConnectionConfig.getConnection;
import java.sql.SQLException;

import com.dio.ui.MainMenu;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		try(var connection = getConnection()){
			
			new MigrationStrategy(connection).executeMigration();
			
		}
			
		new MainMenu().execute();
	}

}
