public class lab1 {
    public static void main(String[] args) {
        final double acc = -9.81;
        double initial_position, velocity, time, final_destination;
        initial_position = 0;
        velocity = 0;
        time = 10;
        final_destination = 0.5 * acc * time * time + velocity * time + initial_position;
        System.out.printf("the position is: %.1f m .", final_destination);
    }
}
