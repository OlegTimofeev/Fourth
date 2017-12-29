package cars;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public final static void main(String []args) throws IOException {
        List<Car> cars;
        CarServiceImpl carService= new CarServiceImpl();
        carService.sortPrice(1);
        carService.sortPrice(-1);
        cars=carService.findMark("lada");
        cars=carService.findModel("diablo");
    }
}
