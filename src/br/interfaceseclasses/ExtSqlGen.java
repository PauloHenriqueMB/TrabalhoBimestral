package br.interfaceseclasses;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ExtSqlGen extends SqlGen{

	@Override
	protected String getCreateTable(Connection con, Object obj) {
		System.out.println("Criando tabela");
		return null;
	}

	@Override
	protected String getDropTable(Connection con, Object obj) {
		return null;
	}

	@Override
	protected PreparedStatement getSqlInsert(Connection con, Object obj) {
		System.out.println("Inserindo dado na tabela");
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectAll(Connection con, Object obj) {
		System.out.println("Selecionando todos os dados da tabela");
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectById(Connection con, Object obj) {
		System.out.println("Selecionando um udado expecifico na tabela");
		return null;
	}

	@Override
	protected PreparedStatement getSqlUpdateById(Connection con, Object obj) {
		System.out.println("Atualizando um dado por id");
		return null;
	}

	@Override
	protected PreparedStatement getSqlDeleteById(Connection con, Object obj) {
		System.out.println("Removendo um dado pro id");
		return null;
	}
	
}
