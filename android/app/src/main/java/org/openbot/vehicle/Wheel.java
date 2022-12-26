package org.openbot.vehicle;

import org.openbot.env.SensorReading;
public class Wheel {
    private final SensorReading WheelRpm = new SensorReading();
    private float minMotorVoltage = 2.5f;

    public Wheel()


    public float getMinMotorVoltage() {
        return minMotorVoltage;
    }
    
    public void setMinMotorVoltage(float minMotorVoltage) {
        this.minMotorVoltage = minMotorVoltage;
    }
    public float WheelRpm() {
        return WheelRpm.getReading();
    }
    
    public void setWheelRpm(float WheelRpm) {
        this.WheelRpm.setReading(WheelRpm);
    }
}
