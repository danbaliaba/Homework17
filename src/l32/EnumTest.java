package l32;

enum MoonPhases {

    NewMoon("\uD83C\uDF11"),
    WaxingCrescent("\uD83C\uDF12"),
    FirstQuarter("\uD83C\uDF13"),
    WaxingGibbous("\uD83C\uDF14"),
    FullMoon("\uD83C\uDF15"),
    WaningGibbous("\uD83C\uDF16"),
    LastQuarter("\uD83C\uDF17"),
    WaningCrescent("\uD83C\uDF18");
    private final String status;

    MoonPhases(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return this.status;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("These are Moon Phases : \n");
        System.out.print(MoonPhases.NewMoon + ", ");
        System.out.print(MoonPhases.WaxingCrescent + ", ");
        System.out.print(MoonPhases.FirstQuarter + ", ");
        System.out.print(MoonPhases.WaxingGibbous + ", ");
        System.out.print(MoonPhases.FullMoon + ", ");
        System.out.print(MoonPhases.WaningGibbous + ", ");
        System.out.print(MoonPhases.LastQuarter + ", ");
        System.out.print(MoonPhases.WaningCrescent);

    }

}
