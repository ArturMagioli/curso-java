package secao19.application;

import java.sql.Connection;

import secao19.db.DB;

public class Program {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
