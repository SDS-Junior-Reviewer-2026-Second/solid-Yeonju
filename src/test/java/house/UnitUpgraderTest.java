package house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitUpgraderTest {
    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        PenthouseUpgrader upgrader = new PenthouseUpgrader();
        upgrader.upgrade(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();
        PenthouseUpgrader upgrader = new PenthouseUpgrader();
        upgrader.upgrade(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        StudioUpgrader upgrader = new StudioUpgrader();
        upgrader.upgrade(studio);

        assertEquals(590, studio.squareFootage);
    }

    @Test
    public void testUpgraderDoesntAddBedroomToStudios() {
        Studio studio = new Studio();
        StudioUpgrader upgrader = new StudioUpgrader();
        upgrader.upgrade(studio);

        assertEquals(0, studio.numberOfBedrooms);
    }
}
