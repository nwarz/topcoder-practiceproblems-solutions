/*
https://arena.topcoder.com/#/u/practiceCode/10873/7186/8027/2/265692

A robot is moving in a plane following a set of instructions.

The following instructions are possible (quotes for clarity only):
"LEFT" - turn left 90 degrees
"RIGHT" - turn right 90 degrees
"TURN AROUND" - turn around (a 180 degree turn)
"LEFT X" - turn left X degrees, where X is a positive integer
"RIGHT X" - turn right X degrees, where X is a positive integer
"HALT" - stop executing instructions; further instructions are not executed

You are given a containing the robot's instructions. Initially, the robot is facing north. Return
the robot's final azimuth - the angle between north and the direction the robot is facing. Azimuth
is always measured clockwise, and is a number between 0, inclusive, and 360, exclusive. For example,
 west corresponds to azimuth 270.
 */
public class AzimuthMonitoring {

    public static int getAzimuth(String[] instructions) {
        int azimuth = 0;
        for(String instruction : instructions) {
            if(instruction.startsWith("LEFT")) {
                if(4 == instruction.length()) {
                    azimuth = (azimuth + 270) % 360;
                } else {
                    azimuth = (azimuth + (360 - getDegreePart(instruction))) % 360;
                }
            } else if(instruction.startsWith("RIGHT")) {
                if(5 == instruction.length()) {
                    azimuth = (azimuth + 90) % 360;
                } else {
                    azimuth = (azimuth + getDegreePart(instruction)) % 360;
                }
            } else if("TURN AROUND".equals(instruction)) {
                azimuth = (azimuth + 180) % 360;
            } else if("HALT".equals(instruction)) {
                return azimuth;
            }
        }
        return azimuth;
    }

    private static int getDegreePart(String instruction) {
        return Integer.parseInt(instruction.split(" ")[1]);
    }
}
