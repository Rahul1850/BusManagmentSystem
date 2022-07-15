package summerClasses.BusTicketSystem;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    private String busNumber;
    private String operatorName;
    private String source;
    private String destination;
    private int fair;
    private int seat;
public Bus(String busNumber ,String operatorName,String source,String destination,int fair,int seat){
    this.busNumber=busNumber;
    this.operatorName=operatorName;
    this.source=source;
    this.destination=destination;
    this.fair=fair;
    this.seat=seat;


}

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getFair() {
        return fair;
    }

    public void setFair(int fair) {
        this.fair = fair;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "BusNumber='" + busNumber + '\'' +
                ", OperatorName='" + operatorName + '\'' +
                ", Source='" + source + '\'' +
                ", Destination='" + destination + '\'' +
                ", Fair=" + fair +
                ", Seat=" +seat+
                "}\n";
    }
}
