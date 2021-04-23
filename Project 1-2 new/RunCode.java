public class RunCode {

    private static double a = 2;
    private static double b = 5;

    private static final double[] list = {a, b};

    public static void main(String[] args) {
        ODESolver solver = new ODESolver(600); // 6000
        ProbeSimulator probeSimulator = new ProbeSimulator(solver.getStates(), 600);

        Frame frame = new Frame(solver.getStates(), probeSimulator.getCoordinatesProbe());
    }

}
