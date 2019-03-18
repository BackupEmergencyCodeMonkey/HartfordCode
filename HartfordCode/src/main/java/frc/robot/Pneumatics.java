package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Pneumatics {
    private Compressor compressor;
    private DoubleSolenoid solenoid1;
    private DoubleSolenoid solenoid2;
    private DoubleSolenoid solenoid3;
    private DoubleSolenoid solenoid4;
    public Pneumatics(Compressor c, DoubleSolenoid s1, DoubleSolenoid s2, DoubleSolenoid s3, DoubleSolenoid s4) {
        solenoid1 = s1;
        solenoid2 = s2;
        solenoid3 = s3;
        solenoid4 = s4;
        compressor = c;
    }
}