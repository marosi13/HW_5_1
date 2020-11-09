public class Main {
 public static void main(String[] args) {
  BonusService service = new BonusService();

  long amount = 1000000_60;
  boolean registered = true;

  long actual = service.calculate(amount, registered);

 }
}

class BonusService {
  public long calculate(long amount, boolean registered) {
   int percent = registered ? 3 : 1;
   long bonus = amount * percent / 100 / 100;
   long limit = 500;
   if (bonus > limit) {
    bonus = limit;
   }
 return bonus;
 }
}