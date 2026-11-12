package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public DcMotor fl, fr, bl, br;
    public Hardware(HardwareMap hm) {
        fr = hm.get(DcMotor.class, "fr");
        bl = hm.get(DcMotor.class, "bl");
        br = hm.get(DcMotor.class, "br");

        br.setDirection(DcMotorSimple.Direction.REVERSE);
        fr.setDirection(DcMotorSimple.Direction.REVERSE);
    }

}
