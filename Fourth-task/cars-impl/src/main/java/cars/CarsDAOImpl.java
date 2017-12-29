package cars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarsDAOImpl implements CarsDAO {
    private List<String> code;
    private List<Car> cars;

    public CarsDAOImpl() throws IOException {
        cars = new ArrayList<Car>();
        code = new ArrayList<String>();
        getAllCars();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String countOfCars(Scanner sc) {
        String str = "";
        while (sc.hasNext()) {
            str = str.concat(sc.nextLine());
        }
        return str;
    }

    public void fromStringToCar(String str) {
        String[] carPart = str.split("[;]+");
        boolean createCar=false;
        for(Color i: Color.values()){
            if(carPart[2].trim().equalsIgnoreCase(i.toString())){
                createCar=true;
            }
        }
        if(!code.contains(carPart[1])&&createCar) {
            code.add(carPart[1]);
            Car car = new Car();
            car.setCode(carPart[1]);
            car.setColor(carPart[2].trim().toUpperCase());
            car.setMark(new Mark(carPart[3].trim(), carPart[1].trim()));
            car.setModel(new Model(carPart[4].trim(), carPart[1].trim()));
            car.setYear(Integer.parseInt(carPart[5].trim()));
            car.setPrice(BigDecimal.valueOf(Double.parseDouble(carPart[6].trim())));
            cars.add(car);
        }
    }


    public void getAllCars() {
        FileReader fr=null;
        Scanner cs=null;
        try{ fr = new FileReader("cars.dat");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fr);
        String str="";
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            fromStringToCar(str);
        }
        sc.close();
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
