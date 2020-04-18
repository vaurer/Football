package va.CC;

import java.util.Random;

public class Management extends Clerk {

    public Management(String firstName, String lastName, int age, double workingHours) {
        super(firstName, lastName, age, workingHours = 0);
    }

    public double membershipFeeDecision() {
        Random random = new Random();
        double membershipFeeDecision = random.nextInt(300);
        return membershipFeeDecision;
    }

}
