public class Road {
    public static void main() {
        CarRepoImpl carRepoImpl = new CarRepoImpl();
        BMW bmw = new BMW();
        Mersedes mersedes = new Mersedes();
        mersedes.setDriveSound("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR, TAHTAHTAHTAH");
        bmw.setDriveSound("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
        System.out.println("Mersedes sound: " + mersedes.getDriveSound());
        System.out.println("BMW sound: " + bmw.getDriveSound());
        mersedes.setNewSound("Mersedes new sound: " + "PRPPRPRPRPRPRPRPRPRPRPRPRPRPR");
        carRepoImpl.newSound(mersedes);
        bmw.setNewSound("BMW new sound: " + "GUGUGUGUGUGUGUGUGUGUG");
        carRepoImpl.newSound(bmw);
    }

    public static String driveACar(CAR car) {
        return car.drive();
    }
}

