package eu.interopehrate.hri.thri;

public class HealthRecordIndexFactory {

    private HealthRecordIndexFactory(){

    }

    public static HealthRecordIndexImpl create(){
        return new HealthRecordIndexImpl();
    }
}
