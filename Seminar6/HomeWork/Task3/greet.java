package Seminar6.HomeWork.Task3;

public class greet {

    public Greeter greeter;

    public greet(Greeter greeter) {
        this.greeter = greeter;
    }

    public String greet() {
        if (this.greeter.getFormality().equals("formal")) {
            return "Good evening, sir.";
        } else if (this.greeter.getFormality().equals("casual")) {
            return "Sup bro?";
        } else if (this.greeter.getFormality().equals("intimate")) {
            return "Hello Darling!";
        }
        return "Hello.";
    }
}