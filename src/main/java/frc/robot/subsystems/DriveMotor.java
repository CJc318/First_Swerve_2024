package frc.robot.subsystems;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.util.Units;

public class DriveMotor {
    private TalonFX m_driveMotor;

    //All values will be the same as 2024 robot until changed
    private static final CurrentLimitsConfigs CURRENT_LIMITS_CONFIGS = new CurrentLimitsConfigs()
        .withSupplyCurrentThreshold(0)
        .withSupplyTimeThreshold(0)
        .withSupplyCurrentLimit(0);
    private static final double PERCENT_DEADBAND = 0.001; 

    //Constants 
    private static final double WHEEL_RADIUS_METERS = Units.inchesToMeters(0.0 / 0.0);
    private static final double GEAR_RATIO = 0.0 / 0.0;

    //PIDs (bring over PIDs from 2024 robot to match)
    private static final int K_TIMEOUT_MS = 0;
    private static final Slot0Configs PID_GAINS = new Slot0Configs().withKP(0).withKV(0);

    //Motion Magic from 24 bot
    private static final double FALCON_500_MAX_SPEED_RPS = 6380.0 / 60;
    private static final MotionMagicConfigs MOTION_MAGIC_CONFIGS = new MotionMagicConfigs()
        .withMotionMagicCruiseVelocity(FALCON_500_MAX_SPEED_RPS)
        .withMotionMagicAcceleration(FALCON_500_MAX_SPEED_RPS * (100.0 / 15.0));

    public static final double MAX_SPEED_METERS_PER_SEC = 5.0;

}
