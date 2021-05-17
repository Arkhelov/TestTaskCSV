
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvNumber;

public class Data {
    @CsvBindByName(column = "id")
    @CsvBindByPosition(position = 0)
    private String id;


    @CsvBindByName(column = "name")
    @CsvBindByPosition(position = 1)
    private String name;

    @CsvBindByName(column = "otd")
    @CsvBindByPosition(position = 2)
    private String otd;

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtd() {
        return otd;
    }

    public void setOtd(String otd) {
        this.otd = otd;
    }

    public String toString(){
        return id + name + otd;
//        return "Data{" +"id='" + id + '\'' + ", name='" +name + '\'' + ", otd='" + otd +'\'' + '}';
    }
    }

