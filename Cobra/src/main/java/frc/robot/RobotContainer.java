/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.OuttakeIn;
import frc.robot.commands.OuttakeOut;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Manipulator;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain drivetrain = new Drivetrain();
  private final Manipulator manipulator = new Manipulator();

  private final TankDrive m_autoCommand = new TankDrive(drivetrain);

  public static Joystick driverJoystick = new Joystick(0);
  public static JoystickButton buttonA = new JoystickButton(driverJoystick, 1);
  public static JoystickButton buttonB = new JoystickButton(driverJoystick, 2);
  public static JoystickButton buttonX = new JoystickButton(driverJoystick, 3);
  public static JoystickButton buttonY = new JoystickButton(driverJoystick, 4);
  public static JoystickButton buttonLB = new JoystickButton(driverJoystick, 5);
  public static JoystickButton buttonRB = new JoystickButton(driverJoystick, 6);


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    buttonLB.whileHeld(new IntakeIn(manipulator));
    buttonRB.whileHeld(new OuttakeOut(manipulator));

    buttonA.whileHeld(new IntakeOut(manipulator));
    buttonB.whileHeld(new OuttakeIn(manipulator));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
