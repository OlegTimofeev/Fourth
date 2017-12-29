package cars;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public interface CarsDAO {

    List<Car> getCars();

    void setCars(List<Car> cars);

    String countOfCars(Scanner sc);

    void fromStringToCar(String str);

    void getAllCars() throws IOException;

}
