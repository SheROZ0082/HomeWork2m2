public class Mersedes extends CAR {

    private String driveSound;
    private String newSound;

    @Override
    String drive() {
        return getDriveSound();
    }

    @Override
    String getNewSound() {
        return newSound;
    }


    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }
}
