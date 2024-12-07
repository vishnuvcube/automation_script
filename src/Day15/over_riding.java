package Day15;

class RBI {
    double ROI() {
        return 0;
    }
}

class SBI extends RBI {//this is declaration
    double ROI() {// this is implementation or body of method
        return 10.05;
    }
}

class HDFC extends RBI {
    double ROI() {
        return 14.05;
    }
}

public class over_riding {

    public static void main(String[] args) {
        RBI r = new RBI();
        System.out.println("RBI ROI: " + r.ROI());

        SBI s = new SBI();
        System.out.println("SBI ROI: " + s.ROI());

        HDFC h = new HDFC();
        System.out.println("HDFC ROI: " + h.ROI());
    }
}
