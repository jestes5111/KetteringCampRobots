/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  Joystick driverJoystick = new Joystick(0);
  // Button button = new JoystickButton(stick, buttonNumber);

  public double getDriveLeftY() {
    double y = driverJoystick.getRawAxis(1);
    return y;
  }

  public double getDriveRightY() {
    double y = driverJoystick.getRawAxis(3);
    return y;
  }

  public double getDriveRightX() {
    double x = driverJoystick.getRawAxis(2);
    return x;
  }
}
