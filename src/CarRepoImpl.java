public class CarRepoImpl implements CarRepo {
    @Override
    public void newSound(CAR car) {
        System.out.println(car.getNewSound());
    }
}
