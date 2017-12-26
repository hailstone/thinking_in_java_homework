package exercises.chapter7_polymorphism.ex16;


class AlertStatus {
    public void alert() {
    }
}

class NormalStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("normal");
    }
}

class AlarmStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("alarm");
    }
}

class DangerStatus extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("danger");
    }
}

class Starship {
    private AlertStatus alertStatus = new NormalStatus();

    public void changeStatus(AlertStatus status) {
        this.alertStatus = status;
    }

    public void performAlert() {
        alertStatus.alert();
    }
}

public class App {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.performAlert();

        starship.changeStatus(new DangerStatus());
        starship.performAlert();

        starship.changeStatus(new AlarmStatus());
        starship.performAlert();
    }
}
