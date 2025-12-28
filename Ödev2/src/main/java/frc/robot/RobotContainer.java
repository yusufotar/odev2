package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.KrakenSubsystem;

public class RobotContainer {
  private final KrakenSubsystem krakenSubsystem = new KrakenSubsystem();
  private final Joystick joystick = new Joystick(0);
  private final JoystickButton button1 = new JoystickButton(joystick, 1);
  private final JoystickButton button2 = new JoystickButton(joystick, 2);

  public RobotContainer() {
    ConfigureButtonBindings();
  }

  private void ConfigureButtonBindings() {
    button1.whileTrue(
      krakenSubsystem.run(() -> krakenSubsystem.SetMotorVoltage(6.0))
    );

    button2.whileTrue(
      krakenSubsystem.run(() -> krakenSubsystem.SetMotorVoltage(-6.0))
    );

    krakenSubsystem.setDefaultCommand(
      krakenSubsystem.run(() -> krakenSubsystem.stopMotor())
    );
  }
}