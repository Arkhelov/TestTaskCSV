import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String path = "resources/data.csv";
    public static void main(String[] args) throws IOException, SQLException {
        ConnectorSQL connectorSQL = new ConnectorSQL();
        connectorSQL.CreateTable();
        ParserCSV parserCSV =new ParserCSV();
        parserCSV.Parser(path);
        }
    }

