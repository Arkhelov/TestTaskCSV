import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

public class ParserCSV {
    public static void Parser (String path) throws IOException, SQLException {

        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "Cp1251");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        List<Data> list = new CsvToBeanBuilder(reader).withSkipLines(1).withSeparator(';').withFieldAsNull(CSVReaderNullFieldIndicator.NEITHER).withQuoteChar('"').withType(Data.class).build().parse();

        for (Object object: list) {
            Data data = (Data) object;
            ConnectorSQL connectorSQL = new ConnectorSQL();
            connectorSQL.AddInTable(data.getId(),data.getName(),data.getOtd());
            System.out.println(data.toString());
        }
    }

}
