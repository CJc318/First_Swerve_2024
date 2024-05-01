package frc.robot.subsystems;

import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.Odometry;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.math.kinematics.WheelPositions;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    private static Drivetrain instance = null; 
    
    public static final double WHEEL_OFFSET_METERS = Units.inchesToMeters(13.0 - 2.5); // <- Same value as 2024 drive train 
    
    //Kinematics
    SwerveDriveKinematics m_swerveDriveKinematics = new SwerveDriveKinematics(
        new Translation2d( -WHEEL_OFFSET_METERS, WHEEL_OFFSET_METERS),   
        new Translation2d( -WHEEL_OFFSET_METERS, -WHEEL_OFFSET_METERS),
        new Translation2d( WHEEL_OFFSET_METERS, WHEEL_OFFSET_METERS),
        new Translation2d( WHEEL_OFFSET_METERS, -WHEEL_OFFSET_METERS)
    );
    
}
