/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.TankDrive;

/**
 * An example subsystem. You can replace with me with your own subsystem.
 */
public class Drivetrain extends Subsystem {

  VictorSP driveLeft = new VictorSP(0);
  VictorSP driveRight = new VictorSP(1);

  DifferentialDrive drive = new DifferentialDrive(driveLeft, driveRight);

  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void tankDrive(double left, double right) {
    drive.tankDrive(left, right);
  }

  public void arcadeDrive(double throttle, double rotation) {
    drive.arcadeDrive(throttle, rotation);
  }

  public void stopDrive() {
    drive.stopMotor();
  }
}
