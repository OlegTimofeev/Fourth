package cars;

import java.util.List;

public interface CarService {

    void sortPrice( int down);

    List<Car> findMark(String mark);

    List<Car> findModel(String model);

    List<Car> find(String model,String mark);

    List<Car> find(String model, String mark, String color);

    Car find(String code);

}
