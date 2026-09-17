package house;

public class PenthouseUpgrader extends UnitUpgrader {
    public void upgradeBedRoomNumber(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }

    public void upgrade(PenthouseSuite penthouse) {
        upgradeFootage(penthouse);
        upgradeBedRoomNumber(penthouse);
    }
}
