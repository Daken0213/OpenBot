package org.openbot.vehicle;

import org.openbot.env.SensorReading;

public class Battery {
    private final SensorReading batteryVoltage = new SensorReading();
    private float lowBatteryVoltage;
    private float maxBatteryVoltage;

    public Battery(float lowBatteryVoltage = 90.f, float maxBatteryVoltage = 12.6f) {
        this.lowBatteryVoltage = lowBatteryVoltage;
        this.maxBatteryVoltage = maxBatteryVoltage;
    }

    public float getLowBatteryVoltage() {
        return lowBatteryVoltage;
    }
    
    public void setLowBatteryVoltage(float lowBatteryVoltage) {
        this.lowBatteryVoltage = lowBatteryVoltage;
    }
    
    public float getMaxBatteryVoltage() {
        return maxBatteryVoltage;
    }
    
    public void setMaxBatteryVoltage(float maxBatteryVoltage) {
        this.maxBatteryVoltage = maxBatteryVoltage;
    }

    public float getBatteryVoltage() {
        return batteryVoltage.getReading();
    }
    
    public int getBatteryPercentage() {
        return (int)
            ((batteryVoltage.getReading() - lowBatteryVoltage)
                * 100
                / (maxBatteryVoltage - lowBatteryVoltage));
    }
    
    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage.setReading(batteryVoltage);
    }
    

}