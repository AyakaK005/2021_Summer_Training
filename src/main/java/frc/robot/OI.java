package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI extends DefaultOI {
  
  
  
    public OI() {
      super();
      
      SmartDashboard.putData("Drive straight", new DriveStraightContinuous(Robot.drive, 0, 0)); 
     
    }
  }