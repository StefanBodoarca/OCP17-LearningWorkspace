package nestedclasses;

public class AnonymousClassExample {
    /*
     - anonymous class = specialized form of a local class that does not have a name
     - anonymous classes are required to extend an existing class or implement an existing interface
     */

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    interface SaleTodayOnlyInterface {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };

        //the same as SaleTodayOnlyInterface saleFromInterface = () -> 4;
        SaleTodayOnlyInterface saleFromInterface = new SaleTodayOnlyInterface() { //this is an instance of a class (not an interface)
            @Override
            public int dollarsOff() {
                return 4;
            }
        };
        return basePrice - saleFromInterface.dollarsOff();
    }

    public int pay() {
        return admission1(5, new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 0;
            }
        });
    }

    public int admission1(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}
