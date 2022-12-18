package Task6.Pr11;

public class KelvinConverter implements Convertable {

    @Override
    public double getConverted(double temperature) {
        return temperature + 273.15;
    }
}
