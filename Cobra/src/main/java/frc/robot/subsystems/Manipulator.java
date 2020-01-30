/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Manipulator extends SubsystemBase {
  VictorSP intake = new VictorSP(7);
  VictorSP outtake = new VictorSP(9);

  /**
   * Creates a new Manipulator.
   */
  public Manipulator() {

  }

  public void intakeIn(double power) {
    intake.set(power);
  }
  
  public void intakeOut(double power) {
    intake.set(-power);
  }

  public void intakeStop() {
    intake.stopMotor();
  }

  public void outtakeIn(double power) {
    outtake.set(power);
  }

  public void outtakeOut(double power) {
    outtake.set(-power);
  }

  public void outtakeStop() {
    outtake.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
