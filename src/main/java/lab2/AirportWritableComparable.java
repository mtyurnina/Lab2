package lab2;

import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable {
    private int airportCode;
    private int indicator;

    public AirportWritableComparable(int airportCode, int indicator) {
        this.airportCode = airportCode;
        this.indicator = indicator;
    }

    public int getAirportCode() {
        return airportCode;
    }

    public int getIndicator() {
        return indicator;
    }

    @Override
    public int CompareTo(AirportWritableComparable object) {

    }

    @Override
    public void readFields(DataOutput dataOutput) throws IOException {
        dataOutput.write();
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }
}