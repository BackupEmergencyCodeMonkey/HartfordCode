/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  Joystick driveStick = new Joystick(0);
  Joystick turnStick = new Joystick(1);
  Joystick copilotStick = new Joystick(2);

  boolean intakePush;
  boolean intakePull;
  boolean lowClimb;
  boolean highClimb;
  boolean syringePull;
  boolean syringePush;


  WPI_TalonSRX driveLeadLeft = new WPI_TalonSRX(1);
  WPI_VictorSPX driveMiddleLeft = new WPI_VictorSPX(2);
  WPI_VictorSPX driveBackLeft = new WPI_VictorSPX(3);
  WPI_TalonSRX driveLeadRight = new WPI_TalonSRX(4);
  WPI_VictorSPX driveMiddleRight = new WPI_VictorSPX(5);
  WPI_VictorSPX driveBackRight = new WPI_VictorSPX(6);

  WPI_TalonSRX elevatorDriver = new WPI_TalonSRX(9);

  SpeedControllerGroup leftSide = new SpeedControllerGroup(driveLeadLeft, driveMiddleLeft, driveBackLeft);
  SpeedControllerGroup rightSide = new SpeedControllerGroup(driveLeadRight, driveMiddleRight, driveBackRight);
  DifferentialDrive chassisDrive = new DifferentialDrive(leftSide, rightSide);

  DoubleSolenoid s1 = new DoubleSolenoid(0, 7);
  DoubleSolenoid s2 = new DoubleSolenoid(1, 6);
  DoubleSolenoid s3 = new DoubleSolenoid(2, 5);
  DoubleSolenoid s4 = new DoubleSolenoid(3, 4);

  Compressor comp = new Compressor(0);
  @Override
  public void robotInit() {
    comp.setClosedLoopControl(true);
    s1.set(Value.kReverse);
  }
  @Override
  public void autonomousInit() {
    comp.setClosedLoopControl(true);
  }
  @Override
  public void autonomousPeriodic() {
  }
  @Override
  public void teleopInit() {
    comp.setClosedLoopControl(true);
  }
  @Override
  public void teleopPeriodic() {
  
  }
  @Override
  public void testInit() {
  
  }
  @Override
  public void testPeriodic() {
  
  }
}