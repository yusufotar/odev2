package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class KrakenSubsystem extends SubsystemBase {
    private final TalonFX krakenMotor;

    public KrakenSubsystem() {
        krakenMotor = new TalonFX(1);
    }

    public void SetMotorVoltage(double voltage) {
        krakenMotor.setVoltage(voltage);
    }

    public void stopMotor() {
        krakenMotor.setVoltage(0);
    }
}
