package jdbc.persistence;

import jdbc.persistence.entity.EmployeeEntity;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.StatementImpl;

public class EmployeeDAO {
 
	// Método para inserção de registros na tabela employees
	 public void insert(final EmployeeEntity entity) {
		 
		 try(
				 var connection = ConnectionUtil.getConnection();
				 var statement = connection.createStatement()){
			
			var sql = "INSERT INTO employees (name, salary, birthday) VALUES ('" + 
					entity.getName() + "', " + 
					entity.getSalary().toString() + ", " +
					"'" + formatOffsetDateTime(entity.getBirthday()) + "' )";
			
			statement.executeUpdate(sql);
			System.out.printf("Foram afetados %s registros na base de dados", statement.getUpdateCount());
			
			if(statement instanceof StatementImpl impl) {
				entity.setId(impl.getLastInsertID());
				
			}
			 
		 }catch(SQLException ex) {
			 ex.printStackTrace();
		 }
	}
	 
	 
	 // Consulta para atualização/modificaçao de resgistros na tabela employees
	 public void update(final EmployeeEntity entity) {
		 
			 try(
					 var connection = ConnectionUtil.getConnection();
					 var statement = connection.createStatement()
				){
				
				var sql = "UPDATE employees SET " + 
						"name      = '" + entity.getName() + "'," + 
						"salary    = " + entity.getSalary().toString() + "," +
						"birthday  = '" + formatOffsetDateTime(entity.getBirthday()) + "'" +
						"WHERE id  = " + entity.getId();
				
				statement.executeUpdate(sql);
				System.out.printf("Foram afetados %s registros na base de dados", statement.getUpdateCount());
				
				if(statement instanceof StatementImpl impl) {
					entity.setId(impl.getLastInsertID());
					
				}
				 
			 }catch(SQLException ex) {
				 ex.printStackTrace();
			 }
		 
	 }
	 
	 
	 
	 // Método para deletar registro 
	 public void delete(final long id) {
		 
		 try(
				 var connection = ConnectionUtil.getConnection();
				 var statement = connection.createStatement()
						 ){
			
			var sql = "DELETE FROM employees WHERE id = " + id;		
			statement.executeUpdate(sql);	
			
			}catch(SQLException ex) {
				ex.printStackTrace();
		 }
		  
	 }
	 
	 
	 
	 // Método de consulta que entrega uma lista com registros pesquisados na tabela
	 public List<EmployeeEntity> findAll(){
		 
		 List<EmployeeEntity> entities = new ArrayList<>();
		 
		 try(
				 var connection = ConnectionUtil.getConnection();
				 var statement = connection.createStatement()
			){
			
			statement.executeQuery("SELECT* FROM employees ORDER BY salary");
			var resultSet = statement.getResultSet();
			
			while(resultSet.next()) {
				var entity = new EmployeeEntity();
				
				entity.setId(resultSet.getLong("id"));
				entity.setName(resultSet.getString("name"));
				entity.setSalary(resultSet.getBigDecimal("salary"));
				
				var birthdayInstant = resultSet.getTimestamp("birthday").toInstant();
				var birthday = OffsetDateTime.ofInstant(birthdayInstant, ZoneOffset.UTC );
				entity.setBirthday(birthday);
				
				entities.add(entity);
			}
				
			}catch(SQLException ex) {
			 ex.printStackTrace();
		 }
		 
		return entities;
	 }
	 
	 
	// Método de consulta por Id que entrega uma lista com o registro da consulta. 
	 public EmployeeEntity findById(final long id) {
		 
		 var entity = new EmployeeEntity();
		 
		 try(
				 var connection = ConnectionUtil.getConnection();
				 var statement = connection.createStatement()
			){
			
			statement.executeQuery("SELECT* FROM employees WHERE id = " + id);
			var resultSet = statement.getResultSet();
			
			if(resultSet.next()) {
				
				entity.setId(resultSet.getLong("id"));
				entity.setName(resultSet.getString("name"));
				entity.setSalary(resultSet.getBigDecimal("salary"));
				
				var birthdayInstant = resultSet.getTimestamp("birthday").toInstant();
				var birthday = OffsetDateTime.ofInstant(birthdayInstant, ZoneOffset.UTC );
				entity.setBirthday(birthday);
			
			}
				
			}catch(SQLException ex) {
			 ex.printStackTrace();
		 }
		 
		return entity;
	 }
	 
	 
	 
	 // Formatação da data de aniversário
	 private String formatOffsetDateTime(final OffsetDateTime dateTime) {
		 // Conversão para a zona UTC
		 var utcDatetime = dateTime.withOffsetSameInstant(ZoneOffset.UTC);
		 
		 return dateTime.format((DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		 
	 }
}
