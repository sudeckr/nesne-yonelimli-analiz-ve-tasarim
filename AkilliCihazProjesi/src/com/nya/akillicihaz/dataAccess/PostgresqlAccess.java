package com.nya.akillicihaz.dataAccess;

import java.sql.*;

public class PostgresqlAccess implements IDataBaseAccess {
	
	String dbAdi = "postgres";
	String dbSifre ="sudeselim" ;
	String url = "jdbc:postgresql://localhost/kullanici_db";
	Connection connection = null;
	
	@Override
	public void baglan() {
		try {
			connection = DriverManager.getConnection(url,dbAdi,dbSifre);
		} catch (SQLException e) {
			System.out.println("veri tabanna bağlanılamadı..");
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		return connection;
	}

}
