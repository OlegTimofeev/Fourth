package cars;
import java.math.BigDecimal;

public class Car {
    private String code;
    private Mark mark;
    private Model model;
    private int year;
    private BigDecimal price;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(String color) throws NullPointerException {

        this.color = Color.valueOf(color);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>999&&year<10000)
        this.year = year;
    }
}
