package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware;

public class Chassis {
    Hardware hardware;
    public Chassis(Hardware hw) {
        hardware = hw;
    }
    public void drive(double fwd, double str, double rot) {
        double denominator = Math.max(Math.abs(fwd) + Math.abs(str) + Math.abs(rot), 1);
        double frontLeftPower = (fwd + str + rot) / denominator;
        double backLeftPower = (fwd - str + rot) / denominator;
        double frontRightPower = (fwd - str - rot) / denominator;
        double backRightPower = (fwd + str - rot) / denominator;

        hardware.fl.setPower(frontLeftPower);
        hardware.fr.setPower(frontRightPower);
        hardware.bl.setPower(backLeftPower);
        hardware.br.setPower(backRightPower);
    }
}
