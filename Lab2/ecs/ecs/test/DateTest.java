import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DateTest {
  @Test
  void nextDate_0() {
    Date d = new Date(2022, 1, 1);
    assertEquals(new Date(2022, 1, 2), d.nextDate());
  }
  @Test
  void nextDate_1() {
    Date d = new Date(2022, 2, 28);
    assertEquals(new Date(2022, 3, 1), d.nextDate());
  }
  @Test
  void nextDate_2() {
    Date d = new Date(2022, 12, 31);
    assertEquals(new Date(2023, 1, 1), d.nextDate());
  }
  @Test
  void nextDate_3() {
    Date d = new Date(2023, 5, 15);
    assertEquals(new Date(2023, 5, 16), d.nextDate());
  }
  @Test
  void nextDate_4() {
    Date d = new Date(2023, 6, 1);
    assertEquals(new Date(2023, 6, 2), d.nextDate());
  }
  @Test
  void nextDate_fail16() {
    assertThrows(IllegalArgumentException.class, () -> new Date(2022, 2, 29));
  }

  @Test
  void nextDate_fail17() {
    assertThrows(IllegalArgumentException.class, () -> new Date(2022, 13, 1));
  }

  @Test
  void nextDate_fail18() {
    assertThrows(IllegalArgumentException.class, () -> new Date(-2022, 5, 1));
  }

  @Test
  void nextDate_fail19() {
    assertThrows(IllegalArgumentException.class, () -> new Date(2022, -5, 1));
  }

  @Test
  void nextDate_fail20() {
    assertThrows(IllegalArgumentException.class, () -> new Date(2022, 5, -1));
  }
}