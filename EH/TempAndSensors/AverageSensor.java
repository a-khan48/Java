import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private List<Sensor> list;
    private List<Integer> reading;

    public AverageSensor(){
        this.list = new ArrayList<>();
        this.reading = new ArrayList<>();
    }
    public boolean isOn(){
        for(Sensor sensor: this.list){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    @Override
    public void setOn(){
        for(Sensor sensor: this.list){
            sensor.setOn();
        }
    }
    @Override
    public void setOff(){
        for(Sensor sensor: this.list){
            sensor.setOff();
        }
    }
    @Override
    public int read(){
        if(!(this.isOn() || this.list.isEmpty())){
            throw new IllegalStateException();
        }
        int sum = 0;
        for(Sensor sensor: this.list){
            sum += sensor.read();
        }
        int average = sum / this.list.size();
        this.reading.add(average);
        return average;
    }
    public void addSensor(Sensor toAdd){
        this.list.add(toAdd);
    }
    public List<Integer> readings(){
        return this.reading;
    }
}