/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  VictorSP driveFrontLeft = new VictorSP(0);
  VictorSP driveFrontRight = new VictorSP(4);
  VictorSP driveRearLeft = new VictorSP(5);
  VictorSP driveRearRight = new VictorSP(6);
  
  SpeedControllerGroup driveLeft = new SpeedControllerGroup(driveFrontLeft, driveRearLeft);
  SpeedControllerGroup driveRight = new SpeedControllerGroup(driveFrontRight, driveRearRight);

  DifferentialDrive drive = new DifferentialDrive(driveLeft, driveRight);  

  /**
   * Creates a new ExampleSubsystem.
   */
  public Drivetrain() {

  }

  public void tankDrive(double left, double right) {
    drive.tankDrive(left, right);
  }

  public void stopDrive() {
    drive.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
