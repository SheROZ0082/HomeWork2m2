public class BMW extends CAR {
    private String driveSound;
    private String newSound;

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    @Override
    String drive() {
        return getDriveSound();
    }

    @Override
    String getNewSound() {
        return newSound;
    }

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }
}